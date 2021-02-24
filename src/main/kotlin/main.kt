import kotlinx.browser.document
import org.w3c.dom.events.Event

fun main() {
    document
        .getElementById("generate-btn")
        ?.addEventListener("click", ::setNewName)

    setNewName()
}

fun setNewName(event: Event? = null) {
    val name = generateName()

    document
        .getElementById("generated-name")
        ?.innerHTML = name

    console.info("Generated: \"$name\"")
}
