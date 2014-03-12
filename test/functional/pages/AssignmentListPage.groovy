package pages

import geb.Page

class AssignmentListPage extends Page {
	static url = "assignment/list"
	
	static at = {
		$("title").text().startsWith("Assignment List")
	}
	
	static content = {
		newAssignmentButton(to: AssignmentCreatePage) { $("#new-assignment").find("a") }
		assignments { $("#list-assignment").find("tr") }
	}
}
