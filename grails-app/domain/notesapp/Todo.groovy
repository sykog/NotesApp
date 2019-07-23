package notesapp

class Todo extends BaseNote {

    Boolean complete

    static constraints = {
        complete (nullable: false, default: false)
    }
}
