package strings

class GroovyFormat {
    static void main(String[] args) {
        def str = "Television"

        println("The string is $str")
        println("The string x2 is ${str * 2}")
        printf("The string is %s\n", str)

        println()
        printf("%-10s %d %.2f %10s end\n", ['Giver', 32, 4.8273, 'Simple'])
    }
}
