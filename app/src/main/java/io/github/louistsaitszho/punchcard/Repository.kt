package io.github.louistsaitszho.punchcard

import java.util.*

typealias CardID = UUID
typealias Position = Int

//TODO since LocalStorage is abstracted, I can add implementation anyway
interface Repository {
    val localStorage: LocalStorage

    suspend fun getAllCards(): List<Card>

    suspend fun orderAllCards(newOrder: Map<CardID, Position>): List<Card>

    suspend fun addCard(cardName: String): Card

    suspend fun removeCard(card: Card)

    suspend fun startShift(card: Card): Shift

    suspend fun endShift(card: Card): Shift

    suspend fun removeShift(shift: Shift)

    //TODO start & end breaks?
}