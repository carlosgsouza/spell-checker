package net.carlosgsouza.spellchecker

class AssignmentController {

	SpellCheckService spellCheckService
	
    def submit(params) { 
		Assignment assignment = new Assignment()
		
		assignment.text = params.text
		assignment.errorCount = spellCheckService.getErrorCount(assignment.text)

		assignment.save()				
	}
}
