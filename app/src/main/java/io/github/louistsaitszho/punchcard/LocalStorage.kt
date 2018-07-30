package io.github.louistsaitszho.punchcard

import org.threeten.bp.ZonedDateTime
import java.util.*

interface LocalStorage {
    fun addCardEntity(uuid: UUID, name: String): CardEntity

    fun addShift(cardEntity: CardEntity, startTime: ZonedDateTime): ShiftEntity

    //TODO update card and shift later, they are not as important

    fun getAllCardEntities(): List<CardEntity>

    fun getAllShiftOfCard(cardEntity: CardEntity): List<ShiftEntity>

    fun removeCardEntityAndShifts(cardEntity: CardEntity)

    fun removeShiftEntity(shiftEntity: ShiftEntity)
}

interface CardEntity {
    fun getId(): UUID
    fun getName(): String
}

interface ShiftEntity {
    fun getId(): UUID
    fun getCardId(): UUID
    fun getStartTime(): ZonedDateTime
    fun getEndTime(): ZonedDateTime
}