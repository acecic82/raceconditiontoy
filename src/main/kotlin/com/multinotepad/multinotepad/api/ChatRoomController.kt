package com.multinotepad.multinotepad.api

import mu.KLogging
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class ChatRoomController {

    companion object: KLogging()

    @PostMapping
    fun enterRoom(roomId: Int): String {
        logger.info("enter the room : ${roomId}")
        return "SUCCESS"
    }

}