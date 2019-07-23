package notesapp

class HomeController {

    def index() {
        respond([
            notes: BaseNote.list()
        ])
    }
}