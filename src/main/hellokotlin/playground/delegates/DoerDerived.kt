package playground.delegates

import kotlin.properties.Delegates

class DoerDerived(delegate: Doer) : Doer by delegate {
    val someOtherStuff: String = "anything here"

    var delegatedProperty: String by DoerDelegatedProperty()

    val lazyDelegated: Int by lazy {
        println("computed only once")
        1
    }

    var observableDelegated: String by Delegates.observable("default"){
        property, oldValue, newValue ->
        println("changing $property from $oldValue to $newValue")
    }
}