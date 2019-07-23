package notesapp

class HomeController {

    def index() {
        respond([
                vehicles: BaseNote.list(),
                vehicleTotal: BaseNote.count()
        ])
    }
}