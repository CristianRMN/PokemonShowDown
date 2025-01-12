package com.dam.proyectoprogramacion.view.panels.luck;

import javax.swing.*;
import java.awt.*;

/**
 * clase que tiene el panel de enter del jugador 1
 * @author cristian
 * @version v1.0
 */
public class EnterPanelPlayer1Luck extends JPanel {
    /**
     * atributo de tipo jButton que será el boton de enter
     */
    private static JButton enterButtonPlayer1;
    public EnterPanelPlayer1Luck(){
        /**
         * iniciamos el boton y lo añadimos al panel
         */
        enterButtonPlayer1 = new JButton("enter");
        enterButtonPlayer1.setBackground(Color.GREEN);
        enterButtonPlayer1.setForeground(Color.WHITE);
        enterButtonPlayer1.setPreferredSize(new Dimension(100,50));
        this.add(enterButtonPlayer1);
    }

    /**
     * getter y setter del boton de enter del jugador 1
     * @return boton de enter
     */
    public static JButton getEnterButtonPlayer1() {
        return enterButtonPlayer1;
    }

    public static void setEnterButtonPlayer1(JButton enterButtonPlayer1) {
        EnterPanelPlayer1Luck.enterButtonPlayer1 = enterButtonPlayer1;
    }
}
