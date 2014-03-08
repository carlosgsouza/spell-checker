package net.carlosgsouza.spellchecker

import org.springframework.dao.DataIntegrityViolationException

class AssignmentController {
	
	SpellCheckService spellCheckService

    static allowedMethods = [save: "POST", update: "POST", delete: "POST"]

    def index() {
        redirect(action: "list", params: params)
    }

    def list(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        [assignmentInstanceList: Assignment.list(params), assignmentInstanceTotal: Assignment.count()]
    }

    def create() {
        [assignmentInstance: new Assignment(params)]
    }

    def save() {
        Assignment assignmentInstance = new Assignment()
		
		assignmentInstance.text = params.text
		assignmentInstance.errorCount = spellCheckService.getErrorCount(assignmentInstance.text)

        if (!assignmentInstance.save(flush: true)) {
            render(view: "create", model: [assignmentInstance: assignmentInstance])
            return
        }

        flash.message = message(code: 'default.created.message', args: [message(code: 'assignment.label', default: 'Assignment'), assignmentInstance.id])
        redirect(action: "show", id: assignmentInstance.id)
    }

    def show(Long id) {
        def assignmentInstance = Assignment.get(id)
        if (!assignmentInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'assignment.label', default: 'Assignment'), id])
            redirect(action: "list")
            return
        }

        [assignmentInstance: assignmentInstance]
    }

}
