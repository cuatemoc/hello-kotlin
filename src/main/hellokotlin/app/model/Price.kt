package app.model

import java.math.BigInteger
import java.util.*
import javax.persistence.Embeddable

@Embeddable
data class Price(val amount: BigInteger, val currency: Currency) {

    constructor() : this(BigInteger.ZERO, Currency.getInstance("USD"))
}