package uaa.melgozadelatorre.calcula.calculatorLayouts;

import java.util.ArrayList;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.swing.JTextField;

import uaa.melgozadelatorre.calcula.CursorManager;

public class Basic extends javax.swing.JPanel {
    private JTextField answer;
    private ArrayList<String> ecuationMem;
    private ArrayList<String> answerMem;
    private int memIndex;
    private static ScriptEngine engine = new ScriptEngineManager().getEngineByName("JavaScript");

    public Basic() {
        initComponents();
        this.setVisible(true);
        initMyComponents();
    }

    private void initMyComponents() {
        // deshabilitar el foucs de cada boton
        memIndex = -1;
        ecuationMem = new ArrayList<String>();
        answerMem = new ArrayList<String>();
    }

    private CursorManager cursor;

    /** retorna la operacion anterior de la lista */
    public String[] getPrevMemory() {
        if (memIndex == -1)
            return new String[] { null, null };
        if (memIndex > 0)
            memIndex--;
        String memoria[] = { ecuationMem.get(memIndex), answerMem.get(memIndex) };
        return memoria;
    }

    /** retorna la operacion siguiente de la lista */
    public String[] getNextMemory() {
        if (memIndex == -1)
            return new String[] { null, null };
        String memoria[];
        if (memIndex < ecuationMem.size() - 1) {
            memIndex++;
            memoria = new String[] { ecuationMem.get(memIndex), answerMem.get(memIndex) };
        } else {
            memoria = new String[] { "", "" };
            memIndex = ecuationMem.size();
        }
        return memoria;
    }

    public void setCursorManager(CursorManager cursor) {
        this.cursor = cursor;
    }

    public void setAnswer(JTextField answer) {
        this.answer = answer;
    }

    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        areaClear = new javax.swing.JButton();
        leftBracket = new javax.swing.JButton();
        rigthBracket = new javax.swing.JButton();
        division = new javax.swing.JButton();
        seven = new javax.swing.JButton();
        eight = new javax.swing.JButton();
        nine = new javax.swing.JButton();
        multiplie = new javax.swing.JButton();
        four = new javax.swing.JButton();
        five = new javax.swing.JButton();
        six = new javax.swing.JButton();
        substractionn = new javax.swing.JButton();
        onne = new javax.swing.JButton();
        two = new javax.swing.JButton();
        three = new javax.swing.JButton();
        addition = new javax.swing.JButton();
        zero = new javax.swing.JButton();
        dot = new javax.swing.JButton();
        equals = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(378, 406));
        setMinimumSize(new java.awt.Dimension(378, 406));
        setPreferredSize(new java.awt.Dimension(378, 406));
        java.awt.GridBagLayout layout = new java.awt.GridBagLayout();
        layout.columnWidths = new int[] { 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0 };
        layout.rowHeights = new int[] { 0, 10, 0, 10, 0, 10, 0, 10, 0 };
        setLayout(layout);

        areaClear.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        areaClear.setText("AC");
        areaClear.setToolTipText("Elimina la operacion");
        areaClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                areaClearActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 9;
        gridBagConstraints.ipady = 4;
        gridBagConstraints.insets = new java.awt.Insets(1, 0, 1, 0);
        add(areaClear, gridBagConstraints);

        leftBracket.setFont(new java.awt.Font("Segoe UI", 1, 40)); // NOI18N
        leftBracket.setText("(");
        leftBracket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leftBracketActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.ipadx = 22;
        gridBagConstraints.ipady = 4;
        gridBagConstraints.insets = new java.awt.Insets(1, 0, 1, 0);
        add(leftBracket, gridBagConstraints);

        rigthBracket.setFont(new java.awt.Font("Segoe UI", 1, 40)); // NOI18N
        rigthBracket.setText(")");
        rigthBracket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rigthBracketActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.ipadx = 22;
        gridBagConstraints.ipady = 4;
        gridBagConstraints.insets = new java.awt.Insets(1, 0, 1, 0);
        add(rigthBracket, gridBagConstraints);

        division.setFont(new java.awt.Font("Segoe UI", 1, 40)); // NOI18N
        division.setText("/");
        division.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divisionActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.ipadx = 22;
        gridBagConstraints.ipady = 4;
        gridBagConstraints.insets = new java.awt.Insets(1, 0, 1, 0);
        add(division, gridBagConstraints);

        seven.setFont(new java.awt.Font("Segoe UI", 1, 40)); // NOI18N
        seven.setText("7");
        seven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sevenActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 9;
        gridBagConstraints.ipady = 4;
        gridBagConstraints.insets = new java.awt.Insets(1, 0, 1, 0);
        add(seven, gridBagConstraints);

        eight.setFont(new java.awt.Font("Segoe UI", 1, 40)); // NOI18N
        eight.setText("8");
        eight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eightActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.ipadx = 22;
        gridBagConstraints.ipady = 4;
        gridBagConstraints.insets = new java.awt.Insets(1, 0, 1, 0);
        add(eight, gridBagConstraints);

        nine.setFont(new java.awt.Font("Segoe UI", 1, 40)); // NOI18N
        nine.setText("9");
        nine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nineActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.ipadx = 22;
        gridBagConstraints.ipady = 4;
        gridBagConstraints.insets = new java.awt.Insets(1, 0, 1, 0);
        add(nine, gridBagConstraints);

        multiplie.setFont(new java.awt.Font("Segoe UI", 1, 40)); // NOI18N
        multiplie.setText("*");
        multiplie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplieActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.ipadx = 22;
        gridBagConstraints.ipady = 4;
        gridBagConstraints.insets = new java.awt.Insets(1, 0, 1, 0);
        add(multiplie, gridBagConstraints);

        four.setFont(new java.awt.Font("Segoe UI", 1, 40)); // NOI18N
        four.setText("4");
        four.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fourActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 9;
        gridBagConstraints.ipady = 4;
        gridBagConstraints.insets = new java.awt.Insets(1, 0, 1, 0);
        add(four, gridBagConstraints);

        five.setFont(new java.awt.Font("Segoe UI", 1, 40)); // NOI18N
        five.setText("5");
        five.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fiveActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.ipadx = 22;
        gridBagConstraints.ipady = 4;
        gridBagConstraints.insets = new java.awt.Insets(1, 0, 1, 0);
        add(five, gridBagConstraints);

        six.setFont(new java.awt.Font("Segoe UI", 1, 40)); // NOI18N
        six.setText("6");
        six.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sixActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.ipadx = 22;
        gridBagConstraints.ipady = 4;
        gridBagConstraints.insets = new java.awt.Insets(1, 0, 1, 0);
        add(six, gridBagConstraints);

        substractionn.setFont(new java.awt.Font("Segoe UI", 1, 40)); // NOI18N
        substractionn.setText("-");
        substractionn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                substractionnActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.ipadx = 22;
        gridBagConstraints.ipady = 4;
        gridBagConstraints.insets = new java.awt.Insets(1, 0, 1, 0);
        add(substractionn, gridBagConstraints);

        onne.setFont(new java.awt.Font("Segoe UI", 1, 40)); // NOI18N
        onne.setText("1");
        onne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onneActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 9;
        gridBagConstraints.ipady = 4;
        gridBagConstraints.insets = new java.awt.Insets(1, 0, 1, 0);
        add(onne, gridBagConstraints);

        two.setFont(new java.awt.Font("Segoe UI", 1, 40)); // NOI18N
        two.setText("2");
        two.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.ipadx = 22;
        gridBagConstraints.ipady = 4;
        gridBagConstraints.insets = new java.awt.Insets(1, 0, 1, 0);
        add(two, gridBagConstraints);

        three.setFont(new java.awt.Font("Segoe UI", 1, 40)); // NOI18N
        three.setText("3");
        three.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                threeActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.ipadx = 22;
        gridBagConstraints.ipady = 4;
        gridBagConstraints.insets = new java.awt.Insets(1, 0, 1, 0);
        add(three, gridBagConstraints);

        addition.setFont(new java.awt.Font("Segoe UI", 1, 40)); // NOI18N
        addition.setText("+");
        addition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                additionActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.ipadx = 22;
        gridBagConstraints.ipady = 4;
        gridBagConstraints.insets = new java.awt.Insets(2, 0, 1, 0);
        add(addition, gridBagConstraints);

        zero.setFont(new java.awt.Font("Segoe UI", 1, 40)); // NOI18N
        zero.setText("0");
        zero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zeroActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 9;
        gridBagConstraints.ipady = 4;
        gridBagConstraints.insets = new java.awt.Insets(1, 0, 1, 0);
        add(zero, gridBagConstraints);

        dot.setFont(new java.awt.Font("Segoe UI", 1, 40)); // NOI18N
        dot.setText(".");
        dot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dotActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.ipadx = 22;
        gridBagConstraints.ipady = 4;
        gridBagConstraints.insets = new java.awt.Insets(1, 0, 1, 0);
        add(dot, gridBagConstraints);

        equals.setFont(new java.awt.Font("Segoe UI", 1, 40)); // NOI18N
        equals.setText("=");
        equals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equalsActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.ipadx = 22;
        gridBagConstraints.ipady = 4;
        gridBagConstraints.insets = new java.awt.Insets(1, 0, 1, 0);
        add(equals, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void leftBracketActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_leftBracketActionPerformed
        cursor.insert("(");
    }// GEN-LAST:event_leftBracketActionPerformed

    private void rigthBracketActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_rigthBracketActionPerformed
        cursor.insert(")");
    }// GEN-LAST:event_rigthBracketActionPerformed

    private void divisionActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_divisionActionPerformed
        cursor.insert("/");
    }// GEN-LAST:event_divisionActionPerformed

    private void sevenActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_sevenActionPerformed
        cursor.insert("7");
    }// GEN-LAST:event_sevenActionPerformed

    private void eightActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_eightActionPerformed
        cursor.insert("8");
    }// GEN-LAST:event_eightActionPerformed

    private void multiplieActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_multiplieActionPerformed
        cursor.insert("*");
    }// GEN-LAST:event_multiplieActionPerformed

    private void fourActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_fourActionPerformed
        cursor.insert("4");
    }// GEN-LAST:event_fourActionPerformed

    private void fiveActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_fiveActionPerformed
        cursor.insert("5");
    }// GEN-LAST:event_fiveActionPerformed

    private void sixActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_sixActionPerformed
        cursor.insert("6");
    }// GEN-LAST:event_sixActionPerformed

    private void substractionnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_substractionnActionPerformed
        cursor.insert("-");
    }// GEN-LAST:event_substractionnActionPerformed

    private void onneActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_onneActionPerformed
        cursor.insert("1");
    }// GEN-LAST:event_onneActionPerformed

    private void twoActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_twoActionPerformed
        cursor.insert("2");
    }// GEN-LAST:event_twoActionPerformed

    private void threeActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_threeActionPerformed
        cursor.insert("3");
    }// GEN-LAST:event_threeActionPerformed

    private void zeroActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_zeroActionPerformed
        cursor.insert("0");
    }// GEN-LAST:event_zeroActionPerformed

    private void dotActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_dotActionPerformed
        cursor.insert(".");
    }// GEN-LAST:event_dotActionPerformed

    private void additionActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_additionActionPerformed
        cursor.insert("+");
    }// GEN-LAST:event_additionActionPerformed

    private void nineActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_nineActionPerformed
        cursor.insert("9");
    }// GEN-LAST:event_nineActionPerformed

    private void equalsActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_equalsActionPerformed
        if (cursor.getEcuation().equals(""))
            return;

        try {
            double sol = Basic.eval(cursor.getEcuation());

            if (sol % 1 == 0)
                this.answer.setText(String.valueOf((int) sol));
            else
                this.answer.setText(String.valueOf(sol));
        } catch (RuntimeException e) {
            this.answer.setText(e.getMessage());
            return;
        }

        // elimina
        if (ecuationMem.size() == 10) {
            ecuationMem.remove(0);
            answerMem.remove(0);
        }
        ecuationMem.add(cursor.getEcuation());
        answerMem.add(this.answer.getText());
        memIndex = ecuationMem.size() - 1;
    }// GEN-LAST:event_equalsActionPerformed

    private void areaClearActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_areaClearActionPerformed
        cursor.clear();
        this.answer.setText("");
    }// GEN-LAST:event_areaClearActionPerformed

    public static double eval(final String str) throws RuntimeException {
        return new Object() {
            int pos = -1, ch;

            void nextChar() {
                ch = (++pos < str.length()) ? str.charAt(pos) : -1;
            }

            boolean eat(int charToEat) {
                while (ch == ' ')
                    nextChar();
                if (ch == charToEat) {
                    nextChar();
                    return true;
                }
                return false;
            }

            double parse() {
                nextChar();
                double x = parseExpression();
                if (pos < str.length())
                    throw new RuntimeException("Unexpected: " + (char) ch);
                return x;
            }

            // Grammar:
            // expression = term | expression `+` term | expression `-` term
            // term = factor | term `*` factor | term `/` factor
            // factor = `+` factor | `-` factor | `(` expression `)` | number
            // | functionName `(` expression `)` | functionName factor

            double parseExpression() {
                double x = parseTerm();
                for (;;) {
                    if (eat('+'))
                        x += parseTerm(); // addition
                    else if (eat('-'))
                        x -= parseTerm(); // subtraction
                    else
                        return x;
                }
            }

            double parseTerm() {
                double x = parseFactor();
                for (;;) {
                    if (eat('*'))
                        x *= parseFactor(); // multiplication
                    else if (eat('/'))
                        x /= parseFactor(); // division
                    else
                        return x;
                }
            }

            double parseFactor() {
                if (eat('+'))
                    return +parseFactor(); // unary plus
                if (eat('-'))
                    return -parseFactor(); // unary minus

                double x;
                int startPos = this.pos;
                if (eat('(')) { // parentheses
                    x = parseExpression();
                    if (!eat(')'))
                        throw new RuntimeException("Missing ')'");
                } else if ((ch >= '0' && ch <= '9') || ch == '.') { // numbers
                    while ((ch >= '0' && ch <= '9') || ch == '.')
                        nextChar();
                    x = Double.parseDouble(str.substring(startPos, this.pos));
                } else if (ch >= 'a' && ch <= 'z') { // functions
                    while (ch >= 'a' && ch <= 'z')
                        nextChar();
                    String func = str.substring(startPos, this.pos);
                    if (eat('(')) {
                        x = parseExpression();
                        if (!eat(')'))
                            throw new RuntimeException("Missing ')' after argument to " + func);
                    } else {
                        x = parseFactor();
                    }
                    if (func.equals("sqrt"))
                        x = Math.sqrt(x);
                    else if (func.equals("sin"))
                        x = Math.sin(Math.toRadians(x));
                    else if (func.equals("cos"))
                        x = Math.cos(Math.toRadians(x));
                    else if (func.equals("tan"))
                        x = Math.tan(Math.toRadians(x));
                    else
                        throw new RuntimeException("Unknown function: " + func);
                } else {
                    throw new RuntimeException("Unexpected: " + (char) ch);
                }

                return x;
            }
        }.parse();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addition;
    private javax.swing.JButton areaClear;
    private javax.swing.JButton division;
    private javax.swing.JButton dot;
    private javax.swing.JButton eight;
    private javax.swing.JButton equals;
    private javax.swing.JButton five;
    private javax.swing.JButton four;
    private javax.swing.JButton leftBracket;
    private javax.swing.JButton multiplie;
    private javax.swing.JButton nine;
    private javax.swing.JButton onne;
    private javax.swing.JButton rigthBracket;
    private javax.swing.JButton seven;
    private javax.swing.JButton six;
    private javax.swing.JButton substractionn;
    private javax.swing.JButton three;
    private javax.swing.JButton two;
    private javax.swing.JButton zero;
    // End of variables declaration//GEN-END:variables
}
