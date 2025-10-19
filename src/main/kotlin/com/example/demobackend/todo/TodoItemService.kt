package com.example.demobackend.todo

@Service
class TodoItemsService(
	private val todoItemtemRepository: TodoItemtemRepository
) {

	fun createTodoItem(
		dto: CreateTodoItemDto
	): GetTodoItemDto {
		val toSave = fromCreateTodoItemDto(dto)
	}
}
