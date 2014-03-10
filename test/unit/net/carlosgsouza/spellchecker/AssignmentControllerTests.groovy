package net.carlosgsouza.spellchecker

import grails.test.mixin.*

@TestFor(AssignmentController)
@Mock(Assignment)
class AssignmentControllerTests {

    def populateValidParams(params) {
        assert params != null
        // TODO: Populate valid properties like...
        //params["name"] = 'someValidName'
    }

    void testIndex() {
        controller.index()
        assert "/assignment/list" == response.redirectedUrl
    }

    void testList() {

        def model = controller.list()

        assert model.assignmentInstanceList.size() == 0
        assert model.assignmentInstanceTotal == 0
    }

    void testCreate() {
        def model = controller.create()

        assert model.assignmentInstance != null
    }
}
