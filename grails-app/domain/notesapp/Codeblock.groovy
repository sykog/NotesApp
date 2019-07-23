package notesapp

class Codeblock extends BaseNote {

    String language

    static constraints = {
        language nullable: false
    }
}
