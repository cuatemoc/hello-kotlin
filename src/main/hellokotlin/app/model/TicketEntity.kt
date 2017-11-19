package app.model

import java.math.BigInteger
import java.util.*
import javax.persistence.*

@Entity
@Table(name="tickets")
data class TicketEntity(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long? = null,
        val from: String? = null,
        val to: String? = null,
        val price: BigInteger? = null) {

    @Suppress("unused")
    private constructor() : this(price = BigInteger.ZERO)

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
        val price: BigInteger? = BigInteger.ZERO) {
}

class CreateTicketDto(
        val from: String? = null,
        val to: String? = null,
        val price: BigInteger? = BigInteger.ZERO){

}

data class TicketDto(
        @Id val id: Long? = null,
        val from: String? = null,
        val to: String? = null,
        val price: BigInteger? = BigInteger.ZERO) {

}