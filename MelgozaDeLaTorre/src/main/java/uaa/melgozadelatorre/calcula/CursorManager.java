package uaa.melgozadelatorre.calcula;

import javax.swing.JTextArea;

public class CursorManager {
    // se encargara de manejar el texto de la ecuacion
    // colocando un cursor artificial y permitiendo moverlo
    // con funciones publicas
    // se encarga de insertar y eliminar caracteres de la ecuacion
    // se encarga de manejar el cursor en pocas palabras
    // simbolo del cursor: ¦

    private String ecuation;
    private int cursor;
    private JTextArea ecuationTextArea;
    private static final String pointer = "¦";

    public CursorManager(JTextArea ecuationTextArea) {
        this.ecuation = pointer;
        this.cursor = 0;
        this.ecuationTextArea = ecuationTextArea;
        this.ecuationTextArea.setText(ecuation);
        animateCursor();
    }

    /**
     * animacion del cursor (es un nuevo hilo que cada x tiempo muestra y oculta el
     * cursor)
     */
    private void animateCursor() {
        new Thread(() -> {
            boolean show = true;
            while (true) {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (show)
                    ecuation = ecuation.substring(0, cursor) + pointer + ecuation.substring(cursor + 1);
                else
                    ecuation = ecuation.substring(0, cursor) + "·" + ecuation.substring(cursor + 1);
                show = !show;
                ecuationTextArea.setText(ecuation);
            }
        }).start();
    }

    /** inserta el numero a la izquierda de el cursor */
    public void insert(String text) {
        ecuation = ecuation.substring(0, cursor) + text + ecuation.substring(cursor);
        cursor += text.length();
        ecuationTextArea.setText(ecuation);
        return;
    }

    /** mueve el cursor a la derecha y actualiza el texto */
    public void moveR() {
        if (cursor < ecuation.length()) {
            ecuation = ecuation.substring(0, cursor) + ecuation.charAt(cursor + 1) + pointer
                    + ecuation.substring(cursor + 2);
            cursor++;
            ecuationTextArea.setText(ecuation);
        }
        return;
    }

    /** mueve el cursor a la izquierda y actualiza el texto */
    public void moveL() {
        if (cursor > 0) {
            ecuation = ecuation.substring(0, cursor - 1) + pointer + ecuation.charAt(cursor - 1)
                    + ecuation.substring(cursor + 1);
            cursor--;
            ecuationTextArea.setText(ecuation);
        }
        return;
    }

    /** borra el texto */
    public void clear() {
        ecuation = pointer;
        cursor = 0;
        ecuationTextArea.setText(ecuation);
    }

    /** regresa la ecuacion */
    public String getEcuation() {
        return ecuation.substring(0, cursor) + ecuation.substring(cursor + 1);
    }

    /** actualiza el texto dejando el cursor al final */
    public void updateText(String text) {
        ecuation = text + pointer;
        cursor = text.length();
        ecuationTextArea.setText(ecuation);
    }
}
