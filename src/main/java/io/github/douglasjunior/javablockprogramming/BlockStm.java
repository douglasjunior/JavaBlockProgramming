package io.github.douglasjunior.javablockprogramming;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by douglas on 31/03/16.
 */
public class BlockStm implements Statement<Void> {

    protected List<Statement> statements = new ArrayList<>();

    public void addStatement(Statement st) {
        statements.add(st);
    }

    public List<Statement> getStatements() {
        return statements;
    }

    @Override
    public Void execute() {
        for (Statement st : statements) {
            st.execute();
        }
        return null;
    }
}
