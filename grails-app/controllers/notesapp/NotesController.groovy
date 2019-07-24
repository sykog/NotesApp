package notesapp

import grails.validation.ValidationException
import static org.springframework.http.HttpStatus.*

class NotesController {

    NoteService noteService

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        def notes = noteService.getNotesByType('codeblock')
        def allNotes = noteService.getAllNotes()
        respond([
            notes: allNotes
        ])
    }

    /*def show(Long id) {
        respond noteService.get(id)
    }

    def create() {
        //respond new BaseNote(params)
    }

    def save(BaseNote baseNote) {
        if (baseNote == null) {
            notFound()
            return
        }

        try {
            noteService.save(baseNote)
        } catch (ValidationException e) {
            respond baseNote.errors, view:'create'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'notes.label', default: 'BaseNote'), baseNote.id])
                redirect baseNote
            }
            '*' { respond baseNote, [status: CREATED] }
        }
    }

    def edit(Long id) {
        respond noteService.get(id)
    }

    def update(BaseNote baseNote) {
        if (baseNote == null) {
            notFound()
            return
        }

        try {
            noteService.save(baseNote)
        } catch (ValidationException e) {
            respond baseNote.errors, view:'edit'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'notes.label', default: 'BaseNote'), baseNote.id])
                redirect baseNote
            }
            '*'{ respond baseNote, [status: OK] }
        }
    }

    def delete(Long id) {
        if (id == null) {
            notFound()
            return
        }

        noteService.delete(id)

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'notes.label', default: 'BaseNote'), id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'notes.label', default: 'BaseNote'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }*/
}
