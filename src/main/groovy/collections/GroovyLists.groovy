package collections

class GroovyLists {
    static void main(String[] args) {
        def numbers = [10, 20, 34, 12, 129, 100]

        println("The 3rd item is " + numbers[2])
        println("The 4th item is " + numbers.get(3))

        println()
        println("The length is " + numbers.size())

        numbers.add(15)
        numbers << 250

        println()
        println(numbers)

        numbers + [256, 512]
        numbers - [512]

        println(numbers)

        println()
        println("Is empty: " + numbers.isEmpty())

        println()
        println("3rd to 5th: " + numbers[2..4])

        println()
        println("Intersects 34, 12: " + numbers.intersect([12, 34]))

        println()
        println("Intersects 12, 34, 25: " + numbers.intersect([34, 12]))

        println()
        println("Reverse: " + numbers.reverse())
        println("Sort: " + numbers.sort())

        println()
        println("Last: " + numbers.last())
        println("First: " + numbers.first())

        println()
        println("Last (pop): " + numbers.pop())
        println("Push 3: " + numbers.push(3))
        println("Push 10: " + numbers.push(10))

        println()
        println(numbers)
    }
}
