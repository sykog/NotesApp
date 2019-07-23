package notesapp

class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/"(controller:"home")
        "/notes"(controller: 'notes')
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}