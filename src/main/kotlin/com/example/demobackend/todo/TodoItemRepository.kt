package com.example.demobackend.todo

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface TodoItemRepository : JpaRepository<TodoItemEntity, Long> {}