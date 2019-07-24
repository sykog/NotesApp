package notesapp

import org.codehaus.groovy.reflection.stdclasses.ArrayCachedClass

class NoteService {

    ArrayList<BaseNote> getAllNotes() {
        return BaseNote.listOrderByLastUpdated()
    }

    ArrayList<BaseNote> getNotesByType(String noteType) {
        switch (noteType) {
            case 'bookmark': return Bookmark.listOrderByLastUpdated()
                break
            case 'codeblock': return Codeblock.listOrderByLastUpdated()
                break
            case 'quote': return Quote.listOrderByLastUpdated()
                break
            case 'todo': return Todo.listOrderByLastUpdated()
                break
            default: return Note.listOrderByLastUpdated()
        }
    }

    BaseNote getById(Serializable id) {
        return null
    }
}