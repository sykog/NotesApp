package notesapp

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class BaseNoteServiceSpec extends Specification {

    BaseNoteService baseNoteService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new BaseNote(...).save(flush: true, failOnError: true)
        //new BaseNote(...).save(flush: true, failOnError: true)
        //BaseNote notes = new BaseNote(...).save(flush: true, failOnError: true)
        //new BaseNote(...).save(flush: true, failOnError: true)
        //new BaseNote(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //notes.id
    }

    void "test get"() {
        setupData()

        expect:
        baseNoteService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<BaseNote> baseNoteList = baseNoteService.list(max: 2, offset: 2)

        then:
        baseNoteList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        baseNoteService.count() == 5
    }

    void "test delete"() {
        Long baseNoteId = setupData()

        expect:
        baseNoteService.count() == 5

        when:
        baseNoteService.delete(baseNoteId)
        sessionFactory.currentSession.flush()

        then:
        baseNoteService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        BaseNote baseNote = new BaseNote()
        baseNoteService.save(baseNote)

        then:
        baseNote.id != null
    }
}
