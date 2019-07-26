<!DOCTYPE html>
<html>
    <head>
        <meta name="layout" content="main" />
        <title>Notes</title>
    </head>
    <body>
        <div class="container" role="main">
            <g:if test="${flash.message}">
                <div class="message" role="status">${flash.message}</div>
            </g:if>

            <g:each in="${notes}" var="note">
                <div class="${note.class.toString().minus("class notesapp.").toLowerCase()}">
                    <p>${note.content}</p>
                    <p>${note.lastUpdated}</p>

                    <g:if test="${note.class.toString() != 'class notesapp.Note'}">
                        <g:if test="${note.class.toString() == 'class notesapp.Bookmark'}">
                            <a href="${note.additional}">${note.additional}</a>
                        </g:if>
                        <g:elseif test="${note.class.toString() == 'class notesapp.Todo'}">
                            <g:if test="${note.additional}">
                                <p>Done!</p>
                                <g:link action="todo" params="${[id: note.id]}">Mark Incomplete</g:link>
                            </g:if>
                            <g:else>
                                <g:link action="todo" params="${[id: note.id]}">Mark Complete</g:link>
                            </g:else>
                        </g:elseif>
                        <g:else>
                            <p>${note.additional}</p>
                        </g:else>
                    </g:if>

                    <g:link action="edit" params="${[id: note.id]}">Edit</g:link>
                    <g:link action="delete" params="${[id: note.id]}" onclick="
                    return confirm('Are you sure?');
                ">Delete</g:link>
                </div>
            </g:each>
        </div>
    </body>
</html>