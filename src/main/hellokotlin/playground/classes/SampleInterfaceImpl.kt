package playground.classes

class SampleInterfaceImpl : SampleInterface, OtherInterface {

    override fun foo(): String {
        return super<OtherInterface>.foo()
    }

    override fun bar(): String {
        return "barImpl"
    }

    override val masterProp: Int
        get() = 1

    override fun masterFun(): String {
        return "Something"
    }
}