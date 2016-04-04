package io.github.douglasjunior.javablockprogramming;

/**
 * Created by douglas on 31/03/16.
 */
public class DoWhileStm extends BlockStm {

    private ConditionStm condition;

    public DoWhileStm(ConditionStm condition) {
        this.condition = condition;
    }

    @Override
    public Void execute() {
        do {
            try {
                super.execute();
            } catch (BreakLoopException ex) {
                break;
            }
        } while (condition.execute());
        return null;
    }
}
