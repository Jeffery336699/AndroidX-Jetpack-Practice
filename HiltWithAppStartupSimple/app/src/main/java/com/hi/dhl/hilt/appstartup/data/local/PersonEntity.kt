package com.hi.dhl.hilt.appstartup.data.local

import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * <pre>
 *     author: dhl
 *     date  : 2020/6/24
 *     desc  :
 * </pre>
 */

@Entity(tableName = "person")
class PersonEntity(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val name: String,
    val updateTime: Long = System.currentTimeMillis()
) {

    override fun toString(): String {
        return "PersonEntity(id=$id, name='$name', updateTime=$updateTime)"
    }

}
