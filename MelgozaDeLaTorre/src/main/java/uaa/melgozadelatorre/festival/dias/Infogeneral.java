package uaa.melgozadelatorre.festival.dias;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Infogeneral extends JPanel {

    public Infogeneral() {
        initComponents();
    }

    private void initComponents() {
        this.setLayout(null);
        this.setBounds(0, 0, 588, 268);
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        JLabel titulo = new javax.swing.JLabel("Festival de la cancion");
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

        JLabel fecha = new JLabel("Fecha de inicio: 15 de mayo");
        fecha.setFont(new java.awt.Font("Tahoma", 0, 14));
        ancho = fecha.getFontMetrics(fecha.getFont()).stringWidth(fecha.getText());
        alto = fecha.getFontMetrics(fecha.getFont()).getHeight();
        posY = descripcion.getY() + descripcion.getBounds().height + 10;
        fecha.setBounds((getBounds().width - ancho) / 2, posY, ancho, alto);
        add(fecha);

        JLabel lugar = new JLabel("Lugar: Auditorio de la UAA");
        lugar.setFont(new java.awt.Font("Tahoma", 0, 14));
        ancho = lugar.getFontMetrics(lugar.getFont()).stringWidth(lugar.getText());
        alto = lugar.getFontMetrics(lugar.getFont()).getHeight();
        posY = fecha.getY() + fecha.getBounds().height + 10;
        lugar.setBounds((getBounds().width - ancho) / 2, posY, ancho, alto);
        add(lugar);

        JScrollPane scroll = new JScrollPane(descripcion);
        ancho = 500;
        posY = lugar.getBounds().y + lugar.getBounds().height + 10;
        alto = 268 - posY - 10;
        int posX = (getBounds().width - ancho) / 2;
        scroll.setBounds(posX, posY, ancho, alto);
        add(scroll);

        JTextArea texto = new JTextArea(
                "El Festival de la Canción es un evento que se realiza cada año en la Universidad Autónoma de Aguascalientes, en el cual participan alumnos de todas las carreras de la institución. El objetivo de este evento es fomentar la convivencia entre los alumnos, así como el desarrollo de sus habilidades artísticas y culturales.");
        texto.setFont(new java.awt.Font("Tahoma", 0, 14));
        texto.setLineWrap(true);
        texto.setWrapStyleWord(true);
        texto.setEditable(false);
        scroll.setViewportView(texto);

        setVisible(true);
        revalidate();
        repaint();
    }

}
