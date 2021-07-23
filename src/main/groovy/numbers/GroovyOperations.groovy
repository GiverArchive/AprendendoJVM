package numbers

class GroovyOperations {
    static void main(String[] args) {
        println("Integers")
        println("3 + 4 = " + (3 + 4))
        println("3 - 4 = " + (3 - 4))
        println("3 * 4 = " + (3 * 4))
        println("3 / 4 = " + (3 / 4))
        println("3 / 4 = " + (3.intdiv(4)))
        println("3 % 4 = " + (3 % 4))
        println()
        println("Float points")
        println("3.4 + 4.5 = " + (3.4.plus(4.5)))
        println("3.4 - 4.5 = " + (3.4.minus(4.5)))
        println("3.4 * 4.5 = " + (3.4.multiply(4.5)))
        println("3.4 / 4.5 = " + (3.4 / 4.5))
        println()
        println("Operator priority")
        println("3 + 5 * 4 / 2 - 4 = " + (3 + 5 * 4 / 2 - 4))
        println("(3 + 5) * 4 / 2 - 4 = " + ((3 + 5) * 4 / 2 - 4))
        println("3 + 5 * 4 / (2 - 4) = " + (3 + 5 * 4 / (2 - 4)))
    }
}
