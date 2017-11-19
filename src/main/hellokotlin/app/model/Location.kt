package app.model

import javax.persistence.Embeddable

@Embeddable
data class Location(val title: String)