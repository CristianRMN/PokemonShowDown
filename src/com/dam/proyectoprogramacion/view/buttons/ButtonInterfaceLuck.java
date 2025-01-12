package com.dam.proyectoprogramacion.view.buttons;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

/**
 * Clase de los botones de la interfaz de la suerte
 * @author Cristian
 * @version v1.0
 */
public class ButtonInterfaceLuck extends JPanel {

    /**
     * atributos privados de tipo JButton que serán los de la clase de la suerte
     */
    private static JButton faceButton;
    private static JButton tailButton;
    private static JButton confirmbuttonPlayer1;
    private static JButton confirmbuttonPlayer2;
    private static JButton finishButton;
    private static JButton selectionButton;

    /**
     * metodo para crear el botón de la cara de la moneda en la interfaz suerte
     * @return el boton creado
     */
    public  JButton makeFaceButton(){

        ImageIcon iconFace = new ImageIcon("imagenes/cara.png");
        faceButton = new CreateButtons("Cara", iconFace);
        setBackground(Color.ORANGE.brighter());
        setForeground(Color.BLACK);
        Border borderboton = BorderFactory.createLineBorder(Color.GREEN.darker().darker(), 2);
        setBorder(borderboton);
        return faceButton;
    }

    /**
     * metodo para crear la cruz de la moneda en la interfaz suerte
     * @return el boton creado
     */
    public  JButton makeTailButton(){

        ImageIcon iconTail = new ImageIcon("imagenes/cruz.png");
        tailButton = new CreateButtons("Cruz", iconTail);
        setBackground(Color.CYAN);
        setForeground(Color.BLACK);
        Border borderboton = BorderFactory.createLineBorder(Color.CYAN.darker().darker(), 2);
        setBorder(borderboton);
        return tailButton;
    }

    /**
     * metodo para crear el boton de confirmar, una vez ambos jugadores ya saben quien escoge primero
     * @return el boton creado
     */
    public JButton makeConfirmButtonPlayer1(){

        confirmbuttonPlayer1 = new JButton("Listo");
        setBackground(Color.GREEN);
        setForeground(Color.WHITE);
        Border borderboton = BorderFactory.createLineBorder(Color.RED, 3);
        setBorder(borderboton);
        return confirmbuttonPlayer1;

    }

    /**
     * metodo para crear el boton de confirmacion del jugador 2
     * @return el boton creado
     */
    public JButton makeConfirmButtonPlayer2(){

        confirmbuttonPlayer1 = new JButton("Listo");
        setBackground(Color.GREEN);
        setForeground(Color.WHITE);
        Border borderboton = BorderFactory.createLineBorder(Color.RED, 3);
        setBorder(borderboton);
        return confirmbuttonPlayer1;

    }

    /**
     * metodo para crear el boton de finish de la interfaz de la suerte
     * @return el boton creado
     */
    public JButton makeFinishButton(){

        finishButton = new JButton("Finish");
        setBackground(Color.RED);
        setForeground(Color.WHITE);
        Border borderboton = BorderFactory.createLineBorder(Color.RED, 3);
        setBorder(borderboton);
        return finishButton;

    }

    /**
     * metodo para crear el boton de ir al menu de seleccion de pokemon
     * @return el boton creado
     */
    public JButton makeSelecTionButton(){

        selectionButton = new JButton("Seleccion de Pokemon");
        setBackground(Color.CYAN);
        setForeground(Color.BLACK);
        Border borderboton = BorderFactory.createLineBorder(Color.RED, 3);
        setBorder(borderboton);
        return selectionButton;

    }


    /**
     * getter y setter de los botones de la interfaz luck
     * @return os botones correspondientes
     */
    public static JButton getFaceButton() {
        return faceButton;
    }

    public static JButton getTailButton() {
        return tailButton;
    }

    public static JButton getConfirmbuttonPlayer1() {
        return confirmbuttonPlayer1;
    }

    public static JButton getConfirmbuttonPlayer2() {
        return confirmbuttonPlayer2;
    }

    public static JButton getFinishButton() {
        return finishButton;
    }

    public static void setFinishButton(JButton finishButton) {
        ButtonInterfaceLuck.finishButton = finishButton;
    }

    public static JButton getSelectionButton() {
        return selectionButton;
    }

    public static void setSelectionButton(JButton selectionButton) {
        ButtonInterfaceLuck.selectionButton = selectionButton;
    }
}
