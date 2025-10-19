package com.example.demobackend.todo.mappers

import com.example.demobackend.todo.TodoItemEntity
import com.example.demobackend.todo.dtos.CreateTodoItemDto

fun fromCreateTodoItemDto(
    createTodoItemDto: CreateTodoItemDto
): TodoItemEntity{
    return TodoItemEntity(
        name = createTodoItemDto.name,
        description = createTodoItemDto.description,
        done = createTodoItemDto.done,
        created = createTodoItemDto.created,
        shouldBeDoneBy = createTodoItemDto.shouldBeDoneBy
    )
}