package rules

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class GeneralRuleSpec extends Specification implements DomainUnitTest<GeneralRule> {

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
        expect:"fix me"
            true == false
    }
}
