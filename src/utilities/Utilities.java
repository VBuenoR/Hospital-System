package utilities;

import javax.swing.*;
import java.awt.*;

public class Utilities {

    public static void ativaDesativa(boolean estadoBotoes, JPanel painel){

        Component[] matrizComponentes = painel.getComponents();
        for (Component componenteAtualDaMatriz : matrizComponentes) {

            if (componenteAtualDaMatriz instanceof JButton) {

                if ((((JButton) componenteAtualDaMatriz).getActionCommand() == "0")){
                    componenteAtualDaMatriz.setEnabled(estadoBotoes);
                } else if (((JButton) componenteAtualDaMatriz).getActionCommand() == "1"){
                    componenteAtualDaMatriz.setEnabled(!estadoBotoes);
                }

            }

        }
    }

}
