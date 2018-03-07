package rules

class GeneralAction {

    static mapWith = "neo4j"

    String name

    static belongsTo = [GeneralRule]

    static constraints = {
    }
}
