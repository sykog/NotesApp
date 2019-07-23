package notesapp

abstract class BaseNote {

    String content
    Date datetime

    static constraints = {
        content nullable:false
        datetime (nullable:false, default: new Date())
    }
}