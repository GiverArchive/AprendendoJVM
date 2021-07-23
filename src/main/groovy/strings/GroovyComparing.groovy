package strings

class GroovyComparing {
    static void main(String[] args) {
        println("Giver == Giver " + ("Giver".equals("Giver")))
        println("Giver == giver " + ("Giver".equalsIgnoreCase("giver")))

        def mouse = "Mouse"
        println("Mouse == Mouse " + (mouse == "Mouse"))
        println("Mouse === Mouse " + (mouse === "Mouse"))
        println("Mouse != Keyboard: " + ('Mouse' != 'Keyboard'))
    }
}
