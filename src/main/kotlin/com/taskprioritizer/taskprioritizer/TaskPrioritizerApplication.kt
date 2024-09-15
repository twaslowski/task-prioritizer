package com.taskprioritizer.taskprioritizer

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TaskPrioritizerApplication

fun main(args: Array<String>) {
    runApplication<TaskPrioritizerApplication>(*args)
}
