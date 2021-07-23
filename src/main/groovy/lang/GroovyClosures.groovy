package lang

class GroovyClosures {
    static void main(String[] args) {
        def getFactorial = { num -> (num <= 1 ? 1 : num * call(num -1)) }
        def fac = getFactorial 8

        println("Factorial 8! is " + fac)

        def teleport = { user -> println("Teleporting $user") }
        teleport("Giver")

        println()

        def list = [1, 2, 3, 4, 5, 6]
        list.each { println(it) }

        println()

        def users = [
                "Giver": 22,
                "LaVolpe": 15,
                "Random User": 125
        ]

        users.each {
            println("User: $it.key has $it.value points!")
        }

        println()

        def nums = [19, 12, 14, 15, 97, 82]
        nums.each { num -> if(num % 2 == 0) println(num) }

        println()

        def names = ["Giver", "LaVolpe", "Random User", "Forsaken"]

        def match1 = names.find {
            it.contains("o")
        }

        def match2 = names.findAll {
            it.contains("er")
        }

        println(match1)
        println(match2)

        def items = [10, 20, 30, 40, 50, 60]

        println()
        println("> 50 any " + items.any {it > 50})
        println("> 10 every " + items.every{it > 10})
        println("Double: " + items.collect { it * 2 })

        def isEven = { num -> num % 2 == 0 }
        def numbers = [83, 12, 564, 62, 63, 31, 87, 234]

        def edited = listEdit(numbers, isEven)

        println()
        println("Evens: " + edited)
    }

    static def listEdit(list, closure) {
        list.findAll(closure)
    }
}
