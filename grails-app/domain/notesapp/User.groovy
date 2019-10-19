package notesapp

import grails.compiler.GrailsCompileStatic

@GrailsCompileStatic
class User implements Serializable {

    String username
    String password
    boolean enabled = true

    static constraints = {
        password blank: false, password: true
        username blank: false, unique: true
    }
}
