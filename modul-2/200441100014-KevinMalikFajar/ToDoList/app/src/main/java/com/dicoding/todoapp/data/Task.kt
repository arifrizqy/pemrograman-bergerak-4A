package com.dicoding.todoapp.data

//TODO 1 : Define a local database table using the schema in app/schema/tasks.json
data class Task(
    val id: Int = 0,
    val title: String,
    val description: String,
    val dueDateMillis: Long,
    val isCompleted: Boolean = false
)
