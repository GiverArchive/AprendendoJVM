package collections

class GroovyMaps {
    static void main(String[] args) {
        def giver = [
                'name': 'Giver',
                'age': 18,
                'langs': ['Java', 'Kotlin', 'Groovy']
        ]

        println("Name: " + giver['name'])
        println("Age: " + giver.get('age'))
        println("Languages: " + giver['langs'])

        giver.put('Mouse', 'Not Gamer')
        giver['langs'] << "Python"

        println()
        println(giver)

        println()
        println("Has Keyboad? " + giver.containsKey("Keyboard"))

        println()
        println("Size: " + giver.size())
    }
}
