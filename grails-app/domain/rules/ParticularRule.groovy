package rules

class ParticularRule extends GeneralRule {

    static mapWith = "neo4j"

    List<ParticularAction> actions = []

    static hasMany = [actions: ParticularAction]

    static constraints = {
    }
}
