package com.github.oneyoungg.plugindemo.services

import com.github.oneyoungg.plugindemo.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
