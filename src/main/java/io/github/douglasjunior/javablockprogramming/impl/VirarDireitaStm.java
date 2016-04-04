package io.github.douglasjunior.javablockprogramming.impl;

import io.github.douglasjunior.javablockprogramming.ExpressionStm;

/**
 *
 * @author douglas
 */
public class VirarDireitaStm extends ExpressionStm<Void> {

    @Override
    public Void execute() {
        System.out.println("Virando a direita...");
        return null;
    }

}
