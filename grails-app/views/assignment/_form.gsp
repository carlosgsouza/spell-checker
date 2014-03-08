<%@ page import="net.carlosgsouza.spellchecker.Assignment" %>



<div class="fieldcontain ${hasErrors(bean: assignmentInstance, field: 'text', 'error')} required">
	<label for="text">
		<g:message code="assignment.text.label" default="Text" />
		<span class="required-indicator">*</span>
	</label>
	<g:textArea name="text" required="" value="${assignmentInstance?.text}"/>
</div>


