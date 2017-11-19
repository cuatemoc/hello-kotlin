package app.controllers

import app.model.CreateTicketDto
import app.model.TicketDto
import app.service.TicketService
import org.springframework.web.bind.annotation.*

@RestController
class TicketController(val ticketService: TicketService) {

    @GetMapping("/tickets")
    fun getTickets(): List<TicketDto> = ticketService.retrieveTickets()

    @PostMapping("/tickets")
    @ResponseBody
    fun addTickets(@RequestBody createTicketDto: CreateTicketDto): TicketDto {
        return ticketService.addTicket(createTicketDto)
    }
}