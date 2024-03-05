package kata.leapyear

class LeapYear {


    companion object {
        fun isLeapYear(i: Int): Boolean {
            return i % 4 == 0 && i % 100 != 0 || i % 400 == 0
        }
    }
}
