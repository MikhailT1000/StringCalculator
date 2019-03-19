//import java.math.BigDecimal;

public class JFrameCalculator extends javax.swing.JFrame {

    private javax.swing.JButton jButtonClear;
    private javax.swing.JButton jButtonDivision;
    private javax.swing.JButton jButtonDot;
    private javax.swing.JButton jButtonEight;
    private javax.swing.JButton jButtonEquals;
    private javax.swing.JButton jButtonFive;
    private javax.swing.JButton jButtonFour;
    private javax.swing.JButton jButtonLeftBracket;
    private javax.swing.JButton jButtonMinus;
    private javax.swing.JButton jButtonMultiplication;
    private javax.swing.JButton jButtonNine;
    private javax.swing.JButton jButtonOne;
    private javax.swing.JButton jButtonPlus;
    private javax.swing.JButton jButtonPlusOrMinus;
    private javax.swing.JButton jButtonRightBracket;
    private javax.swing.JButton jButtonSeven;
    private javax.swing.JButton jButtonSix;
    private javax.swing.JButton jButtonThree;
    private javax.swing.JButton jButtonTwo;
    private javax.swing.JButton jButtonZero;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextDisplay;

    public JFrameCalculator() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextDisplay = new javax.swing.JTextField();
        jButtonSeven = new javax.swing.JButton();
        jButtonFour = new javax.swing.JButton();
        jButtonOne = new javax.swing.JButton();
        jButtonZero = new javax.swing.JButton();
        jButtonLeftBracket = new javax.swing.JButton();
        jButtonEight = new javax.swing.JButton();
        jButtonFive = new javax.swing.JButton();
        jButtonTwo = new javax.swing.JButton();
        jButtonDot = new javax.swing.JButton();
        jButtonRightBracket = new javax.swing.JButton();
        jButtonNine = new javax.swing.JButton();
        jButtonPlus = new javax.swing.JButton();
        jButtonSix = new javax.swing.JButton();
        jButtonMinus = new javax.swing.JButton();
        jButtonThree = new javax.swing.JButton();
        jButtonMultiplication = new javax.swing.JButton();
        jButtonPlusOrMinus = new javax.swing.JButton();
        jButtonDivision = new javax.swing.JButton();
        jButtonEquals = new javax.swing.JButton();
        jButtonClear = new javax.swing.JButton();

        setTitle("Calculator");
        setMaximumSize(new java.awt.Dimension(32767, 32767));
        setPreferredSize(new java.awt.Dimension(317, 490));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.setPreferredSize(new java.awt.Dimension(250, 370));

        jTextDisplay.setEditable(false);
        jTextDisplay.setFont(new java.awt.Font("Tahoma", 1, 14));
        jTextDisplay.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextDisplay.setPreferredSize(new java.awt.Dimension(230, 70));

        jButtonSeven.setFont(new java.awt.Font("Tahoma", 1, 18));
        jButtonSeven.setText("7");
        jButtonSeven.setPreferredSize(new java.awt.Dimension(70, 70));
        jButtonSeven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSevenActionPerformed(evt);
            }
        });

        jButtonFour.setFont(new java.awt.Font("Tahoma", 1, 18));
        jButtonFour.setText("4");
        jButtonFour.setPreferredSize(new java.awt.Dimension(70, 70));
        jButtonFour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFourActionPerformed(evt);
            }
        });

        jButtonOne.setFont(new java.awt.Font("Tahoma", 1, 18));
        jButtonOne.setText("1");
        jButtonOne.setPreferredSize(new java.awt.Dimension(70, 70));
        jButtonOne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOneActionPerformed(evt);
            }
        });

        jButtonZero.setFont(new java.awt.Font("Tahoma", 1, 18));
        jButtonZero.setText("0");
        jButtonZero.setPreferredSize(new java.awt.Dimension(70, 70));
        jButtonZero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonZeroActionPerformed(evt);
            }
        });

        jButtonLeftBracket.setFont(new java.awt.Font("Tahoma", 1, 18));
        jButtonLeftBracket.setText("(");
        jButtonLeftBracket.setPreferredSize(new java.awt.Dimension(70, 70));
        jButtonLeftBracket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLeftBracketActionPerformed(evt);
            }
        });

        jButtonEight.setFont(new java.awt.Font("Tahoma", 1, 18));
        jButtonEight.setText("8");
        jButtonEight.setPreferredSize(new java.awt.Dimension(70, 70));
        jButtonEight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEightActionPerformed(evt);
            }
        });

        jButtonFive.setFont(new java.awt.Font("Tahoma", 1, 18));
        jButtonFive.setText("5");
        jButtonFive.setPreferredSize(new java.awt.Dimension(70, 70));
        jButtonFive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFiveActionPerformed(evt);
            }
        });

        jButtonTwo.setFont(new java.awt.Font("Tahoma", 1, 18));
        jButtonTwo.setText("2");
        jButtonTwo.setPreferredSize(new java.awt.Dimension(70, 70));
        jButtonTwo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTwoActionPerformed(evt);
            }
        });

        jButtonDot.setFont(new java.awt.Font("Tahoma", 1, 18));
        jButtonDot.setText(".");
        jButtonDot.setPreferredSize(new java.awt.Dimension(70, 70));
        jButtonDot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDotActionPerformed(evt);
            }
        });

        jButtonRightBracket.setFont(new java.awt.Font("Tahoma", 1, 18));
        jButtonRightBracket.setText(")");
        jButtonRightBracket.setPreferredSize(new java.awt.Dimension(70, 70));
        jButtonRightBracket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRightBracketActionPerformed(evt);
            }
        });

        jButtonNine.setFont(new java.awt.Font("Tahoma", 1, 18));
        jButtonNine.setText("9");
        jButtonNine.setPreferredSize(new java.awt.Dimension(70, 70));
        jButtonNine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNineActionPerformed(evt);
            }
        });

        jButtonPlus.setFont(new java.awt.Font("Tahoma", 1, 18));
        jButtonPlus.setText("+");
        jButtonPlus.setPreferredSize(new java.awt.Dimension(70, 70));
        jButtonPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPlusActionPerformed(evt);
            }
        });

        jButtonSix.setFont(new java.awt.Font("Tahoma", 1, 18));
        jButtonSix.setText("6");
        jButtonSix.setPreferredSize(new java.awt.Dimension(70, 70));
        jButtonSix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSixActionPerformed(evt);
            }
        });

        jButtonMinus.setFont(new java.awt.Font("Tahoma", 1, 18));
        jButtonMinus.setText("-");
        jButtonMinus.setPreferredSize(new java.awt.Dimension(70, 70));
        jButtonMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMinusActionPerformed(evt);
            }
        });

        jButtonThree.setFont(new java.awt.Font("Tahoma", 1, 18));
        jButtonThree.setText("3");
        jButtonThree.setPreferredSize(new java.awt.Dimension(70, 70));
        jButtonThree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonThreeActionPerformed(evt);
            }
        });

        jButtonMultiplication.setFont(new java.awt.Font("Tahoma", 1, 18));
        jButtonMultiplication.setText("*");
        jButtonMultiplication.setPreferredSize(new java.awt.Dimension(70, 70));
        jButtonMultiplication.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMultiplicationActionPerformed(evt);
            }
        });

        jButtonPlusOrMinus.setFont(new java.awt.Font("Tahoma", 1, 18));
        jButtonPlusOrMinus.setText("+/-");
        jButtonPlusOrMinus.setPreferredSize(new java.awt.Dimension(70, 70));
        jButtonPlusOrMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPlusOrMinusActionPerformed(evt);
            }
        });

        jButtonDivision.setFont(new java.awt.Font("Tahoma", 1, 18));
        jButtonDivision.setText("/");
        jButtonDivision.setPreferredSize(new java.awt.Dimension(70, 70));
        jButtonDivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDivisionActionPerformed(evt);
            }
        });

        jButtonEquals.setFont(new java.awt.Font("Tahoma", 1, 18));
        jButtonEquals.setText("=");
        jButtonEquals.setPreferredSize(new java.awt.Dimension(70, 70));
        jButtonEquals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEqualsActionPerformed(evt);
            }
        });

        jButtonClear.setFont(new java.awt.Font("Tahoma", 1, 18));
        jButtonClear.setText("C");
        jButtonClear.setPreferredSize(new java.awt.Dimension(70, 70));
        jButtonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jTextDisplay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jButtonSeven, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jButtonFour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jButtonOne, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jButtonZero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jButtonLeftBracket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jButtonEight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jButtonFive, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jButtonTwo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jButtonDot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jButtonRightBracket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jButtonNine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jButtonSix, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jButtonThree, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jButtonPlusOrMinus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jButtonEquals, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jButtonPlus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jButtonMinus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jButtonMultiplication, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jButtonDivision, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jButtonClear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jTextDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jButtonSeven, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jButtonFour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jButtonFive, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jButtonSix, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jButtonMinus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jButtonOne, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jButtonTwo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jButtonThree, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jButtonMultiplication, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jButtonZero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jButtonDot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jButtonPlusOrMinus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jButtonDivision, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jButtonLeftBracket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jButtonRightBracket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jButtonEquals, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jButtonClear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(jButtonEight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonNine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonPlus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 472, Short.MAX_VALUE)
        );

        pack();
    }

    private void jButtonPlusActionPerformed(java.awt.event.ActionEvent evt) {
        String input = jTextDisplay.getText() + jButtonPlus.getText();
        jTextDisplay.setText(input);
    }

    private void jButtonSevenActionPerformed(java.awt.event.ActionEvent evt) {
        String input = jTextDisplay.getText() + jButtonSeven.getText();
        jTextDisplay.setText(input);
    }

    private void jButtonLeftBracketActionPerformed(java.awt.event.ActionEvent evt) {
        String input = jTextDisplay.getText() + jButtonLeftBracket.getText();
        jTextDisplay.setText(input);
    }

    private void jButtonTwoActionPerformed(java.awt.event.ActionEvent evt) {
        String input = jTextDisplay.getText() + jButtonTwo.getText();
        jTextDisplay.setText(input);
    }

    private void jButtonRightBracketActionPerformed(java.awt.event.ActionEvent evt) {
        String input = jTextDisplay.getText() + jButtonRightBracket.getText();
        jTextDisplay.setText(input);
    }

    private void jButtonEqualsActionPerformed(java.awt.event.ActionEvent evt) {
        String input = jTextDisplay.getText();
        Expression.calculateExpression(input);
        jTextDisplay.setText(String.valueOf(Expression.calculateExpression(input)));
    }

    private void jButtonClearActionPerformed(java.awt.event.ActionEvent evt) {
        jTextDisplay.setText("");
    }

    private void jButtonDivisionActionPerformed(java.awt.event.ActionEvent evt) {
        String input = jTextDisplay.getText() + jButtonDivision.getText();
        jTextDisplay.setText(input);
    }

    private void jButtonPlusOrMinusActionPerformed(java.awt.event.ActionEvent evt) {
        double plusOrMinus = Double.parseDouble(String.valueOf(jTextDisplay.getText()));
        plusOrMinus = plusOrMinus *(-1);
        jTextDisplay.setText(String.valueOf(plusOrMinus));
    }

    private void jButtonDotActionPerformed(java.awt.event.ActionEvent evt) {
        String input = jTextDisplay.getText() + jButtonDot.getText();
        jTextDisplay.setText(input);
    }

    private void jButtonZeroActionPerformed(java.awt.event.ActionEvent evt) {
        String input = jTextDisplay.getText() + jButtonZero.getText();
        jTextDisplay.setText(input);
    }

    private void jButtonMultiplicationActionPerformed(java.awt.event.ActionEvent evt) {
        String input = jTextDisplay.getText() + jButtonMultiplication.getText();
        jTextDisplay.setText(input);
    }

    private void jButtonThreeActionPerformed(java.awt.event.ActionEvent evt) {
        String input = jTextDisplay.getText() + jButtonThree.getText();
        jTextDisplay.setText(input);
    }

    private void jButtonOneActionPerformed(java.awt.event.ActionEvent evt) {
        String input = jTextDisplay.getText() + jButtonOne.getText();
        jTextDisplay.setText(input);
    }

    private void jButtonMinusActionPerformed(java.awt.event.ActionEvent evt) {
        String input = jTextDisplay.getText() + jButtonMinus.getText();
        jTextDisplay.setText(input);
    }

    private void jButtonSixActionPerformed(java.awt.event.ActionEvent evt) {
        String input = jTextDisplay.getText() + jButtonSix.getText();
        jTextDisplay.setText(input);
    }

    private void jButtonFiveActionPerformed(java.awt.event.ActionEvent evt) {
        String input = jTextDisplay.getText() + jButtonFive.getText();
        jTextDisplay.setText(input);
    }

    private void jButtonFourActionPerformed(java.awt.event.ActionEvent evt) {
        String input = jTextDisplay.getText() + jButtonFour.getText();
        jTextDisplay.setText(input);
    }

    private void jButtonNineActionPerformed(java.awt.event.ActionEvent evt) {
        String input = jTextDisplay.getText() + jButtonNine.getText();
        jTextDisplay.setText(input);
    }

    private void jButtonEightActionPerformed(java.awt.event.ActionEvent evt) {
        String input = jTextDisplay.getText() + jButtonEight.getText();
        jTextDisplay.setText(input);
    }

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFrameCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameCalculator().setVisible(true);
            }
        });
    }


}
