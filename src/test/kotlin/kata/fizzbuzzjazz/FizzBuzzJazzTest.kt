package kata.fizzbuzzjazz

import kata.fizzbuzzjazz.FizzBuzzJazz.Companion.fizzBuzzJazzConvert
import kata.fizzbuzzjazz.FizzBuzzJazz.Companion.fizzBuzzJazzFull
import kata.fizzbuzzjazz.FizzBuzzJazz.Companion.fizzBuzzJazzTranslate
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test


class FizzBuzzJazzTest {

    @Nested
    inner class ConvertTest{
        @Test
        fun `should convert 1 to "1"`() {
            val number = 1
            val result = fizzBuzzJazzConvert(number)
            assertEquals("1", result)
        }

        @Test
        fun `should convert 2 to "2"`() {
            val number = 2
            val result = fizzBuzzJazzConvert(number)
            assertEquals("2", result)
        }

        @Test
        fun `should convert 3 to "fizz"`() {
            val number = 3
            val result = fizzBuzzJazzConvert(number)
            assertEquals("fizz", result)
        }

        @Test
        fun `should convert 5 to "buzz"`() {
            val number = 5
            val result = fizzBuzzJazzConvert(number)
            assertEquals("buzz", result)
        }

        @Test
        fun `should convert 6 to "fizz"`() {
            val number = 3 * 2
            val result = fizzBuzzJazzConvert(number)
            assertEquals("fizz", result)
        }

        @Test
        fun `should convert 10 to "buzz"`() {
            val number = 5 * 2
            val result = fizzBuzzJazzConvert(number)
            assertEquals("buzz", result)
        }

        @Test
        fun `should convert 15 to "fizzbuzz"`() {
            val number = 3 * 5
            val result = fizzBuzzJazzConvert(number)
            assertEquals("fizzbuzz", result)
        }

        @Test
        fun `should convert 30 to "fizzbuzz"`() {
            val number = 3 * 5 * 2
            val result = fizzBuzzJazzConvert(number)
            assertEquals("fizzbuzz", result)
        }

        @Test
        fun `should convert 7 to "jazz"`() {
            val number = 7
            val result = fizzBuzzJazzConvert(number)
            assertEquals("jazz", result)
        }

        @Test
        fun `should convert 21 to "fizzjazz"`() {
            val number = 3 * 7
            val result = fizzBuzzJazzConvert(number)
            assertEquals("fizzjazz", result)
        }

        @Test
        fun `should convert 35 to "buzzjazz"`() {
            val number = 5 * 7
            val result = fizzBuzzJazzConvert(number)
            assertEquals("buzzjazz", result)
        }

        @Test
        fun `should convert 105 to "fizzbuzzjazz"`() {
            val number = 3 * 5 * 7
            val result = fizzBuzzJazzConvert(number)
            assertEquals("fizzbuzzjazz", result)
        }
    }

    @Nested
    inner class OccurrenceTest{

        @Test
        fun `should translate 1 to ""`(){
            val number = 1
            val result = fizzBuzzJazzTranslate(number)
            assertEquals("", result)
        }

        @Test
        fun `should translate 2 to ""`(){
            val number = 2
            val result = fizzBuzzJazzTranslate(number)
            assertEquals("", result)
        }

        @Test
        fun `should translate 3 to "fizz"`(){
            val number = 3
            val result = fizzBuzzJazzTranslate(number)
            assertEquals("fizz", result)
        }

        @Test
        fun `should translate 5 to "buzz"`(){
            val number = 5
            val result = fizzBuzzJazzTranslate(number)
            assertEquals("buzz", result)
        }

        @Test
        fun `should translate 7 to "jazz"`(){
            val number = 7
            val result = fizzBuzzJazzTranslate(number)
            assertEquals("jazz", result)
        }

        @Test
        fun `should translate 13 to "fizz"`(){
            val number = 13
            val result = fizzBuzzJazzTranslate(number)
            assertEquals("fizz", result)
        }

        @Test
        fun `should translate 15 to "buzz"`(){
            val number = 15
            val result = fizzBuzzJazzTranslate(number)
            assertEquals("buzz", result)
        }

        @Test
        fun `should translate 33 to "fizzfizz"`(){
            val number = 33
            val result = fizzBuzzJazzTranslate(number)
            assertEquals("fizzfizz", result)
        }

        @Test
        fun `should translate 357 to "fizzbuzzjazz"`(){
            val number = 357
            val result = fizzBuzzJazzTranslate(number)
            assertEquals("fizzbuzzjazz", result)
        }
    }

    @Nested
    inner class FizzBuzzJazzFullTest {

        @Test
        fun `should fully translate 3 to "fizzfizz`() {
            val number = 3
            val result = fizzBuzzJazzFull(number)
            assertEquals("fizzfizz", result)
        }

        @Test
        fun `should fully translate 5 to "buzzbuzz`() {
            val number = 5
            val result = fizzBuzzJazzFull(number)
            assertEquals("buzzbuzz", result)
        }

        @Test
        fun `should fully translate 537 to "fizzbuzzfizzjazz`() {
            val number = 537
            val result = fizzBuzzJazzFull(number)
            assertEquals("fizzbuzzfizzjazz", result)
        }

        @Test
        fun `should fully translate 1 to "1"`() {
            val number = 1
            val result = fizzBuzzJazzFull(number)
            assertEquals("1", result)
        }
    }
}



