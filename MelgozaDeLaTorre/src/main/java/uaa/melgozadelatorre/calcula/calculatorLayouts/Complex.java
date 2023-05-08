package uaa.melgozadelatorre.calcula.calculatorLayouts;

import java.util.ArrayList;

import javax.swing.JTextField;

import uaa.melgozadelatorre.calcula.CursorManager;

public class Complex extends javax.swing.JPanel {
    JTextField answer;
    private ArrayList<String> ecuationMem;
    private ArrayList<String> answerMem;
    private int memIndex;
    private CursorManager cursor;

    public Complex() {
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

    /** retorna un valor doble de la ultima respuesta guardada */
    private double getAnswer() {
        if (answerMem.size() == 0)
            return 0;
        return Double.parseDouble(answerMem.get(answerMem.size() - 1));
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

        setFocusCycleRoot(true);
        setFocusable(false);
        setMaximumSize(new java.awt.Dimension(378, 406));
        setMinimumSize(new java.awt.Dimension(378, 406));
        setPreferredSize(new java.awt.Dimension(378, 406));
        setRequestFocusEnabled(false);
        java.awt.GridBagLayout layout = new java.awt.GridBagLayout();
        layout.columnWidths = new int[] { 0, 10, 0, 10, 0, 10, 0, 10, 0 };
        layout.rowHeights = new int[] { 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0 };
        setLayout(layout);

        sen.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        sen.setText("sen");
        sen.setToolTipText("sen(x)");
        sen.setMinimumSize(new java.awt.Dimension(50, 20));
        sen.setPreferredSize(new java.awt.Dimension(60, 18));
        sen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                senActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 6;
        gridBagConstraints.ipady = 26;
        add(sen, gridBagConstraints);

        cos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cos.setText("cos");
        cos.setToolTipText("cos(x)");
        cos.setMinimumSize(new java.awt.Dimension(50, 20));
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
        tan.setToolTipText("tan(x)");
        tan.setMinimumSize(new java.awt.Dimension(50, 20));
        tan.setPreferredSize(new java.awt.Dimension(60, 18));
        tan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tanActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 6;
        gridBagConstraints.ipady = 26;
        add(tan, gridBagConstraints);

        log.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        log.setText("log");
        log.setToolTipText("Log_10(x)");
        log.setMinimumSize(new java.awt.Dimension(50, 20));
        log.setPreferredSize(new java.awt.Dimension(60, 18));
        log.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 6;
        gridBagConstraints.ipady = 26;
        add(log, gridBagConstraints);

        ln.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ln.setText("ln");
        ln.setToolTipText("ln(x)");
        ln.setMinimumSize(new java.awt.Dimension(50, 20));
        ln.setPreferredSize(new java.awt.Dimension(60, 18));
        ln.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lnActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 6;
        gridBagConstraints.ipady = 26;
        add(ln, gridBagConstraints);

        leftBracket.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        leftBracket.setText("(");
        leftBracket.setMinimumSize(new java.awt.Dimension(50, 20));
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
        rigthBracket.setMinimumSize(new java.awt.Dimension(50, 20));
        rigthBracket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rigthBracketActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 6;
        gridBagConstraints.ipady = 18;
        add(rigthBracket, gridBagConstraints);

        module.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        module.setText("%");
        module.setToolTipText("Modulo");
        module.setMinimumSize(new java.awt.Dimension(50, 20));
        module.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moduleActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 6;
        gridBagConstraints.ipady = 18;
        add(module, gridBagConstraints);

        squareRoot.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        squareRoot.setText("sqrt");
        squareRoot.setToolTipText("raiz cuadrada");
        squareRoot.setMinimumSize(new java.awt.Dimension(50, 20));
        squareRoot.setPreferredSize(new java.awt.Dimension(60, 18));
        squareRoot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                squareRootActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 6;
        gridBagConstraints.ipady = 18;
        add(squareRoot, gridBagConstraints);

        exponencial.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        exponencial.setText("x^n");
        exponencial.setToolTipText("potencia a la n");
        exponencial.setMinimumSize(new java.awt.Dimension(50, 20));
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
        division.setMinimumSize(new java.awt.Dimension(50, 20));
        division.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divisionActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 6;
        gridBagConstraints.ipady = 18;
        add(division, gridBagConstraints);

        zero.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        zero.setText("0");
        zero.setMinimumSize(new java.awt.Dimension(50, 20));
        zero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zeroActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 6;
        gridBagConstraints.ipady = 18;
        add(zero, gridBagConstraints);

        one.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        one.setText("1");
        one.setMinimumSize(new java.awt.Dimension(50, 20));
        one.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 6;
        gridBagConstraints.ipady = 18;
        add(one, gridBagConstraints);

        two.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        two.setText("2");
        two.setMinimumSize(new java.awt.Dimension(50, 20));
        two.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 6;
        gridBagConstraints.ipady = 18;
        add(two, gridBagConstraints);

        three.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        three.setText("3");
        three.setMinimumSize(new java.awt.Dimension(50, 20));
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
        five.setMinimumSize(new java.awt.Dimension(50, 20));
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
        six.setMinimumSize(new java.awt.Dimension(50, 20));
        six.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sixActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 6;
        gridBagConstraints.ipady = 18;
        add(six, gridBagConstraints);

        seven.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        seven.setText("7");
        seven.setMinimumSize(new java.awt.Dimension(50, 20));
        seven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sevenActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 6;
        gridBagConstraints.ipady = 18;
        add(seven, gridBagConstraints);

        eight.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        eight.setText("8");
        eight.setMinimumSize(new java.awt.Dimension(50, 20));
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
        nine.setMinimumSize(new java.awt.Dimension(50, 20));
        nine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nineActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 6;
        gridBagConstraints.ipady = 18;
        add(nine, gridBagConstraints);

        del.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        del.setText("DEL");
        del.setToolTipText("eliminar caracter");
        del.setMinimumSize(new java.awt.Dimension(50, 20));
        del.setPreferredSize(new java.awt.Dimension(60, 18));
        del.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 6;
        gridBagConstraints.ipady = 18;
        add(del, gridBagConstraints);

        areaClear.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        areaClear.setText("AC");
        areaClear.setToolTipText("limpiar pantalla");
        areaClear.setMinimumSize(new java.awt.Dimension(50, 20));
        areaClear.setPreferredSize(new java.awt.Dimension(60, 18));
        areaClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                areaClearActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 6;
        gridBagConstraints.ipady = 18;
        add(areaClear, gridBagConstraints);

        four.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        four.setText("4");
        four.setMinimumSize(new java.awt.Dimension(50, 20));
        four.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fourActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 6;
        gridBagConstraints.ipady = 18;
        add(four, gridBagConstraints);

        multiplie.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        multiplie.setText("*");
        multiplie.setMinimumSize(new java.awt.Dimension(50, 20));
        multiplie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplieActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 6;
        gridBagConstraints.ipady = 18;
        add(multiplie, gridBagConstraints);

        addition.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        addition.setText("+");
        addition.setMinimumSize(new java.awt.Dimension(50, 20));
        addition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                additionActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 6;
        gridBagConstraints.ipady = 18;
        add(addition, gridBagConstraints);

        substraction.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        substraction.setText("-");
        substraction.setMinimumSize(new java.awt.Dimension(50, 20));
        substraction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                substractionActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 6;
        gridBagConstraints.ipady = 18;
        add(substraction, gridBagConstraints);

        dot.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        dot.setText(".");
        dot.setMinimumSize(new java.awt.Dimension(50, 20));
        dot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dotActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 6;
        gridBagConstraints.ipady = 18;
        add(dot, gridBagConstraints);

        powOfTen.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        powOfTen.setText("x10^x");
        powOfTen.setToolTipText("Notacion cientifica base 10");
        powOfTen.setMinimumSize(new java.awt.Dimension(50, 20));
        powOfTen.setPreferredSize(new java.awt.Dimension(60, 18));
        powOfTen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                powOfTenActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 6;
        gridBagConstraints.ipady = 18;
        add(powOfTen, gridBagConstraints);

        lastAnswer.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lastAnswer.setText("Ans");
        lastAnswer.setToolTipText("resultado anterior");
        lastAnswer.setMinimumSize(new java.awt.Dimension(50, 20));
        lastAnswer.setPreferredSize(new java.awt.Dimension(60, 18));
        lastAnswer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastAnswerActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 6;
        gridBagConstraints.ipady = 18;
        add(lastAnswer, gridBagConstraints);

        equals.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        equals.setText("=");
        equals.setMinimumSize(new java.awt.Dimension(50, 20));
        equals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equalsActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 6;
        gridBagConstraints.ipady = 18;
        add(equals, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void zeroActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_zeroActionPerformed
        cursor.insert("0");
    }// GEN-LAST:event_zeroActionPerformed

    private void oneActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_oneActionPerformed
        cursor.insert("1");
    }// GEN-LAST:event_oneActionPerformed

    private void twoActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_twoActionPerformed
        cursor.insert("2");
    }// GEN-LAST:event_twoActionPerformed

    private void threeActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_threeActionPerformed
        cursor.insert("3");
    }// GEN-LAST:event_threeActionPerformed

    private void fourActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_fourActionPerformed
        cursor.insert("4");
    }// GEN-LAST:event_fourActionPerformed

    private void fiveActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_fiveActionPerformed
        cursor.insert("5");
    }// GEN-LAST:event_fiveActionPerformed

    private void sixActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_sixActionPerformed
        cursor.insert("6");
    }// GEN-LAST:event_sixActionPerformed

    private void sevenActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_sevenActionPerformed
        cursor.insert("7");
    }// GEN-LAST:event_sevenActionPerformed

    private void eightActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_eightActionPerformed
        cursor.insert("8");
    }// GEN-LAST:event_eightActionPerformed

    private void nineActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_nineActionPerformed
        cursor.insert("9");
    }// GEN-LAST:event_nineActionPerformed

    private void dotActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_dotActionPerformed
        cursor.insert(".");
    }// GEN-LAST:event_dotActionPerformed

    private void rigthBracketActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_rigthBracketActionPerformed
        cursor.insert(")");
    }// GEN-LAST:event_rigthBracketActionPerformed

    private void leftBracketActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_leftBracketActionPerformed
        cursor.insert("(");
    }// GEN-LAST:event_leftBracketActionPerformed

    private void delActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_delActionPerformed
        cursor.delete();
    }// GEN-LAST:event_delActionPerformed

    private void multiplieActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_multiplieActionPerformed
        cursor.insert("*");
    }// GEN-LAST:event_multiplieActionPerformed

    private void divisionActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_divisionActionPerformed
        cursor.insert("/");
    }// GEN-LAST:event_divisionActionPerformed

    private void additionActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_additionActionPerformed
        cursor.insert("+");
    }// GEN-LAST:event_additionActionPerformed

    private void substractionActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_substractionActionPerformed
        cursor.insert("-");
    }// GEN-LAST:event_substractionActionPerformed

    private void senActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_senActionPerformed
        cursor.insert("sen(");
    }// GEN-LAST:event_senActionPerformed

    private void cosActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_cosActionPerformed
        cursor.insert("cos(");
    }// GEN-LAST:event_cosActionPerformed

    private void tanActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_tanActionPerformed
        cursor.insert("tan(");
    }// GEN-LAST:event_tanActionPerformed

    private void logActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_logActionPerformed
        cursor.insert("log(");
    }// GEN-LAST:event_logActionPerformed

    private void lnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_lnActionPerformed
        cursor.insert("ln(");
    }// GEN-LAST:event_lnActionPerformed

    private void moduleActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_moduleActionPerformed
        cursor.insert("%");
    }// GEN-LAST:event_moduleActionPerformed

    private void squareRootActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_squareRootActionPerformed
        cursor.insert("sqrt(");
    }// GEN-LAST:event_squareRootActionPerformed

    private void exponencialActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_exponencialActionPerformed
        cursor.insert("^");
    }// GEN-LAST:event_exponencialActionPerformed

    private void powOfTenActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_powOfTenActionPerformed
        cursor.insert("*10^(");
    }// GEN-LAST:event_powOfTenActionPerformed

    private void lastAnswerActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_lastAnswerActionPerformed
        cursor.insert("ans(0)");
    }// GEN-LAST:event_lastAnswerActionPerformed

    private void areaClearActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_areaClearActionPerformed
        while (this.getNextMemory()[0] != "" || this.getNextMemory()[0] != null)
            try {
                Thread.sleep(100);
                if (this.getNextMemory()[0] == "" || this.getNextMemory()[0] == null)
                    break;
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        this.cursor.clear();
        this.answer.setText("");
    }// GEN-LAST:event_areaClearActionPerformed

    private void equalsActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_equalsActionPerformed
        if (cursor.getEcuation().equals(""))
            return;
        double lastAns = getAnswer();
        try {
            double sol = Complex.eval(cursor.getEcuation(), lastAns);

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

    private static double eval(final String str, final double lastAnswer) {
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
            // term = factor | term `*` factor | term `/` factor | term `%` module
            // factor = `+` factor | `-` factor | `(` expression `)` | number
            // | functionName `(` expression `)` | functionName factor
            // | factor `^` factor

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
                    else if (eat('%'))
                        x %= parseFactor(); // module
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
                    if (func.equals("ans")) {
                        x = lastAnswer;
                    } else if (func.equals("sqrt"))
                        x = Math.sqrt(x);
                    else if (func.equals("sen")) {
                        if (x == 90 || x == 270)
                            x = 1;
                        else
                            x = Math.sin(Math.toRadians(x));
                    } else if (func.equals("cos")) {
                        if (x == 90 || x == 270)
                            x = 0;
                        else
                            x = Math.cos(Math.toRadians(x));
                    } else if (func.equals("tan")) {
                        if (x == 90 || x == 270)
                            throw new RuntimeException("Syntax Error");
                        x = Math.tan(Math.toRadians(x));
                    } else if (func.equals("log")) {
                        x = Math.log10(x);
                        if (Double.isNaN(x))
                            throw new RuntimeException("Syntax Error");
                    } else if (func.equals("ln")) {
                        x = Math.log(x);
                        if (Double.isNaN(x))
                            throw new RuntimeException("Syntax Error");
                    } else
                        throw new RuntimeException("Unknown function: " + func);
                } else {
                    throw new RuntimeException("Unexpected: " + (char) ch);
                }

                if (eat('^'))
                    x = Math.pow(x, parseFactor()); // exponentiation

                return x;
            }
        }.parse();
    }

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
