package com.rjrudin.marklogic.gradle.task.cpf

import org.gradle.api.tasks.TaskAction

import com.rjrudin.marklogic.appdeployer.command.Command
import com.rjrudin.marklogic.gradle.task.MarkLogicTask

class DeployCpfTask extends MarkLogicTask {

    @TaskAction
    void deployCpf() {
        deployWithCommandListProperty("mlCpfCommands")
    }
}
