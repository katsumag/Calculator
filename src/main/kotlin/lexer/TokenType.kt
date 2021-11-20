package lexer

enum class TokenType(val regex: Regex) {

    NEWLINE("\n|[\r\n]".toRegex()),
    EOF("$(?![\r\n])".toRegex()),
    WHITESPACE(" +".toRegex()),
    MULTIPLY("\\*".toRegex()),
    DIVIDE("/".toRegex()),
    MODULUS("%".toRegex()),
    ADD("\\+".toRegex()),
    SUBTRACT("-".toRegex()),
    EQUALS("=".toRegex()),
    LPAREN("\\(".toRegex()),
    RPAREN("\\)".toRegex()),
    LBRACE("\\{".toRegex()),
    RBRACE("}".toRegex()),
    LTRIANGLE("<".toRegex()),
    RTRIANGLE(">".toRegex()),
    POWER("\\^".toRegex()),
    NUMBER("[+-]?\\d+\\.?\\d*+".toRegex());

}