package io.github.douglasjunior.javablockprogramming.impl;

import io.github.douglasjunior.javablockprogramming.ExpressionStm;

/**
 *
 * @author douglas
 */
public class VirarDireitaStm implements ExpressionStm<Void> {

    @Override
    public Void execute() {
        System.out.println("Virando a direita...");
        return null;
    }

}
