package notesapp

class Bookmark extends BaseNote {

    String link

    static constraints = {
        link nullable: false
    }
}
