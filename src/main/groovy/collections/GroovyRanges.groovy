package collections

class GroovyRanges {
    static void main(String[] args) {
        def oneToTen = 1..10
        def tenToOne = 10..1
        def aToZ = 'a'..'z'
        def ztoA = 'z'..'a'

        println("1..10: " + oneToTen.toList())
        println("10..1: " + tenToOne.toList())
        println("a..z: " + aToZ.toList())
        println("z..a: " + ztoA.toList())

        println()
        println("1..10 size: " + oneToTen.size())
        println("1..10 3rd: " + oneToTen[2])

        println()
        println("1..10 contains 8: " + oneToTen.contains(8))
        println("1..10 contains 12: " + oneToTen.contains(12))

        println()
        println("1..10 last: " + oneToTen.getTo())
        println("1..10 first: " + oneToTen.getFrom())
    }
}
