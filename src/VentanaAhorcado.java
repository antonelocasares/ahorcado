
import javax.swing.JButton;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cristina
 */
public class VentanaAhorcado extends javax.swing.JFrame {
//palabraOculta en el futuro la pondre con un random
   String palabraOculta = "CETYS";
   
   int numeroFallos = 0;
    public VentanaAhorcado() {
        initComponents();
    }
    //este metodo recibe la letra q aparece en el boton q ha sido pulsado
    private void chequeaLetra(String letra){
        //guardo el texto de la pantalla en un string auxiliar
        String palabraConGuiones = jLabel1.getText();
        letra = letra.toUpperCase();
        if (palabraOculta.contains(letra)){
            //desocultar la letra en la pantalla
            for (int i=0; i<palabraOculta.length(); i++){
                if(palabraOculta.charAt(i) == letra.charAt(0)){
                    //si hemos llegado aqui es`porque la letra esta en la palabra oculta
                    //palabraConGuiones[2*i] = letra;
                    palabraConGuiones =palabraConGuiones.substring(0, 2*i)+letra + palabraConGuiones.substring(2*i +1);
                }
            }
            jLabel1.setText(palabraConGuiones);
            //quitar el guion bajo
        }
        else{//la letra NO esta en la palabra oculta
            numeroFallos++;
            jLabel2.setText(String.valueOf(numeroFallos));
                    
                 
    }
    }
    
    //recibe el boton q ha sido pulsdo
    private void chequeaBoton(JButton botonPulsado){
        botonPulsado.setVisible(false);
        chequeaLetra(botonPulsado.getText());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        boton2 = new javax.swing.JButton();
        boton3 = new javax.swing.JButton();
        boton4 = new javax.swing.JButton();
        boton1 = new javax.swing.JButton();
        boton7 = new javax.swing.JButton();
        boton11 = new javax.swing.JButton();
        boton5 = new javax.swing.JButton();
        boton6 = new javax.swing.JButton();
        boton9 = new javax.swing.JButton();
        boton10 = new javax.swing.JButton();
        boton12 = new javax.swing.JButton();
        boton8 = new javax.swing.JButton();
        boton14 = new javax.swing.JButton();
        boton15 = new javax.swing.JButton();
        boton16 = new javax.swing.JButton();
        boton13 = new javax.swing.JButton();
        boton26 = new javax.swing.JButton();
        boton27 = new javax.swing.JButton();
        boton25 = new javax.swing.JButton();
        boton22 = new javax.swing.JButton();
        boton23 = new javax.swing.JButton();
        boton24 = new javax.swing.JButton();
        boton21 = new javax.swing.JButton();
        boton18 = new javax.swing.JButton();
        boton19 = new javax.swing.JButton();
        boton20 = new javax.swing.JButton();
        boton17 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("_ _ _ _ _");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );

        boton2.setText("b");
        boton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                boton2MousePressed(evt);
            }
        });

        boton3.setText("c");
        boton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                boton3MousePressed(evt);
            }
        });

        boton4.setText("d");
        boton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                boton4MousePressed(evt);
            }
        });

        boton1.setText("a");
        boton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                boton1MousePressed(evt);
            }
        });
        boton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton1ActionPerformed(evt);
            }
        });

        boton7.setText("g");
        boton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                boton7MousePressed(evt);
            }
        });

        boton11.setText("k");
        boton11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                boton11MousePressed(evt);
            }
        });

        boton5.setText("e");
        boton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                boton5MousePressed(evt);
            }
        });

        boton6.setText("f");
        boton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                boton6MousePressed(evt);
            }
        });

        boton9.setText("i");
        boton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                boton9MousePressed(evt);
            }
        });

        boton10.setText("j");
        boton10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                boton10MousePressed(evt);
            }
        });

        boton12.setText("l");
        boton12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                boton12MousePressed(evt);
            }
        });

        boton8.setText("h");
        boton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                boton8MousePressed(evt);
            }
        });

        boton14.setText("n");
        boton14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                boton14MousePressed(evt);
            }
        });

        boton15.setText("ñ");
        boton15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                boton15MousePressed(evt);
            }
        });

        boton16.setText("o");
        boton16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                boton16MousePressed(evt);
            }
        });

        boton13.setText("m");
        boton13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                boton13MousePressed(evt);
            }
        });

        boton26.setText("y");
        boton26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                boton26MousePressed(evt);
            }
        });
        boton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton26ActionPerformed(evt);
            }
        });

        boton27.setText("z");
        boton27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                boton27MousePressed(evt);
            }
        });

        boton25.setText("x");
        boton25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                boton25MousePressed(evt);
            }
        });

        boton22.setText("u");
        boton22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                boton22MousePressed(evt);
            }
        });
        boton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton22ActionPerformed(evt);
            }
        });

        boton23.setText("v");
        boton23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                boton23MousePressed(evt);
            }
        });

        boton24.setText("w");
        boton24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                boton24MousePressed(evt);
            }
        });
        boton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton24ActionPerformed(evt);
            }
        });

        boton21.setText("t");
        boton21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                boton21MousePressed(evt);
            }
        });

        boton18.setText("q");
        boton18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                boton18MousePressed(evt);
            }
        });

        boton19.setText("r");
        boton19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                boton19MousePressed(evt);
            }
        });

        boton20.setText("s");
        boton20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                boton20MousePressed(evt);
            }
        });

        boton17.setText("p");
        boton17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                boton17MousePressed(evt);
            }
        });
        boton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton17ActionPerformed(evt);
            }
        });

        jLabel2.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(99, 99, 99)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(boton1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(boton7, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(boton13, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(boton19, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(boton25, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(17, 17, 17)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(boton2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(boton3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(boton4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(boton5, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addGroup(layout.createSequentialGroup()
                                                            .addComponent(boton14, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                            .addComponent(boton15, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                            .addComponent(boton8, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addGap(18, 18, 18)
                                                            .addComponent(boton9, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                            .addComponent(boton10, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                            .addComponent(boton11, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                            .addComponent(boton16, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                            .addComponent(boton17, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addGap(0, 0, Short.MAX_VALUE)))))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(boton20, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(boton21, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(boton22, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(boton23, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(boton26, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(boton27, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(boton18, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(boton6, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(boton12, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(boton24, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(49, 49, 49))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boton2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton5, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton6, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boton7, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(boton11, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(boton8, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(boton9, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(boton10, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(boton12, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boton13, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton14, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton15, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton16, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton17, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton18, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boton19, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton20, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton21, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton22, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton23, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton24, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boton25, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton26, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton27, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(126, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton2MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton2MousePressed

    private void boton3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton3MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton3MousePressed

    private void boton4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton4MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton4MousePressed

    private void boton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton1MousePressed
        chequeaBoton((JButton)evt.getSource());
    }//GEN-LAST:event_boton1MousePressed

    private void boton7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton7MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton7MousePressed

    private void boton11MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton11MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton11MousePressed

    private void boton5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton5MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton5MousePressed

    private void boton6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton6MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton6MousePressed

    private void boton9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton9MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton9MousePressed

    private void boton10MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton10MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton10MousePressed

    private void boton12MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton12MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton12MousePressed

    private void boton8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton8MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton8MousePressed

    private void boton14MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton14MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton14MousePressed

    private void boton15MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton15MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton15MousePressed

    private void boton16MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton16MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton16MousePressed

    private void boton13MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton13MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton13MousePressed

    private void boton26MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton26MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton26MousePressed

    private void boton27MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton27MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton27MousePressed

    private void boton25MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton25MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton25MousePressed

    private void boton22MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton22MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton22MousePressed

    private void boton23MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton23MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton23MousePressed

    private void boton24MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton24MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton24MousePressed

    private void boton21MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton21MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton21MousePressed

    private void boton18MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton18MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton18MousePressed

    private void boton19MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton19MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton19MousePressed

    private void boton20MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton20MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton20MousePressed

    private void boton17MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton17MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton17MousePressed

    private void boton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton1ActionPerformed

    private void boton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton26ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton26ActionPerformed

    private void boton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton22ActionPerformed

    private void boton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton24ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton24ActionPerformed

    private void boton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton17ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaAhorcado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaAhorcado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaAhorcado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaAhorcado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaAhorcado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton1;
    private javax.swing.JButton boton10;
    private javax.swing.JButton boton11;
    private javax.swing.JButton boton12;
    private javax.swing.JButton boton13;
    private javax.swing.JButton boton14;
    private javax.swing.JButton boton15;
    private javax.swing.JButton boton16;
    private javax.swing.JButton boton17;
    private javax.swing.JButton boton18;
    private javax.swing.JButton boton19;
    private javax.swing.JButton boton2;
    private javax.swing.JButton boton20;
    private javax.swing.JButton boton21;
    private javax.swing.JButton boton22;
    private javax.swing.JButton boton23;
    private javax.swing.JButton boton24;
    private javax.swing.JButton boton25;
    private javax.swing.JButton boton26;
    private javax.swing.JButton boton27;
    private javax.swing.JButton boton3;
    private javax.swing.JButton boton4;
    private javax.swing.JButton boton5;
    private javax.swing.JButton boton6;
    private javax.swing.JButton boton7;
    private javax.swing.JButton boton8;
    private javax.swing.JButton boton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
