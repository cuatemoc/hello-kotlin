package playground.classes

class SampleClass(firstProperty: String) {

    val someProperty: String = firstProperty.toUpperCase()

    var otherProperty: String

    var testProperty: String = ""
        get() {
            if(field.isNullOrBlank())
              return  "test"
            else
            return  field.toUpperCase()
        }
        set(value) {
            if (value.isNotEmpty()) {
                field = value.toLowerCase()
            }
        }


    init {
        //TODO("As no code is allowed in default constructor we need init block")
        otherProperty = "default"
    }

    constructor(firstProperty: String, secondProperty: String) : this(firstProperty) {
        otherProperty = secondProperty
    }


}