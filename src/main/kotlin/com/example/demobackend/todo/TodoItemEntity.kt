package com.example.demobackend.todo

import jakarta.persistence.*
import java.util.*

@Entity(name = "todoitem")
@Table(name = "todoitem")
class TodoItemEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long? = null,
    @Column(name = "name", nullable = false)
    val name: String = "",
    @Column(name = "description", nullable = false)
    val description: String = "",
    @Column(name = "completed", nullable = false)
    val completed: Boolean = false,
    @Column(name = "created", nullable = false)
    val created: Date,
    @Column(name = "shouldBeDoneBy", nullable = false)
    val shouldBeDoneBy: Date
)
