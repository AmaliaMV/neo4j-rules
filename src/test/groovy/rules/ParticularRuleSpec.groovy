package rules

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class ParticularRuleSpec extends Specification implements DomainUnitTest<ParticularRule> {

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
        expect:"fix me"
            true == false
    }
}
