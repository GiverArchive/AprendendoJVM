class GroovyIncrementDecrement {
    static void main(String[] args) {
        println("Increment and Decrement")
        def value = 10
        println("value: $value")
        println("++value: " + ++value)
        value = 10
        println("value++: " + value++)
        value = 10
        println("--value: " + --value)
        value = 10
        println("value--: " + value--)
    }
}
