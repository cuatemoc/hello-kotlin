package app.model

import javax.persistence.*

@Entity
@Table(name="tickets")
data class TicketEntity(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Int? = null,

        @OneToOne
        @JoinColumn(name = "fromLocation")
        val fromLocation: Location? = null,

        @OneToOne
        @JoinColumn(name = "toLocation")
        val toLocation: Location? = null,

        val price: Price? = null) {

    @Suppress("unused")
    private constructor() : this(price = Price())

    fun toDto(): TicketDto = TicketDto(
            id = this.id!!,
            fromLocation = this.fromLocation,
            toLocation = this.toLocation,
            price = this.price)

    companion object {

        fun fromDto(dto: TicketDto) = TicketEntity(
                id = dto.id!!,
                fromLocation = dto.fromLocation,
                toLocation = dto.toLocation,
                price = dto.price
                )

        fun fromDto(dto: CreateTicketDto) = TicketEntity(
                fromLocation = dto.fromLocation,
                toLocation = dto.toLocation,
                price = dto.price)

        fun fromDto(dto: UpdateTicketDto, defaultCity: TicketEntity) = TicketEntity(
                id = defaultCity.id!!,
                price = dto.price ?: defaultCity.price
               )
    }
}

class UpdateTicketDto(
        val price: Price? = Price()) {
}

class CreateTicketDto(
        val fromLocation: Location? = null,
        val toLocation: Location? = null,
        val price: Price? = Price()){

}

data class TicketDto(
        @Id val id: Int? = null,
        val fromLocation: Location? = null,
        val toLocation: Location? = null,
        val price: Price? = Price()) {

}