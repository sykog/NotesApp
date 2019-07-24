package notesapp

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

    BaseNote getById(Serializable id) {
        return null
    }
}