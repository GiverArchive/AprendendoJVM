package io

class InOut {
    static void main(String[] args) {
        print("What's your nickname? ")
        def nick = System.console().readLine()

        println("Welcome, $nick!")

        println()
        print("Please type a number: ")
        def num1 = System.console().readLine().toDouble()

        println()
        print("Please type another number: ")
        def num2 = System.console().readLine().toDouble()

        println()
        printf("%.2f + %.2f = %.2f\n", num1, num2, num1 + num2)
    }
}
