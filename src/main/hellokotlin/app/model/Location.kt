package app.model

import javax.persistence.Entity
import javax.persistence.Id

@Entity
data class Location(
        @Id
        val id: Int? = null,
        val title: String)