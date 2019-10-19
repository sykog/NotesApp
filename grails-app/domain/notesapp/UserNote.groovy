package notesapp

import grails.compiler.GrailsCompileStatic
import org.codehaus.groovy.util.HashCodeHelper

@GrailsCompileStatic
class UserNote implements Serializable{

    User user
    BaseNote note

    @Override
    boolean equals(other) {
        if (other instanceof UserNote) {
            other.userId == user?.id && other.noteId == note?.id
        }
    }

    @Override
    int hashCode() {
        int hashCode = HashCodeHelper.initHash()

        if (user) hashCode = HashCodeHelper.updateHash(hashCode, user.id)
        if (note) hashCode = HashCodeHelper.updateHash(hashCode, note.id)

        hashCode
    }

    static constraints = {

    }

    static mapping = {
        id composite: ['user', 'role']
    }
}
