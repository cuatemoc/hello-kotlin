package playground.classes

class ClassHavingCompanion {

    val inVal: String = "I have a companion"

    companion object : CompanionInterface {
        override fun doSomething(): String {
            return "Doing my companion stuff"
        }

        fun otherCompanionFunction(): String {
            return "other companion stuff"
        }

    }

    fun fromCompanion(): String {
        return Companion.doSomething()
    }
}