package lang

import groovy.transform.ToString

class GroovyObjects {
    static void main(String[] args) {
        def cat = new Animal("Cat", "Meow")
        println cat

        cat.run()
        cat.makeSound()

        cat.setSound("Mwwwoowow")
        cat.makeSound()

        def semanticCat = new Cat("Dice")
        semanticCat.run()
        semanticCat.makeSound()
        semanticCat.play()

        def dog = new Dog("Red")
        dog.run()
        dog.makeSound()
        dog.printColor()
    }
}

@ToString(includeNames = true, includeFields = true)
class Animal {
    def name
    def sound

    Animal(name, sound) {
        this.name = name
        this.sound = sound
    }

    def run() {
        println("$name runs")
    }

    def makeSound() {
        println("$name says $sound")
    }
}

class Dog extends Animal {
    def color

    Dog(color) {
        super("Dog", "Au au")
        this.color = color
    }

    def printColor() {
        println("$name has $color color")
    }
}

class Cat extends Animal {
    def toy

    Cat(toy) {
        super("Cat", "Semantic meoooow")
        this.toy = toy
    }

    def play() {
        println("$name playing with $toy")
    }
}
