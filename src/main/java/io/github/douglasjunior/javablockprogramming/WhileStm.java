package io.github.douglasjunior.javablockprogramming;

/**
 * Created by douglas on 31/03/16.
 */
public class WhileStm extends BlockStm {

    private ConditionStm condition;

    public WhileStm(ConditionStm condition) {
        this.condition = condition;
    }

    @Override
    public Void execute() {
        while (condition.execute()) {
            try {
                super.execute();
            } catch (BreakLoopException ex) {
                break;
            }
        }
        return null;
    }
}
