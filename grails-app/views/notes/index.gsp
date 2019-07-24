<!DOCTYPE html>
<html>
    <head>
        <meta name="layout" content="main" />
        <g:set var="entityName" value="${message(code: 'notes.label', default: 'BaseNote')}" />
        <title><g:message code="default.list.label" args="[entityName]" /></title>
    </head>
    <body>
        <div id="list-baseNote" class="content scaffold-list" role="main">
            <h1><g:message code="default.list.label" args="[entityName]" /></h1>
            <g:if test="${flash.message}">
                <div class="message" role="status">${flash.message}</div>
            </g:if>
            <g:each in="${notes}" var="note">
                <div class="${note.class}">
                    <p>${note.id}</p>
                    <p>${note.content}</p>
                    <p>${note.lastUpdated}</p>
                    <g:if test="${note.class.toString() != 'class notesapp.Note'}">
                        <p>${note.additional}</p>
                    </g:if>
                </div>
            </g:each>

            <div class="pagination">
                <g:paginate total="${baseNoteCount ?: 0}" />
            </div>
        </div>
    </body>
</html>