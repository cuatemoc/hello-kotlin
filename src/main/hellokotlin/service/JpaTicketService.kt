package service

import model.CreateTicketDto
import model.TicketDto
import model.TicketEntity
import model.UpdateTicketDto
import org.springframework.stereotype.Service
import javax.transaction.Transactional

@Service
@Transactional
internal class JpaTicketService(val ticketRepository: TicketRepository) : TicketService {

override fun retrieveTicket(id: Long) : TicketDto? {
        return ticketRepository.findOne(id)?.toDto()
    }

    override fun retrieveTickets() : List<TicketDto> {
        return ticketRepository.findAll().map { it.toDto() }
    }

    override fun addTicket(ticket: CreateTicketDto) : TicketDto {
        return ticketRepository.save(TicketEntity.fromDto(ticket)).toDto()
    }

    override fun updateTicket(id: Long, ticket: UpdateTicketDto): TicketDto? {
        val currentCity = ticketRepository.findOne(id)
        return if (currentCity != null) ticketRepository.save(TicketEntity.fromDto(ticket, currentCity)).toDto()
        else null
    }
}