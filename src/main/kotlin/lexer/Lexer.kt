package lexer

class Lexer(private val text: String) {

    companion object {
        val MATCHING_REGEX = TokenType.values().joinToString("") { "|(?<${it.name}>${it.regex})" }.substring(1).toRegex()
    }

    fun lex(): List<Token> {

        val matchResults = MATCHING_REGEX.toPattern().matcher(text)
        val tokens = mutableListOf<Token>()

        while (matchResults.find()) {
            for (tokenType in TokenType.values()) {
                val group = matchResults.group(tokenType.name) ?: continue
                tokens.add(Token(tokenType, group.substringBefore("=")))
            }
        }

        return tokens

    }

}
