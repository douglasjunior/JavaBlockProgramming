package io.github.douglasjunior.javablockprogramming.impl;

import io.github.douglasjunior.javablockprogramming.ExpressionStm;

/**
 *
 * @author douglas
 */
public class VirarEsquerdaStm implements ExpressionStm<Void> {

    @Override
    public Void execute() {
        System.out.println("Virando a esquerda...");
        return null;
    }

}
