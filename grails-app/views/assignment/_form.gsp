<%@ page import="net.carlosgsouza.spellchecker.Assignment" %>



<div class="fieldcontain ${hasErrors(bean: assignmentInstance, field: 'text', 'error')} required">
	<label for="text">
		<g:message code="assignment.text.label" default="Text" />
		<span class="required-indicator">*</span>
	</label>
	<g:textArea id="text" name="text" required="" value="${assignmentInstance?.text}"/>
</div>
<span id="remaininingChars"/>

<script type="text/javascript">
	var updateRemainingChars = function() {
		var remainingChars = AssignmentController.getRemainingCharacters($("#text").val());
		$("#remaininingChars").text(remainingChars + " characters remaining");
	}

	updateRemainingChars();

	$("#text").keyup(function(eventHandler) {
		updateRemainingChars();
	});
</script>

