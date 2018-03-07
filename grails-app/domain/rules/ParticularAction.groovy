package rules

class ParticularAction extends GeneralAction {

    Integer priority

    static belongsTo = [ParticularRule]

    static constraints = {
    }
}
