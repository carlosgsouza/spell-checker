
<%@ page import="net.carlosgsouza.spellchecker.Assignment" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'assignment.label', default: 'Assignment')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-assignment" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-assignment" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
				<thead>
					<tr>
					
						<g:sortableColumn property="text" title="${message(code: 'assignment.text.label', default: 'Text')}" />
					
						<g:sortableColumn property="errorCount" title="${message(code: 'assignment.errorCount.label', default: 'Error Count')}" />
					
						<g:sortableColumn property="score" title="Score" />
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${assignmentInstanceList}" status="i" var="assignmentInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${assignmentInstance.id}">${fieldValue(bean: assignmentInstance, field: "text")}</g:link></td>
					
						<td>${fieldValue(bean: assignmentInstance, field: "errorCount")}</td>
					
						<td>${fieldValue(bean: assignmentInstance, field: "score")}</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${assignmentInstanceTotal}" />
			</div>
		</div>
	</body>
</html>
