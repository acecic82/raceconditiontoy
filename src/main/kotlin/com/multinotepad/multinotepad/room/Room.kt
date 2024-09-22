package com.multinotepad.multinotepad.room

data class Room(
    val id: Int,
    var cnt: Int,
    val owner: String,
    var users: ArrayList<Int>,
) {
    fun upCount() {
        this.cnt++
    }
}
