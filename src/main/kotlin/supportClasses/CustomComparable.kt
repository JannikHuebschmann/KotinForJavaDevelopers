package supportClasses

class CustomComparable: Comparable<CustomComparable> {
    override fun compareTo(other: CustomComparable): Int {
        return 1
    }
}