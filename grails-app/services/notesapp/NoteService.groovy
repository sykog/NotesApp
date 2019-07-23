package notesapp

import grails.gorm.services.Service

@Service(BaseNote)
interface NoteService {

    BaseNote get(Serializable id)

    List<BaseNote> list(Map args)

    Long count()

    void delete(Serializable id)

    BaseNote save(BaseNote baseNote)

}