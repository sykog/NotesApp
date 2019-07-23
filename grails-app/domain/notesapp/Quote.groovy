package notesapp

class Quote extends BaseNote {

    String source

    static constraints = {
        source nullable: false
    }
}
