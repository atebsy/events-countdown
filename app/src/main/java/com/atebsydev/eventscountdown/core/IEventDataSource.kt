package com.atebsydev.eventscountdown.core

import com.atebsydev.eventscountdown.database.Event
import kotlinx.coroutines.flow.Flow

interface IEventDataSource {
    suspend fun addEvent(event: Event)
    suspend fun deleteEventById(eventId: Int): Int
    suspend fun getPastEvents(): Flow<List<Event>>
    suspend fun getActiveEvents(): Flow<List<Event>>
    suspend fun queryByTitle(eventTitle: String): Event
}