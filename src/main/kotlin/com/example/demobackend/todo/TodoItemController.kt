package com.example.demobackend.todo

import com.example.demobackend.todo.dtos.CreateTodoItemDto
import com.example.demobackend.todo.dtos.GetTodoItemDto
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*
import java.util.*

@RestController
@RequestMapping("/todos")
class TodoItemController(val todoItemService: TodoItemsService) {
//    @GetMapping
//    @ResponseStatus(HttpStatus.OK)
//    fun getTodoItems(
//        @RequestParam(name = "id", required = false) id: Long?,
//        @RequestParam(name = "name", required = false) name: String?,
//        @RequestParam(name = "description", required = false) description: String?,
//        @RequestParam(name = "done", required = false) done: Boolean?,
//        @RequestParam(name = "date", required = false) date: Date?,
//        @RequestParam(name = "shouldBeDoneBy", required = false) shouldBeDoneBy: Date?,
//    ): List<GetTodoItemDto> {
//        return todoItemService.getTodoItems(id, name, description, done, shouldBeDoneBy, date)
//    }
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun createTodoItem(
        @RequestBody createTodoItemDto: CreateTodoItemDto
    ): GetTodoItemDto {
        return todoItemService.createTodoItem(createTodoItemDto)
    }
}