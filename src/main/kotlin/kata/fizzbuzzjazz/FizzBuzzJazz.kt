package kata.fizzbuzzjazz

class FizzBuzzJazz {

    companion object {

        val THREE = 3
        val FIVE = 5
        val SEVEN = 7
        val FIZZ = "fizz"
        val BUZZ = "buzz"
        val JAZZ = "jazz"

        private val rules = mapOf(
            Pair(THREE, FIZZ),
            Pair(FIVE, BUZZ),
            Pair(SEVEN, JAZZ)
        )

        private fun Int.checkRule(divisor: Int, translation: String) =
            if (this % divisor == 0)
                translation
            else
                ""

        fun fizzBuzzJazzConvert(number: Int): String {
            var result = ""

            rules.map { rule -> result += number.checkRule(rule.key, rule.value) }

            return if (result.isEmpty())
                number.toString()
            else
                result
        }

        fun fizzBuzzJazzTranslate(number: Int) =
            number.toString().mapNotNull { digit ->
                rules[digit.digitToInt()]
            }.joinToString("")

        fun fizzBuzzJazzFull(number: Int): String =
            fizzBuzzJazzConvert(number) + fizzBuzzJazzTranslate(number)
    }
}
