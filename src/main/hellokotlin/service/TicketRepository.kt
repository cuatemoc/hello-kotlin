package service

import model.TicketEntity
import org.springframework.data.jpa.repository.JpaRepository
import javax.transaction.Transactional

@Transactional(Transactional.TxType.MANDATORY)
internal interface TicketRepository : JpaRepository<TicketEntity, Long>