package com.multinotepad.multinotepad.common

import com.multinotepad.multinotepad.room.Room
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class RoomConfiguration {

    @Bean
    fun createRoom(): List<Room> {
        val room1 = Room(1, 0, "Zamanbo1", arrayListOf())
        val room2 = Room(2, 0, "Zamanbo2", arrayListOf())

        return listOf(room1, room2)
    }
}