package model

import java.math.BigInteger
import java.util.*
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name="city")
data class TicketEntity(
        @Id val id: Long? = null,
        val from: Location? = null,
        val to: Location? = null,
        val price: Price) {

    @Suppress("unused")
    private constructor() : this(price = Price(BigInteger.ZERO, Currency.getInstance("USD")))

    fun toDto(): TicketDto = TicketDto(
            id = this.id!!,
            from = this.from,
            to = this.to,
            price = this.price)

    companion object {

        fun fromDto(dto: TicketDto) = TicketEntity(
                id = dto.id!!,
                from = dto.from,
                to = dto.to,
                price = dto.price
                )

        fun fromDto(dto: CreateTicketDto) = TicketEntity(
                from = dto.from,
                to = dto.to,
                price = dto.price)

        fun fromDto(dto: UpdateTicketDto, defaultCity: TicketEntity) = TicketEntity(
                id = defaultCity.id!!,
                price = dto.price ?: defaultCity.price
               )
    }
}

class UpdateTicketDto(
        val price: Price) {
}

class CreateTicketDto(
        val from: Location? = null,
        val to: Location? = null,
        val price: Price){
}

data class TicketDto(
        @Id val id: Long? = null,
        val from: Location? = null,
        val to: Location? = null,
        val price: Price) {

}