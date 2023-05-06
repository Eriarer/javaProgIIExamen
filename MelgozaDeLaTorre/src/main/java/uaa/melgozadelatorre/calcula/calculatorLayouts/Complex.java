package uaa.melgozadelatorre.calcula.calculatorLayouts;

import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Complex extends javax.swing.JPanel {
    JTextField answer;
    JTextArea ecuation;

    public Complex() {
        initComponents();
    }

    public void setTextAreas(JTextField answer, JTextArea ecuation) {
        this.answer = answer;
        this.ecuation = ecuation;
    }

    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        sen = new javax.swing.JButton();
        cos = new javax.swing.JButton();
        tan = new javax.swing.JButton();
        log = new javax.swing.JButton();
        ln = new javax.swing.JButton();
        leftBracket = new javax.swing.JButton();
        rigthBracket = new javax.swing.JButton();
        module = new javax.swing.JButton();
        squareRoot = new javax.swing.JButton();
        exponencial = new javax.swing.JButton();
        division = new javax.swing.JButton();
        zero = new javax.swing.JButton();
        one = new javax.swing.JButton();
        two = new javax.swing.JButton();
        three = new javax.swing.JButton();
        five = new javax.swing.JButton();
        six = new javax.swing.JButton();
        seven = new javax.swing.JButton();
        eight = new javax.swing.JButton();
        nine = new javax.swing.JButton();
        del = new javax.swing.JButton();
        areaClear = new javax.swing.JButton();
        four = new javax.swing.JButton();
        multiplie = new javax.swing.JButton();
        addition = new javax.swing.JButton();
        substraction = new javax.swing.JButton();
        dot = new javax.swing.JButton();
        powOfTen = new javax.swing.JButton();
        lastAnswer = new javax.swing.JButton();
        equals = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(378, 406));
        setMinimumSize(new java.awt.Dimension(378, 406));
        java.awt.GridBagLayout layout = new java.awt.GridBagLayout();
        layout.columnWidths = new int[] {0, 10, 0, 10, 0, 10, 0, 10, 0};
        layout.rowHeights = new int[] {0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0};
        setLayout(layout);

        sen.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        sen.setText("sen");
        sen.setMinimumSize(new java.awt.Dimension(0, 0));
        sen.setPreferredSize(new java.awt.Dimension(60, 18));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 6;
        gridBagConstraints.ipady = 26;
        add(sen, gridBagConstraints);

        cos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cos.setText("cos");
        cos.setMinimumSize(new java.awt.Dimension(0, 0));
        cos.setPreferredSize(new java.awt.Dimension(60, 18));
        cos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cosActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 6;
        gridBagConstraints.ipady = 26;
        add(cos, gridBagConstraints);

        tan.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tan.setText("tan");
        tan.setMinimumSize(new java.awt.Dimension(0, 0));
        tan.setPreferredSize(new java.awt.Dimension(60, 18));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 6;
        gridBagConstraints.ipady = 26;
        add(tan, gridBagConstraints);

        log.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        log.setText("log");
        log.setMinimumSize(new java.awt.Dimension(0, 0));
        log.setPreferredSize(new java.awt.Dimension(60, 18));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 6;
        gridBagConstraints.ipady = 26;
        add(log, gridBagConstraints);

        ln.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ln.setText("ln");
        ln.setMinimumSize(new java.awt.Dimension(0, 0));
        ln.setPreferredSize(new java.awt.Dimension(60, 18));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 6;
        gridBagConstraints.ipady = 26;
        add(ln, gridBagConstraints);

        leftBracket.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        leftBracket.setText("(");
        leftBracket.setMinimumSize(new java.awt.Dimension(0, 0));
        leftBracket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leftBracketActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 6;
        gridBagConstraints.ipady = 18;
        add(leftBracket, gridBagConstraints);

        rigthBracket.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        rigthBracket.setText(")");
        rigthBracket.setMinimumSize(new java.awt.Dimension(0, 0));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 6;
        gridBagConstraints.ipady = 18;
        add(rigthBracket, gridBagConstraints);

        module.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        module.setText("%");
        module.setMinimumSize(new java.awt.Dimension(0, 0));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 6;
        gridBagConstraints.ipady = 18;
        add(module, gridBagConstraints);

        squareRoot.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        squareRoot.setText("sqrt");
        squareRoot.setMinimumSize(new java.awt.Dimension(0, 0));
        squareRoot.setPreferredSize(new java.awt.Dimension(60, 18));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 6;
        gridBagConstraints.ipady = 18;
        add(squareRoot, gridBagConstraints);

        exponencial.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        exponencial.setText("n^x");
        exponencial.setMinimumSize(new java.awt.Dimension(0, 0));
        exponencial.setPreferredSize(new java.awt.Dimension(60, 18));
        exponencial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exponencialActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 6;
        gridBagConstraints.ipady = 18;
        add(exponencial, gridBagConstraints);

        division.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        division.setText("/");
        division.setMinimumSize(new java.awt.Dimension(0, 0));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 6;
        gridBagConstraints.ipady = 18;
        add(division, gridBagConstraints);

        zero.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        zero.setText("0");
        zero.setMinimumSize(new java.awt.Dimension(0, 0));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 6;
        gridBagConstraints.ipady = 18;
        add(zero, gridBagConstraints);

        one.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        one.setText("1");
        one.setMinimumSize(new java.awt.Dimension(0, 0));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 6;
        gridBagConstraints.ipady = 18;
        add(one, gridBagConstraints);

        two.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        two.setText("2");
        two.setMinimumSize(new java.awt.Dimension(0, 0));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 6;
        gridBagConstraints.ipady = 18;
        add(two, gridBagConstraints);

        three.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        three.setText("3");
        three.setMinimumSize(new java.awt.Dimension(0, 0));
        three.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                threeActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 6;
        gridBagConstraints.ipady = 18;
        add(three, gridBagConstraints);

        five.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        five.setText("5");
        five.setMinimumSize(new java.awt.Dimension(0, 0));
        five.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fiveActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 6;
        gridBagConstraints.ipady = 18;
        add(five, gridBagConstraints);

        six.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        six.setText("6");
        six.setMinimumSize(new java.awt.Dimension(0, 0));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 6;
        gridBagConstraints.ipady = 18;
        add(six, gridBagConstraints);

        seven.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        seven.setText("7");
        seven.setMinimumSize(new java.awt.Dimension(0, 0));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 6;
        gridBagConstraints.ipady = 18;
        add(seven, gridBagConstraints);

        eight.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        eight.setText("8");
        eight.setMinimumSize(new java.awt.Dimension(0, 0));
        eight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eightActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 6;
        gridBagConstraints.ipady = 18;
        add(eight, gridBagConstraints);

        nine.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        nine.setText("9");
        nine.setMinimumSize(new java.awt.Dimension(0, 0));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 6;
        gridBagConstraints.ipady = 18;
        add(nine, gridBagConstraints);

        del.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        del.setText("DEL");
        del.setMinimumSize(new java.awt.Dimension(0, 0));
        del.setPreferredSize(new java.awt.Dimension(60, 18));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 6;
        gridBagConstraints.ipady = 18;
        add(del, gridBagConstraints);

        areaClear.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        areaClear.setText("AC");
        areaClear.setMinimumSize(new java.awt.Dimension(0, 0));
        areaClear.setPreferredSize(new java.awt.Dimension(60, 18));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 6;
        gridBagConstraints.ipady = 18;
        add(areaClear, gridBagConstraints);

        four.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        four.setText("4");
        four.setMinimumSize(new java.awt.Dimension(0, 0));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 6;
        gridBagConstraints.ipady = 18;
        add(four, gridBagConstraints);

        multiplie.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        multiplie.setText("*");
        multiplie.setMinimumSize(new java.awt.Dimension(0, 0));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 6;
        gridBagConstraints.ipady = 18;
        add(multiplie, gridBagConstraints);

        addition.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        addition.setText("+");
        addition.setMinimumSize(new java.awt.Dimension(0, 0));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 6;
        gridBagConstraints.ipady = 18;
        add(addition, gridBagConstraints);

        substraction.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        substraction.setText("-");
        substraction.setMinimumSize(new java.awt.Dimension(0, 0));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 6;
        gridBagConstraints.ipady = 18;
        add(substraction, gridBagConstraints);

        dot.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        dot.setText(".");
        dot.setMinimumSize(new java.awt.Dimension(0, 0));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 6;
        gridBagConstraints.ipady = 18;
        add(dot, gridBagConstraints);

        powOfTen.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        powOfTen.setText("x10^x");
        powOfTen.setMinimumSize(new java.awt.Dimension(0, 0));
        powOfTen.setPreferredSize(new java.awt.Dimension(60, 18));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 6;
        gridBagConstraints.ipady = 18;
        add(powOfTen, gridBagConstraints);

        lastAnswer.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lastAnswer.setText("Ans");
        lastAnswer.setMinimumSize(new java.awt.Dimension(0, 0));
        lastAnswer.setPreferredSize(new java.awt.Dimension(60, 18));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 6;
        gridBagConstraints.ipady = 18;
        add(lastAnswer, gridBagConstraints);

        equals.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        equals.setText("=");
        equals.setMinimumSize(new java.awt.Dimension(0, 0));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 6;
        gridBagConstraints.ipady = 18;
        add(equals, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void cosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cosActionPerformed

    private void leftBracketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leftBracketActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_leftBracketActionPerformed

    private void eightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eightActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eightActionPerformed

    private void fiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fiveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fiveActionPerformed

    private void threeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_threeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_threeActionPerformed

    private void exponencialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exponencialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_exponencialActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addition;
    private javax.swing.JButton areaClear;
    private javax.swing.JButton cos;
    private javax.swing.JButton del;
    private javax.swing.JButton division;
    private javax.swing.JButton dot;
    private javax.swing.JButton eight;
    private javax.swing.JButton equals;
    private javax.swing.JButton exponencial;
    private javax.swing.JButton five;
    private javax.swing.JButton four;
    private javax.swing.JButton lastAnswer;
    private javax.swing.JButton leftBracket;
    private javax.swing.JButton ln;
    private javax.swing.JButton log;
    private javax.swing.JButton module;
    private javax.swing.JButton multiplie;
    private javax.swing.JButton nine;
    private javax.swing.JButton one;
    private javax.swing.JButton powOfTen;
    private javax.swing.JButton rigthBracket;
    private javax.swing.JButton sen;
    private javax.swing.JButton seven;
    private javax.swing.JButton six;
    private javax.swing.JButton squareRoot;
    private javax.swing.JButton substraction;
    private javax.swing.JButton tan;
    private javax.swing.JButton three;
    private javax.swing.JButton two;
    private javax.swing.JButton zero;
    // End of variables declaration//GEN-END:variables
}
