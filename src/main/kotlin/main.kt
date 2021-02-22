import kotlinx.browser.document;
import org.w3c.dom.events.Event
import kotlin.random.Random

data class Word(
    val singular: String,
    private val pluralSuffix: String = "s",
    private val pluralOverride: String? = null
) {
    val plural: String
        get() {
            return pluralOverride ?: singular + pluralSuffix
        }
}

val words = setOf(
    Word("Adventure"),
    Word("Age"),
    Word("Dominion"),
    Word("Dynasty", pluralOverride = "Dynasties"),
    Word("Eternal"),
    Word("Empire"),
    Word("Endless", ""),
    Word("Epic"),
    Word("Fire"),
    Word("Game"),
    Word("Glory", pluralOverride = "Glories"),
    Word("Gun"),
    Word("Hero", "es"),
    Word("Iron"),
    Word("Ice"),
    Word("Kingdom"),
    Word("Legend"),
    Word("Lord"),
    Word("Magic", ""),
    Word("Mask"),
    Word("Pharaoh"),
    Word("Raid"),
    Word("Rise", ""),
    Word("Road"),
    Word("Scroll"),
    Word("Seven", ""),
    Word("Shadow"),
    Word("Summoner"),
    Word("War")
)

val patterns = arrayOf(
    "{s} {p}",
    "{s} of {p}",
    "{s}'s {s}",
    "{s}: {s} {p}",
    "{s} of {p}: {s} and {s}",
    "{s} {s}: {s} of {s}"
)

fun generateName(): String {
    var name = patterns[Random.nextInt(patterns.size)]

    val words = words.toMutableList()

    do {
        val token = name.findAnyOf(arrayListOf("{s}", "{p}")) ?: break

        val word = words.removeAt(Random.nextInt(words.size))

        val tokenReplace = if (token.second[1] == 's') {
            word.singular
        } else {
            word.plural
        }

        name = name.substring(0, token.first) +
            tokenReplace +
            name.substring(token.first + token.second.length)
    } while (true)

    return name;
}

fun main() {
    val setNewName = { _: Event? ->
        document.getElementById("mobile-game-name")?.innerHTML = generateName()
    }

    document
        .getElementById("generate-btn")
        ?.addEventListener("click", setNewName)

    setNewName(null)
}
