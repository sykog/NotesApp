<!DOCTYPE html>
<html>
    <head>
        <meta name="layout" content="main" />
        <title>Add note</title>

        <asset:javascript src="addNote.js" />
    </head>
    <body>
    <g:if test="${flash.message}">
        <div class="message" role="status">${flash.message}</div>
    </g:if>
    <g:hasErrors bean="${this.baseNote}">
        <ul class="errors" role="alert">
            <g:eachError bean="${this.baseNote}" var="error">
                <li <g:if test="${error in org.springframework.validation.FieldError}">data-field-id="${error.field}"</g:if>><g:message error="${error}"/></li>
            </g:eachError>
        </ul>
    </g:hasErrors>

    <g:form controller="notes" action="create" method="post">
        <div class="addNote">
            <select name="noteType">
                <option value="note">Note</option>
                <option value="todo">To-do</option>
                <option value="code">Code</option>
                <option value="quote">Quote</option>
                <option value="site">Website</option>
            </select>
            <g:textArea name="content" rows="8" cols="80"/>
            <g:textField id="additional" name="additional"/>
            <g:submitButton name="create" value="Add Note"/>
        </div>
    </g:form>
    </body>
</html>
