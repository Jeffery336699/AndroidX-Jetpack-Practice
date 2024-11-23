package com.hi.dhl.hilt.appstartup.data.local

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

/**
 * <pre>
 *     author: dhl
 *     date  : 2020/6/24
 *     desc  :
 * </pre>
 */

@Dao
interface PersonDao {


    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(personEntity: PersonEntity)

    @Query("SELECT * FROM person")
    fun getAll(): LiveData<List<PersonEntity>>

}