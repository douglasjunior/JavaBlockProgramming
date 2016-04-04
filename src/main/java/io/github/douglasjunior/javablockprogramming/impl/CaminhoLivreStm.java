package io.github.douglasjunior.javablockprogramming.impl;

import io.github.douglasjunior.javablockprogramming.ConditionStm;
import java.util.Random;

/**
 *
 * @author douglas
 */
public class CaminhoLivreStm extends ConditionStm {

    @Override
    public Boolean execute() {
        // retorna true ou false aleatoriamente
        boolean livre = new Random().nextBoolean();
        System.out.println("Caminho livre? " + livre);
        return livre;
    }

}
