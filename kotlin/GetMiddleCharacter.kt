fun getMiddleCharacter(word: String): String {
    return word.substring(word.length / 2 + word.length % 2 - 1, word.length / 2 + 1)
}