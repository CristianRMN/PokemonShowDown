package com.dam.proyectoprogramacion.model.Songs;




import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

/**
 * clase con el grito de drampa
 * @author cristian
 * @version v2.0
 */
public class LuxraySong {

    public static void musicLuxray() {
        try {
            /**
             * Cargar el archivo de audio
             */
            File audioFile = new File("canciones/gritoLuxray.wav");
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);

            /**
             *  Obtener el formato de audio
             */
            AudioFormat format = audioStream.getFormat();
            DataLine.Info info = new DataLine.Info(Clip.class, format);

            /**
             * / Abrir el clip
             */
            Clip clip = (Clip) AudioSystem.getLine(info);
            clip.open(audioStream);

            /**
             * / Reproducir el audio en bucle infinito
             */
            clip.start();



            /**
             * capturamos la excepcion en caso de que no se reproduzca la musica
             */
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            e.printStackTrace();
        }
    }
}


