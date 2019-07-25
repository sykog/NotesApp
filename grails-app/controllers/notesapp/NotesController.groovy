package notesapp

import grails.validation.ValidationException
import static org.springframework.http.HttpStatus.*

class NotesController {

    NoteService noteService

    static allowedMethods = [update: "post", delete: "post"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        def notes = noteService.getAllNotes()
        if (params.filter) notes = noteService.getNotesByType(params.filter)

        respond([
            notes: notes,
            noteCount: notes.size()
        ])
    }

    def edit() {
        def note = noteService.getNote(params.id as int)

        respond ([
            view: 'edit',
            note: note
        ])
    }

    def update() {
        def String content = params.content
        def String additional = ""
        if (params.additional) additional = params.additional

        flash.message = noteService.updateNote(params.id as int, content, additional)
        redirect(controller: "notes")
    }

    def delete() {
        flash.message = noteService.deleteNote(params.id as int)
        redirect(controller: "notes")
    }
}
