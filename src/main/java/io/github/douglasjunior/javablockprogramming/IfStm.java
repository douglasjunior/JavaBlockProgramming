package io.github.douglasjunior.javablockprogramming;

/**
 * Created by douglas on 31/03/16.
 */
public class IfStm implements Statement<Void> {

    private final ConditionStm condition;
    private final Statement themStm;
    private final Statement elseStm;

    public IfStm(ConditionStm condition, Statement themStm) {
        this(condition, themStm, null);
    }

    public IfStm(ConditionStm condition, Statement themStm, Statement elseStm) {
        this.condition = condition;
        this.themStm = themStm;
        this.elseStm = elseStm;
    }

    @Override
    public Void execute() {
        boolean bool = condition.execute();
        if (bool) {
            themStm.execute();
        } else if (elseStm != null) {
            elseStm.execute();
        }
        return null;
    }
}
