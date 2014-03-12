package pages

import geb.Page

class AssignmentCreatePage extends Page {
	static url = "assignment/create"
	
	static at = {
		$("title").text() == "Criar Assignment" || $("title").text() == "Create Assignment" 
	}
	
	static content = {
		textArea { $("#text") }
		saveButton(to: AssignmentShowPage) { $(".save") }
	}
}
