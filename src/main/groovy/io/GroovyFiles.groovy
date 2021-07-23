package io

class GroovyFiles {
    static void main(String[] args) {
        new File("textfile.txt").eachLine {
            println it
        }

        new File("textfile.txt").withWriter('utf-8') {
            it.writeLine "I'm writing"
            it.writeLine "Notebook"
        }

        File file = new File("textfile.txt")
        file.append "This is another line"

        println file.text

        println()
        println("Size: ${file.length()} bytes")
        println("Is File: ${file.isFile()}")
        println("Is Directory: ${file.isDirectory()}")

        def newFile = new File("test.txt")
        newFile << file.text
        newFile.delete()

        println()

        def dirFiles = new File("").listRoots()
        dirFiles.each System.out::println
    }
}
