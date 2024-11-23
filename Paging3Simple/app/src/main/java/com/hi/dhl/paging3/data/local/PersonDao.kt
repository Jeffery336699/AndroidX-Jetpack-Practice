package com.hi.dhl.paging3.data.local

import androidx.paging.PagingSource
import androidx.room.*

/**
 * <pre>
 *     author: dhl
 *     date  : 2020/6/16
 *     desc  :
 * </pre>
 */

@Dao
interface PersonDao {
    // room paging 3的内部支持，jitpack亲儿子支持，可以直接使用
    @Query("SELECT * FROM PersonEntity order by updateTime desc")
    fun queryAllData(): PagingSource<Int, PersonEntity>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(personEntity: List<PersonEntity>)

    @Delete
    fun delete(personEntity: PersonEntity)
}