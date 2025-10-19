package com.example.demobackend.todo.mappers

import com.example.demobackend.todo.TodoItemEntity
import com.example.demobackend.todo.dtos.GetTodoItemDto

fun toGetTodoItemDto(todoItemEntity: TodoItemEntity): GetTodoItemDto {
    return GetTodoItemDto(
        id = todoItemEntity.id!!,
        name = todoItemEntity.name,
        description = todoItemEntity.description,
        done = todoItemEntity.done,
        created = todoItemEntity.created,
        shouldBeDoneBy = todoItemEntity.shouldBeDoneBy
    )
}