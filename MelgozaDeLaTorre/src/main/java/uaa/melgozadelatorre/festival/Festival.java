package uaa.melgozadelatorre.festival;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import uaa.melgozadelatorre.festival.dias.*;

public class Festival extends JFrame {

    private JButton salir;
    private JButton general;
    private JButton infoDia1;
    private JButton infoDia2;
    private JButton infoDia3;
    private JLabel text;
    private JPanel superior;
    private JPanel central;
    private JPanel inferior;

    private Infogeneral infoGeneral;
    private Dia1 dia1;
    private Dia2 dia2;
    private Dia3 dia3;

    public Festival() {
        initComponents();
    }

    private void initComponents() {
        setUndecorated(true);
        setLayout(null);
        setResizable(false);
        setSize(600, 400);
        setLocationRelativeTo(null);
        setVisible(true);

        infoGeneral = new Infogeneral();
        infoGeneral.setSize(588, 268);
        infoGeneral.setLocation(0, 0);

        dia1 = new Dia1();
        dia1.setSize(588, 268);
        dia1.setLocation(0, 0);

        dia2 = new Dia2();
        dia2.setSize(588, 268);
        dia2.setLocation(0, 0);

        dia3 = new Dia3();
        dia3.setSize(588, 268);
        dia3.setLocation(0, 0);

        superior = new JPanel();
        superior.setLayout(null);
        superior.setBounds(0, 0, 588, 65);
        superior.setLocation(6, 6);
        superior.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        central = new JPanel();
        central.setLayout(null);
        central.setBounds(0, 0, 588, 268);
        central.setLocation(6, 77);
        central.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        inferior = new JPanel();
        inferior.setLayout(null);
        inferior.setBounds(0, 0, 588, 42);
        inferior.setLocation(6, 351);
        inferior.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        text = new JLabel("Selecciones los botones para ver informacion");
        text.setFont(new java.awt.Font("Tahoma", 0, 16));
        int ancho = text.getFontMetrics(text.getFont()).stringWidth(text.getText());
        int alto = text.getFontMetrics(text.getFont()).getHeight();
        int posY = 12;
        text.setBounds(10, posY, ancho + 20, alto);
        inferior.add(text);

        salir = new JButton("Salir");
        salir.setFont(new java.awt.Font("Tahoma", 0, 16));
        ancho = salir.getFontMetrics(salir.getFont()).stringWidth(salir.getText()) + 30;
        alto = salir.getFontMetrics(salir.getFont()).getHeight();
        salir.setBounds(588 - ancho - 40, posY, ancho + 20, alto);
        salir.addActionListener(e -> System.exit(0));
        inferior.add(salir);

        general = new JButton("Restaurar");
        general.setFont(new java.awt.Font("Tahoma", 0, 16));
        ancho = general.getFontMetrics(general.getFont()).stringWidth(general.getText()) + 30;
        alto = general.getFontMetrics(general.getFont()).getHeight();
        general.setBounds(salir.getBounds().x - ancho - 40, posY, ancho + 20, alto);
        general.addActionListener(e -> {
            central.removeAll();
            central.add(infoGeneral);
            central.repaint();
            central.revalidate();
            infoDia1.setEnabled(true);
            infoDia2.setEnabled(true);
            infoDia3.setEnabled(true);
        });
        inferior.add(general);

        infoDia1 = new JButton("Dia 1");
        infoDia1.setFont(new java.awt.Font("Tahoma", 0, 18));
        ancho = infoDia1.getFontMetrics(infoDia1.getFont()).stringWidth(infoDia1.getText()) + 30;
        alto = infoDia1.getFontMetrics(infoDia1.getFont()).getHeight();
        posY = 20;
        infoDia1.setBounds(20, posY, ancho + 20, alto + 10);
        infoDia1.addActionListener(e -> {
            central.removeAll();
            central.add(dia1, BorderLayout.CENTER);
            central.repaint();
            central.revalidate();
            infoDia1.setEnabled(false);
            infoDia2.setEnabled(true);
            infoDia3.setEnabled(true);
        });
        superior.add(infoDia1);

        infoDia2 = new JButton("Dia 2");
        infoDia2.setFont(new java.awt.Font("Tahoma", 0, 18));
        ancho = infoDia2.getFontMetrics(infoDia2.getFont()).stringWidth(infoDia2.getText()) + 30;
        alto = infoDia2.getFontMetrics(infoDia2.getFont()).getHeight();
        infoDia2.setBounds((588 - ancho) / 2, posY, ancho + 20, alto + 10);
        infoDia2.addActionListener(e -> {
            central.removeAll();
            central.add(dia2, BorderLayout.CENTER);
            central.repaint();
            central.revalidate();
            infoDia1.setEnabled(true);
            infoDia2.setEnabled(false);
            infoDia3.setEnabled(true);
        });
        superior.add(infoDia2);

        infoDia3 = new JButton("Dia 3");
        text = new JLabel("Presiona los botones para ver informacion del festival");
        infoDia3.setFont(new java.awt.Font("Tahoma", 0, 18));
        ancho = infoDia3.getFontMetrics(infoDia3.getFont()).stringWidth(infoDia3.getText()) + 30;
        alto = infoDia3.getFontMetrics(infoDia3.getFont()).getHeight();
        infoDia3.setBounds(588 - ancho - 40, posY, ancho + 20, alto + 10);
        infoDia3.addActionListener(e -> {
            central.removeAll();
            central.add(dia3, BorderLayout.CENTER);
            central.repaint();
            central.revalidate();
            infoDia1.setEnabled(true);
            infoDia2.setEnabled(true);
            infoDia3.setEnabled(false);
        });
        superior.add(infoDia3);

        central.add(infoGeneral, BorderLayout.CENTER);
        central.repaint();
        central.revalidate();

        add(superior);
        add(central);
        add(inferior);
        revalidate();
        repaint();
        setVisible(true);

    }

    public static void main(String[] args) {
        new Festival();
    }
}
