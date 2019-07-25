package notesapp

import grails.gorm.transactions.Transactional

@Transactional
class NoteService {

    ArrayList<BaseNote> getAllNotes() {
        return BaseNote.listOrderByLastUpdated()
    }

    ArrayList<BaseNote> getNotesByType(String noteType) {
        switch (noteType) {
            case 'sites': return Bookmark.listOrderByLastUpdated()
                break
            case 'code': return Codeblock.listOrderByLastUpdated()
                break
            case 'quotes': return Quote.listOrderByLastUpdated()
                break
            case 'todos': return Todo.listOrderByLastUpdated()
                break
            default: return Note.listOrderByLastUpdated()
        }
    }

    String deleteNote(int id) {
        String noteType = BaseNote.get(id).class.toString().minus('class notesapp.')
        BaseNote.get(id).delete(flush: true)

        return noteType + " Deleted"
    }

    BaseNote getById(Serializable id) {
        return null
    }
}