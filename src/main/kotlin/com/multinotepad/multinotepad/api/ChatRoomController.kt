package com.multinotepad.multinotepad.api

import com.multinotepad.multinotepad.service.ChatRoomService
import mu.KLogging
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.time.LocalDateTime

@RestController
@RequestMapping("/api/v1/room")
class ChatRoomController(
    val charRoomService: ChatRoomService
) {

    companion object: KLogging()

    @GetMapping("/enter")
//    @Async
    fun enterRoom(@RequestParam roomId: Int, @RequestParam userId: Int): Int {
        var currentTime = LocalDateTime.now()
        currentTime.nano
        logger.info("******************************")
        val threadId = Thread.currentThread().threadId()
        logger.info(" enter the room : ${roomId} time : ${currentTime.nano} threadId : ${threadId}")
        val currentRoom = charRoomService.enterRoom(roomId, threadId, userId)
        currentTime = LocalDateTime.now()
        logger.info("enter the room : ${roomId} time : ${currentTime.nano} API roomCnt : ${currentRoom} threadId: ${threadId}")
        return currentRoom
    }

    @GetMapping("/confirm")
    fun confirmRoom(@RequestParam roomId: Int) :String  {
        charRoomService.confirmUserList(roomId)
        return "SUCCESS"
    }

}