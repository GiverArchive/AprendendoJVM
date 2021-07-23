package lang

class GroovyMethods {
    static void main(String[] args) {
        hello()
        hello2()

        new GroovyMethods().notStaticHello()
        new GroovyMethods().privateMethod()

        parametrized("Cake")
        println("The return is: ${returnsString()}")

        defaultValue("Passed")
        defaultValue()

        vargargs(10, 20, 30)

        println("Fatorial 5! is: " + fatorial(5))
    }

    static def fatorial(num) {
        if(num <= 1) {
            return 1
        }
        else {
            return num * fatorial(num -1)
        }
    }

    static def defaultValue(param = "Default") {
        println("Param is $param")
    }

    static def parametrized(String param) {
        println("Hi!, my parameter is $param")
    }

    static def returnsString() {
        return "notebook"
    }

    static def vargargs(int... numbers) {
        println("Numbers is " + numbers)
    }

    def notStaticHello() {
        println("Hi, I'm a non static method!")
    }

    private def privateMethod() {
        println("I'm a private non static method!")
    }

    static def hello() {
        println("Hello, I'm a static method!")
    }

    static def hello2() {
        println("Hello, I'm another static method!")
    }
}
