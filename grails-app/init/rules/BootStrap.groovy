package rules

class BootStrap {

    def init = { servletContext ->

        GeneralRule.withNewSession {
            GeneralRule.withNewTransaction {

                GeneralRule generalRule = GeneralRule.findByName('generalRule1')
                if (!generalRule) {
                    new GeneralRule(name: 'generalRule1', actions: [new GeneralAction(name: 'generalAction1')]).save()
                }

                GeneralRule particularRule = ParticularRule.findByName('particularRule1')
                if (!particularRule) {
                    new ParticularRule(name: 'particularRule1', actions: [new ParticularAction(name: 'particularAction1', priority: 2)]).save(flush: true)

                }
            }
        }

    }
    def destroy = {
    }
}
