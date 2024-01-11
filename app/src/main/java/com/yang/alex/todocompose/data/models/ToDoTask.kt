package com.yang.alex.todocompose.data.models

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.yang.alex.todocompose.util.Constants

@Entity(tableName = Constants.DATABASE_TABLE)
data class ToDoTask(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val title: String,
    val description: String,
    val priority: Priority
)
