package playground.classes

class SampleClass (firstProperty: String){

    val someProperty: String
    var otherProperty: String

    init {
        //TODO("As no code is allowed in default constructor we need init block")
        someProperty = firstProperty.toUpperCase()
        otherProperty = "default"
    }

    constructor(firstProperty: String, secondProperty: String) : this(firstProperty){
        otherProperty = secondProperty
    }
}