package flow

class GroovyLoops {
    static void main(String[] args) {
        int i = 0

        while(i < 10) {
            if(i - 3 == 5) {
                println("Hehe: " + i++)
                continue
            }

            println(i)
            ++i
        }

        i = 0

        do {
            println(i)
            ++i
        } while(i < 5)

        println()

        for(i = 0; i < 10; i++) {
            println(i)
        }

        println()

        for(j in 2..8) {
            println(j)
        }

        println()
        def names = ["Keyboard", "Mouse", "Monitor"]

        for(String item in names) {
            println(item)
        }

        println()

        for(String item : names) {
            println(item)
        }

        println()
        def users = [
                205: 'Giver',
                206: 'LaVolpe',
                207: 'Random User'
        ]

        for(user in users) {
            println("$user.value = $user.key")
        }
    }
}
