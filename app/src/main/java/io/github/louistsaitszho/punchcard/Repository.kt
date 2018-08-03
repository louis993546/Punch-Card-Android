package io.github.louistsaitszho.punchcard

import java.util.*

typealias CardID = UUID
typealias Position = Int

/**
 * This is the definition of all the methods of the model that the app has access to.
 */
interface Repository {

    suspend fun getAllCards(): List<Card>

    suspend fun reorderCards(newOrder: Map<CardID, Position>): List<Card>

    suspend fun addCard(cardName: String): Card

    suspend fun removeCard(card: Card)

    suspend fun renameCard(cardID: CardID, newName: String): Card

    suspend fun startShift(card: Card): Shift

    suspend fun endShift(card: Card): Shift

    suspend fun removeShift(shift: Shift)

    suspend fun startBreak(shift: Shift): Shift

    suspend fun endBreak(shift: Shift): Shift

}