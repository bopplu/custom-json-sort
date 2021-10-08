package com.github.bopplu.customjsonsort.services

import com.intellij.openapi.project.Project
import com.github.bopplu.customjsonsort.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
