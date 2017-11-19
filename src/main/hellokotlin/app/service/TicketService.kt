package app.service

import app.model.CreateTicketDto
import app.model.TicketDto
import app.model.UpdateTicketDto
import org.springframework.stereotype.Service

@Service
interface TicketService {
    fun retrieveTicket(id: Long): TicketDto?

    fun retrieveTickets(): List<TicketDto>

    fun addTicket(ticket: CreateTicketDto): TicketDto

    fun updateTicket(id: Long, ticket: UpdateTicketDto): TicketDto?
}