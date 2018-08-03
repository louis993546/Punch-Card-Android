package io.github.louistsaitszho.punchcard

import org.threeten.bp.ZonedDateTime
import java.util.*

/**
 *
 */
data class Card(val id: UUID, val shifts: List<Shift>, val name: String)

/**
 *
 */
data class Shift(val id: UUID, val startTime: ZonedDateTime, val endTime: ZonedDateTime?) {
    fun onGoing(): Boolean = endTime == null
}