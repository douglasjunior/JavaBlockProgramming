package io.github.douglasjunior.javablockprogramming;

import io.github.douglasjunior.javablockprogramming.impl.AndarStm;
import io.github.douglasjunior.javablockprogramming.impl.CaminhoLivreStm;
import io.github.douglasjunior.javablockprogramming.impl.PularStm;
import io.github.douglasjunior.javablockprogramming.impl.VirarDireitaStm;
import io.github.douglasjunior.javablockprogramming.impl.VirarEsquerdaStm;
import org.junit.Test;

/**
 *
 * @author douglas
 */
public class StatementTest {

    public StatementTest() {
    }

    @Test
    public void executeTest() {
        // criando o bloco principal de instruções
        BlockStm principal = new BlockStm();

        // testando expressões simples
        principal.addStatement(new AndarStm());
        principal.addStatement(new VirarDireitaStm());

        // testando For com 5 execuções
        ForStm forStm = new ForStm(5);
        forStm.addStatement(new AndarStm());
        principal.addStatement(forStm);

        // outras expressões simples
        principal.addStatement(new PularStm());
        principal.addStatement(new AndarStm());

        // testando While enquanto o caminho estiver livre
        WhileStm whileStm = new WhileStm(new CaminhoLivreStm());
        whileStm.addStatement(new AndarStm());
        principal.addStatement(whileStm);

        // testando condição If
        // IF
        ForStm forStmDireita = new ForStm(3);
        forStmDireita.addStatement(new VirarDireitaStm());
        // ELSE
        ForStm forStmEsquerda = new ForStm(4);
        forStmEsquerda.addStatement(new VirarEsquerdaStm());

        // cria a condição IF e adiciona ao fluxo principal
        IfStm ifStm = new IfStm(new CaminhoLivreStm(), forStmDireita, forStmEsquerda);
        principal.addStatement(ifStm);

        // executando instruções
        principal.execute();
    }
}
