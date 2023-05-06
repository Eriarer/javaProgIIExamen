package uaa.melgozadelatorre.calcula;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import uaa.melgozadelatorre.calcula.calculatorLayouts.Basic;
import uaa.melgozadelatorre.calcula.calculatorLayouts.Complex;

public class Calculadora extends javax.swing.JFrame {
    private boolean isBasic = true;
    private static final String basicPath = "/uaa/melgozadelatorre/images/basicToggle.png";
    private static final String cientificPath = "/uaa/melgozadelatorre/images/cientificToggle.png";
    private Basic basic = new Basic();
    private Complex complex = new Complex();
    private CursorManager cursorManager;

    public Calculadora() {
        initComponents();
        initMyComponents();
    }

    private void initMyComponents() {
        this.setTitle("Calculadora");
        this.modeToggle.setBounds(0, 0, 80, 39);
        this.setImage(modeToggle, basicPath);
        cursorManager = new CursorManager(ecuation);
        this.answer.setEditable(false);
        this.ecuation.setEditable(false);
        this.basic.setSize(378, 406);
        this.basic.setAnswer(answer);
        this.basic.setCursorManager(cursorManager);
        this.complex.setSize(378, 406);
        this.complex.setTextAreas(answer, ecuation);
        this.buttonPlaceHolder.add(basic);
        this.buttonPlaceHolder.revalidate();
        this.buttonPlaceHolder.repaint();

    }

    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        display = new javax.swing.JPanel();
        answer = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        ecuation = new javax.swing.JTextArea();
        optionsPanel = new javax.swing.JPanel();
        modeToggle = new javax.swing.JLabel();
        up = new javax.swing.JButton();
        down = new javax.swing.JButton();
        left = new javax.swing.JButton();
        rigth = new javax.swing.JButton();
        buttonPlaceHolder = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(420, 650));
        getContentPane().setLayout(null);

        display.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        answer.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        answer.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        display.add(answer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 378, 42));

        ecuation.setColumns(20);
        ecuation.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
        ecuation.setForeground(new java.awt.Color(0, 0, 0));
        ecuation.setRows(1);
        ecuation.setTabSize(0);
        jScrollPane1.setViewportView(ecuation);

        display.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 378, 70));

        getContentPane().add(display);
        display.setBounds(14, 14, 378, 112);

        modeToggle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                modeToggleMousePressed(evt);
            }
        });

        up.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        up.setText("↑");
        up.setToolTipText("Operacion anterior");
        up.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upActionPerformed(evt);
            }
        });

        down.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        down.setText("↓");
        down.setToolTipText("Operacion siguiente");
        down.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                downActionPerformed(evt);
            }
        });

        left.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        left.setText("←");
        left.setToolTipText("Mover cursor a la izquierda");
        left.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leftActionPerformed(evt);
            }
        });

        rigth.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        rigth.setText("→");
        rigth.setToolTipText("Mover cursor a la derecha");
        rigth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rigthActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout optionsPanelLayout = new javax.swing.GroupLayout(optionsPanel);
        optionsPanel.setLayout(optionsPanelLayout);
        optionsPanelLayout.setHorizontalGroup(
                optionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(optionsPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(modeToggle, javax.swing.GroupLayout.PREFERRED_SIZE, 80,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(84, 84, 84)
                                .addComponent(up, javax.swing.GroupLayout.PREFERRED_SIZE, 45,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(down, javax.swing.GroupLayout.PREFERRED_SIZE, 45,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(left, javax.swing.GroupLayout.PREFERRED_SIZE, 45,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rigth, javax.swing.GroupLayout.PREFERRED_SIZE, 45,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(10, Short.MAX_VALUE)));
        optionsPanelLayout.setVerticalGroup(
                optionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, optionsPanelLayout.createSequentialGroup()
                                .addContainerGap(13, Short.MAX_VALUE)
                                .addGroup(optionsPanelLayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(rigth, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                                        .addComponent(left, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(down, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(up, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(modeToggle, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap()));

        getContentPane().add(optionsPanel);
        optionsPanel.setBounds(14, 126, 378, 56);

        javax.swing.GroupLayout buttonPlaceHolderLayout = new javax.swing.GroupLayout(buttonPlaceHolder);
        buttonPlaceHolder.setLayout(buttonPlaceHolderLayout);
        buttonPlaceHolderLayout.setHorizontalGroup(
                buttonPlaceHolderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 378, Short.MAX_VALUE));
        buttonPlaceHolderLayout.setVerticalGroup(
                buttonPlaceHolderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 406, Short.MAX_VALUE));

        getContentPane().add(buttonPlaceHolder);
        buttonPlaceHolder.setBounds(14, 182, 378, 406);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void modeToggleMousePressed(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_modeToggleMousePressed
        if (isBasic) {
            this.setImage(modeToggle, cientificPath);
            this.buttonPlaceHolder.removeAll();
            this.buttonPlaceHolder.add(complex);
            this.buttonPlaceHolder.revalidate();
            this.buttonPlaceHolder.repaint();
        } else {
            this.setImage(modeToggle, basicPath);
            this.buttonPlaceHolder.removeAll();
            this.buttonPlaceHolder.add(basic);
            this.buttonPlaceHolder.revalidate();
            this.buttonPlaceHolder.repaint();
        }
        isBasic = !isBasic;
        cursorManager.clear();
        this.answer.setText("");
    }// GEN-LAST:event_modeToggleMousePressed

    private void setImage(JLabel label, String path) {
        ImageIcon icon = new ImageIcon(getClass().getResource(path));
        Image image = icon.getImage();
        int w = label.getBounds().width;
        int h = label.getBounds().height;
        Image scaledImage = image.getScaledInstance(w, h, Image.SCALE_SMOOTH);
        label.setIcon(new ImageIcon(scaledImage));
    }

    private void upActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_upActionPerformed
        String ecuacion = "";
        String resultado = "";
        String memoria[];
        // va a la memoria anterior si es que hay memoria anterior y la actualiza
        if (isBasic) {
            memoria = this.basic.getPrevMemory();
            if (memoria[0] == null)
                return;
            ecuacion = memoria[0];
            resultado = memoria[1];
        }

        cursorManager.updateText(ecuacion);
        this.answer.setText(resultado);
    }// GEN-LAST:event_upActionPerforme

    private void downActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_downActionPerformed
        String ecuacion = "";
        String resultado = "";
        String memoria[];
        // va a la memoria siguiente si es que hay memoria siguiente y la actualiza
        if (isBasic) {
            memoria = this.basic.getNextMemory();
            if (memoria[0] == null)
                return;
            ecuacion = memoria[0];
            resultado = memoria[1];
        }

        cursorManager.updateText(ecuacion);
        this.answer.setText(resultado);

    }// GEN-LAST:event_downActionPerformed

    private void leftActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_leftActionPerformed
        this.cursorManager.moveL();
    }// GEN-LAST:event_leftActionPerformed

    private void rigthActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_rigthActionPerformed
        this.cursorManager.moveR();
    }// GEN-LAST:event_rigthActionPerformed

    private void shiftActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jToggleButton2ActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_jToggleButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField answer;
    private javax.swing.JPanel buttonPlaceHolder;
    private javax.swing.JPanel display;
    private javax.swing.JButton down;
    private javax.swing.JTextArea ecuation;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton left;
    private javax.swing.JLabel modeToggle;
    private javax.swing.JPanel optionsPanel;
    private javax.swing.JButton rigth;
    private javax.swing.JButton up;
    // End of variables declaration//GEN-END:variables
}
