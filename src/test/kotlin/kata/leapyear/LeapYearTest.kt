package kata.leapyear

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class LeapYearTest {

    @Test
    fun `should return true when year is divisible by 4`() {
        // Given
        val year = 2024

        // When
        val result = LeapYear.isLeapYear(year)

        // Then
        assertTrue(result)
    }

    @Test
    fun `should return false when year is not divisible by 4`() {
        // Given
        val year = 2023

        // When
        val result = LeapYear.isLeapYear(year)

        // Then
        assertFalse(result)
    }

    @Test
    fun `should return false when year is divisible by 100`() {
        // Given
        val year = 1900

        // When
        val result = LeapYear.isLeapYear(year)

        // Then
        assertFalse(result)
    }

    @Test
    fun `should return true when year is divisible by 400`() {
        // Given
        val year = 2000

        // When
        val result = LeapYear.isLeapYear(year)

        // Then
        assertTrue(result)
    }
}
