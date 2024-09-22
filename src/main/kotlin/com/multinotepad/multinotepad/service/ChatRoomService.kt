package com.multinotepad.multinotepad.service

import mu.KLogging
import org.springframework.stereotype.Service

@Service
class ChatRoomService {

    companion object: KLogging()
    fun enterRoom(roomId: Int) {
        logger.info("enter the room in Service : ${roomId}")

    }
}