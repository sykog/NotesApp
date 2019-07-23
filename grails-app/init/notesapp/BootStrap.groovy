package notesapp

class BootStrap {

    def init = { servletContext ->
        new Note(content: 'Hello', datetime: new Date()).save()
        new Quote(content: 'Cool', source: 'Me', datetime: new Date()).save()
    }

    def destroy = {
    }
}
