package playground.delegates

class DoerImpl : Doer {
    override fun doStuff(a: Int, b: Int): Int {
        return a.times(b).plus(b.div(a))
    }
}