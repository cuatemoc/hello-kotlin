package playground.delegates

import kotlin.reflect.KProperty

class DoerDelegatedProperty {

    operator fun getValue(thisRef: Any?, property: KProperty<*>): String {
        return "$thisRef property delegated: ${property.name}"
    }

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: String){
        println("assigning $value to property ${property.name} of $thisRef")
    }
}