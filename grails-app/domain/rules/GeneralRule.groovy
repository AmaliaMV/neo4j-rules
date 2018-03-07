package rules

class GeneralRule {

    static mapWith = "neo4j"

    String name
    List<GeneralAction> actions = []

    static hasMany = [actions: GeneralAction]

    static constraints = {
    }
}
