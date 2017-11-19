package app.service

import app.model.TicketEntity
import org.springframework.data.jpa.repository.JpaRepository
import javax.transaction.Transactional

//@RepositoryRestResource
@Transactional(Transactional.TxType.MANDATORY)
interface TicketRepository : JpaRepository<TicketEntity, Long>