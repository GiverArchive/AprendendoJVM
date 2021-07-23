package flow

class GroovyConditionals {
    static void main(String[] args) {
        def age = 15

        println()
        println("Age: " + age)
        print("You is ")

        if(age < 12) {
            println("Child!")
        }
        else if(age <= 18) {
            println("Young")
        }
        else {
            println("Normal Person")
        }

        println()

        boolean bool = true
        println(bool ? "Yes" : "No")

        bool = false
        println(bool ? "Yes" : "No")

        def value = 10

        switch (value) {
            case 0:
                println("Zero")
                break
            case 5:
                println("Five")
                break
            default:
                println("Not 0, not 5")
                break
        }

        println()
        value = 13

        switch (value) {
            case 0..10:
                println("Between 0-10")
                break
            case 11..15:
                println("Between 11-15")
                break
            default:
                println("Higher than 15!")
                break
        }
    }
}
