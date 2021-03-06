import kotlin.random.Random

val patternTokens = mapOf<String, (Word) -> String>(
    "{c}" to Word::letterCount,
    "{s}" to Word::singular,
    "{sl}" to Word::singularLowercase,
    "{p}" to Word::plural,
    "{pl}" to Word::pluralLowercase
)

data class Word(
    val singular: String,
    private val pluralSuffix: String = "s",
    private val pluralOverride: String? = null
) {
    val letterCount: String
        get() {
            return singular.length.toString()
        }

    @get:OptIn(ExperimentalStdlibApi::class)
    val singularLowercase: String
        get() {
            return singular.lowercase()
        }

    val plural: String
        get() {
            return pluralOverride ?: singular + pluralSuffix
        }

    @get:OptIn(ExperimentalStdlibApi::class)
    val pluralLowercase: String
        get() {
            return plural.lowercase()
        }
}

// Regexes to support performing proper 1st/2nd/3rd replacements, and other small fix-ups
val finalizingReplacements = arrayOf(
    // Fix position identifiers
    Regex(""" ([02-9]*)1th""") to " $11st",
    Regex(""" ([02-9]*)2th""") to " $12nd",
    Regex(""" ([02-9]*)3th""") to " $13rd",

    // Remove double numerical
    Regex("""[0-9]+ (Seven|Thirteen)""") to "$1"
)

fun generateName(): String {
    // Start the name from a pattern
    var name = patterns[Random.nextInt(patterns.size)]

    // Make a copy of the word list, so words can be removed and won't appear twice in this generation run
    val words = words.toMutableList()

    do {
        // Find the next token -- exit the loop if there are no more
        val token = name.findAnyOf(patternTokens.keys) ?: break

        // Grab a random word out of the list, and remove it from the list so it won't show up again
        val word = words.removeAt(Random.nextInt(words.size))

        // Determine which kind of token was used, and invoke its associated function/getter
        val tokenReplace = patternTokens[token.second]?.invoke(word)

        // Reconstruct the string, replacing the token with the word
        name = name.substring(0, token.first) +
            tokenReplace +
            name.substring(token.first + token.second.length)
    } while (true)

    finalizingReplacements.forEach {
        name = name.replace(it.first, it.second)
    }

    return name
}
