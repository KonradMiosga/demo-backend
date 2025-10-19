package com.example.demobackend.todo

import com.example.demobackend.todo.dtos.CreateTodoItemDto
import com.example.demobackend.todo.dtos.GetTodoItemDto
import com.example.demobackend.todo.mappers.fromCreateTodoItemDto
import com.example.demobackend.todo.mappers.toGetTodoItemDto
import org.springframework.stereotype.Service

@Service
class TodoItemsService(
	private val todoItemRepository: TodoItemtemRepository
) {

	fun createTodoItem(
		createTodoItemDto: CreateTodoItemDto
	): GetTodoItemDto {
        val newTodoItem = fromCreateTodoItemDto(createTodoItemDto)
        val savedTodoItem = todoItemRepository.save(newTodoItem)
        return toGetTodoItemDto(savedTodoItem)
	}
}