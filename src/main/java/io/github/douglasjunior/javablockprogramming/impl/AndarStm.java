package io.github.douglasjunior.javablockprogramming.impl;

import io.github.douglasjunior.javablockprogramming.ExpressionStm;

/**
 *
 * @author douglas
 */
public class AndarStm implements ExpressionStm<Void> {

    @Override
    public Void execute() {
        System.out.println("Andando em frente...");
        return null;
    }

}
