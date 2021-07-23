package flow

class GroovyRelationalLogic {
    static void main(String[] args) {
        def value = 10

        println("Value == 10: " + (value == 10))
        println("Value != 10: " + (value != 10))
        println("Value >= 10: " + (value >= 10))
        println("Value <= 10: " + (value <= 10))
        println("Value < 10: " + (value < 10))
        println("Value > 10: " + (value > 10))

        println()
        println("true && true = " + (true && false))
        println("true && false = " + (true && false))
        println("false && true = " + (false && true))
        println("false && false = " + (false && true))
        println("true || true = " + (true || true))
        println("true || false = " + (true || false))
        println("false || true = " + (false || true))
        println("false || false = " + (false || false))

        println()
        println("10 == 10: " + (10 == 10))
        println("10 != 10: " + (10 != 10))
        println("10 == 12: " + (10 == 12))
        println("10 != 12: " + (10 != 12))
    }
}
