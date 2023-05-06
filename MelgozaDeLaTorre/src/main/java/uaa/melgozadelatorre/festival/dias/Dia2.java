package uaa.melgozadelatorre.festival.dias;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Dia2 extends JPanel {

    public Dia2() {
        initComponents();
    }

    private void initComponents() {
        this.setLayout(null);
        this.setBounds(0, 0, 588, 268);
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        JLabel titulo = new javax.swing.JLabel("DIA 2");
        titulo.setFont(new java.awt.Font("Tahoma", 0, 24));
        int ancho = titulo.getFontMetrics(titulo.getFont()).stringWidth(titulo.getText());
        titulo.setBounds((getBounds().width - ancho) / 2, 10, 300, 50);
        add(titulo);

        JLabel descripcion = new JLabel("DESCRIPCION GENERAL");
        descripcion.setFont(new java.awt.Font("Tahoma", 0, 14));
        ancho = descripcion.getFontMetrics(descripcion.getFont()).stringWidth(descripcion.getText());
        int alto = descripcion.getFontMetrics(descripcion.getFont()).getHeight();
        int posY = titulo.getY() + titulo.getBounds().height + 10;
        descripcion.setBounds((getBounds().width - ancho) / 2, posY, ancho, alto);
        add(descripcion);

        JLabel fecha = new JLabel("Fecha de inicio: 16 de mayo");
        fecha.setFont(new java.awt.Font("Tahoma", 0, 14));
        ancho = fecha.getFontMetrics(fecha.getFont()).stringWidth(fecha.getText());
        alto = fecha.getFontMetrics(fecha.getFont()).getHeight();
        posY = descripcion.getY() + descripcion.getBounds().height + 10;
        fecha.setBounds((getBounds().width - ancho) / 2, posY, ancho, alto);
        add(fecha);

        JLabel hora = new JLabel("Hora de inicio: 10:00 am");
        hora.setFont(new java.awt.Font("Tahoma", 0, 14));
        ancho = hora.getFontMetrics(hora.getFont()).stringWidth(hora.getText());
        alto = hora.getFontMetrics(hora.getFont()).getHeight();
        posY = fecha.getY() + fecha.getBounds().height + 10;
        hora.setBounds((getBounds().width - ancho) / 2, posY, ancho, alto);
        add(hora);

        JLabel duracion = new JLabel("Duracion: 8 horas");
        duracion.setFont(new java.awt.Font("Tahoma", 0, 14));
        ancho = duracion.getFontMetrics(duracion.getFont()).stringWidth(duracion.getText());
        alto = duracion.getFontMetrics(duracion.getFont()).getHeight();
        posY = hora.getY() + hora.getBounds().height + 10;
        duracion.setBounds((getBounds().width - ancho) / 2, posY, ancho, alto);
        add(duracion);

        JScrollPane scroll = new JScrollPane();
        ancho = 500;
        posY = duracion.getY() + duracion.getBounds().height + 10;
        alto = 268 - posY - 10;
        int posX = (getBounds().width - ancho) / 2;
        scroll.setBounds(posX, posY, ancho, alto);
        add(scroll);

        JTextArea descripcionGeneral = new JTextArea(
                "El segundo día del festival se llevará a cabo en el parque de la ciudad, en donde se presentarán bandas de rock y pop, así como artistas solistas. El evento comenzará a las 10:00 am y terminará a las 6:00 pm. El evento es gratuito y abierto al público en general.");
        descripcionGeneral.setEditable(false);
        descripcionGeneral.setFont(new java.awt.Font("Tahoma", 0, 14));
        descripcionGeneral.setLineWrap(true);
        descripcionGeneral.setWrapStyleWord(true);
        scroll.setViewportView(descripcionGeneral);

        setVisible(true);
        revalidate();
        repaint();
    }
}
