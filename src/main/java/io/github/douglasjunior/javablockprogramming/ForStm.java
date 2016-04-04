package io.github.douglasjunior.javablockprogramming;

/**
 * Created by douglas on 31/03/16.
 */
public class ForStm extends BlockStm {

    private int count;

    public ForStm(int count) {
        this.count = count;
    }

    @Override
    public Void execute() {
        for (int i = 0; i < count; i++) {
            try {
                super.execute();
            } catch (BreakLoopException ex) {
                break;
            }
        }
        return null;
    }
}
