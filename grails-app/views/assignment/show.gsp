
<%@ page import="net.carlosgsouza.spellchecker.Assignment" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'assignment.label', default: 'Assignment')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-assignment" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><g:link class="list" action="list"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-assignment" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list assignment">
			
				<g:if test="${assignmentInstance?.text}">
				<li class="fieldcontain">
					<span id="text-label" class="property-label"><g:message code="assignment.text.label" default="Text" /></span>
					
						<span class="property-value" aria-labelledby="text-label"><g:fieldValue bean="${assignmentInstance}" field="text"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${assignmentInstance?.errorCount}">
				<li class="fieldcontain">
					<span id="errorCount-label" class="property-label"><g:message code="assignment.errorCount.label" default="Error Count" /></span>
					
						<span class="property-value" aria-labelledby="errorCount-label"><g:fieldValue bean="${assignmentInstance}" field="errorCount"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${assignmentInstance?.wordCount}">
				<li class="fieldcontain">
					<span id="wordCount-label" class="property-label"><g:message code="assignment.wordCount.label" default="Word Count" /></span>
					
						<span class="property-value" aria-labelledby="wordCount-label"><g:fieldValue bean="${assignmentInstance}" field="wordCount"/></span>
					
				</li>
				</g:if>
			
			</ol>
		</div>
	</body>
</html>
