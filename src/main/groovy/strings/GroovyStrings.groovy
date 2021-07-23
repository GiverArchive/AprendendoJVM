package strings

class GroovyStrings {
    static void main(String[] args) {
        def name = 'Giver'

        println("Name: " + name)
        println("Length: " + name.length())

        def text = "The mouse is broken"

        println()
        println("Text: " + text)

        println()
        println("Repeat")
        println(text * 2)

        println()
        println("Text - mouse: " + (text - "mouse"))

        println()
        println("Text + keyboard: " + (text + "keyboard"))

        println()
        println("Text.split(' '): " + text.split(' '))

        println()
        println("Text.toList(): " + text.toList())

        println()
        println("Text.replace('o', 'f'): " + text.replace('o', 'f'))
        println("Text.replaceAll('o', 'f'): " + text.replace('o', 'f'))

        println("Text Uppercase: " + text.toUpperCase())
        println("Text Lowercase: " + text.toLowerCase())

        println()
        println("Mouse <=> Keyboard: " + ('Mouse' <=> 'Keyboard'))
        println("Keyboard <=> Mouse: " + ('Keyboard' <=> 'Mouse'))
        println("Mouse <=> Mouse: " + ('Mouse' <=> 'Mouse'))
        println("Keyboard <=> Keyboard: " + ('Keyboard' <=> 'Keyboard'))
    }
}
