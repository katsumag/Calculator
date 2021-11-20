import lexer.Lexer

fun main() {

    println(Lexer("""
        2+2=4
    """.trimIndent()).lex())

}