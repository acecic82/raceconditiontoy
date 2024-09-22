package com.multinotepad.multinotepad.service

import com.multinotepad.multinotepad.room.Room
import mu.KLogging
import org.springframework.stereotype.Service

@Service
class ChatRoomService(
    val rooms: List<Room>
) {

    companion object: KLogging() {
        const val LIMIT_ENTER = 50
    }

//    @Async
    @Synchronized
    fun enterRoom(roomId: Int, threadIdFromController: Long, userId: Int): Int {

        var room = Room(0,0,"nothing", arrayListOf())
        for(item in rooms) {
            if(item.id == roomId) {
                room = item
                break
            }
        }
//        Thread.sleep(5000)
        if(room.cnt < LIMIT_ENTER) {
            room.users.addLast(userId)
        }
//        logger.info("enter the room in Service : ${roomId} before roomCnt : ${room.cnt} threadId: ${threadIdFromController}")
//        if(room.cnt > LIMIT_ENTER) {
//            logger.info("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!Error case roomCnt : ${room.cnt}")
//            return
//        }
//        if(room.cnt == LIMIT_ENTER)
//            return
        room.upCount()
//        val threadId = Thread.currentThread().threadId()
//        logger.info("curent room cnt : ${room.cnt}, current Thread id : ${threadId} and paramThread : ${threadIdFromController}")

        return room.users.size
    }

    fun confirmUserList(roomId: Int) {
        var room = Room(0,0,"nothing", arrayListOf())

        for(item in rooms) {
            if(item.id == roomId) {
                room = item
                break
            }
        }
        if(room != null) {
//            Collections.sort(room.users)
            for(user in room.users) {
                logger.info("current room user : ${user}")
            }

            logger.info("current room cnt : ${room.cnt} userCnt : ${room.users.size}")
        }

    }
}