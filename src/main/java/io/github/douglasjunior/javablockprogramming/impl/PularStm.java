package io.github.douglasjunior.javablockprogramming.impl;

import io.github.douglasjunior.javablockprogramming.ExpressionStm;

/**
 *
 * @author douglas
 */
public class PularStm extends ExpressionStm<Void> {

    @Override
    public Void execute() {
        System.out.println("Pulando obstáculo...");
        return null;
    }

}
