package notesapp

class BootStrap {

    def init = { servletContext ->
        new Note(content: 'Hello').save()
        new Quote(content: 'Con Queso Frito', source: 'Me').save()
        new Codeblock(content: 'System.out.println("taco");').save()
        new Todo(content: 'Finish app', complete: false).save()
        new Bookmark(content: 'videos', link: 'https://www.youtube.com').save()
    }

    def destroy = {
    }
}
