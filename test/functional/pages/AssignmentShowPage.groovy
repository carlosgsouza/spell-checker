package pages

import geb.Page

class AssignmentShowPage extends Page {
	static url = "assignment/create"
	
	static at = {
		$("title").text() == "Ver Assignment" || $("title").text() == "Show Assignment" 
	}
	
	static content = {
		textArea { $("#text") }
		saveButton(to: AssignmentShowPage) { $(".save") }
	}
}
