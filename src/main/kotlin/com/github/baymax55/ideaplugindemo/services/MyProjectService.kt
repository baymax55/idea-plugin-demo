package com.github.baymax55.ideaplugindemo.services

import com.github.baymax55.ideaplugindemo.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
