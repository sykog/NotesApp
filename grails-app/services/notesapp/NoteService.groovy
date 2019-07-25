package notesapp

import grails.gorm.transactions.Transactional

@Transactional
class NoteService {

    BaseNote getNote(int id) {
        return BaseNote.get(id)
    }

    ArrayList<BaseNote> getAllNotes() {
        return BaseNote.listOrderByLastUpdated()
    }

    ArrayList<BaseNote> getNotesByType(String noteType) {
        switch (noteType) {
            case 'sites': return Bookmark.listOrderByLastUpdated(order: "desc")
            case 'code': return Codeblock.listOrderByLastUpdated(order: "desc")
            case 'quotes': return Quote.listOrderByLastUpdated(order: "desc")
            case 'todos': return Todo.listOrderByLastUpdated(order: "desc")
            default: return Note.listOrderByLastUpdated(order: "desc")
        }
    }

    String deleteNote(int id) {
        String noteType = BaseNote.get(id).class.toString().minus('class notesapp.')
        BaseNote.get(id).delete(flush: true)

        return noteType + " Deleted"
    }

    String updateNote(int id, String content, String additional) {
        BaseNote note = BaseNote.get(id)
        String noteType = note.class.toString().minus('class notesapp.')

        switch (noteType) {
            case 'Note': note.content = content
                break
            case 'Todo':
                note.content = content
                note.additional = false
                break
            default:
                note.content = content
                note.additional = additional
        }

        note.save(flush: true)
        return noteType + " Updated"
    }
}