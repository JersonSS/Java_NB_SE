package Laboratorio;


public class Aplicacion02 extends javax.swing.JFrame {

    
    
    public Aplicacion02() {
        initComponents();
        
        //centrar frane
        this.setLocationRelativeTo(null);
        
        lblCosto.setText("S/"+this.getCosto());
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        textArticuloID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cboArticulos = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        btnEjecutar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txaImprimir = new javax.swing.JTextArea();
        lblCosto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("Example: Se tiene los siguientes\n1.- USB: S/50\n2.- MOUSE: S/75\n3.- WEBCAM: S/200\n4.- KEYBOARD: S/100\nSe pide hacer una App para la venta de cierto articulo.\n- Además se aplicara IGV(19%)\n- Propina(1%)\n- Descuento del 10% para compras mayores a 100");
        jScrollPane1.setViewportView(jTextArea1);

        jLabel1.setText("Articulo ID:");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        jLabel2.setText("Articulo:");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        cboArticulos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "USB", "MOUSE", "WEBCAM", "KEYBOARD" }));
        cboArticulos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboArticulosActionPerformed(evt);
            }
        });

        jLabel4.setText("Cantidad:");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        btnEjecutar.setText("Ejecutar");
        btnEjecutar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEjecutarActionPerformed(evt);
            }
        });

        txaImprimir.setColumns(20);
        txaImprimir.setRows(5);
        jScrollPane2.setViewportView(txaImprimir);

        lblCosto.setBorder(javax.swing.BorderFactory.createTitledBorder("Costo unitario"));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(btnEjecutar)
                            .addGap(251, 251, 251)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(23, 23, 23)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(53, 53, 53)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(textArticuloID))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGap(0, 0, Short.MAX_VALUE)
                                    .addComponent(jLabel2)
                                    .addGap(24, 24, 24)
                                    .addComponent(cboArticulos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(lblCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(23, 23, 23))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(textArticuloID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(cboArticulos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addComponent(btnEjecutar)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEjecutarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEjecutarActionPerformed
        
        int articuloID= Integer.parseInt(textArticuloID.getText());
        double costo = Double.parseDouble(lblCosto.getText().substring(2));
        int cantidad=Integer.parseInt(txtCantidad.getText());
        
        //PROCESO
        double bruto = this.getBruto(cantidad, costo);
        double igv = this.getIgv(bruto);
        double propina = this.getPropina(bruto);
        double descuento = this.getDescuento(bruto, cantidad);
        double neto = this.getNeto(bruto, igv, propina, descuento);
            
        //SALIDA
        txaImprimir.setText(null);
        txaImprimir.append("Monto bruto: S/"+bruto);
        txaImprimir.append("\n IGV: S/"+igv);
        txaImprimir.append("\n Propina: S/"+propina);
        txaImprimir.append("\n Descuento: S/"+descuento);
        txaImprimir.append("\n Monto Neto: S/"+neto);
        
        
    }//GEN-LAST:event_btnEjecutarActionPerformed

    private void cboArticulosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboArticulosActionPerformed
        
        
        lblCosto.setText("S/"+this.getCosto());
        
    }//GEN-LAST:event_cboArticulosActionPerformed

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
            java.util.logging.Logger.getLogger(Aplicacion02.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Aplicacion02.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Aplicacion02.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Aplicacion02.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Aplicacion02().setVisible(true);
            }
        });
    }
    
    
    //función
     public double getCosto()
    {
        double costo=0.0;
        String articulo=cboArticulos.getSelectedItem().toString();
        switch (articulo) {
            case "USB": costo=50.0; break;
            case "MOUSE": costo=75.0; break;
            case "WEBCAM": costo=200.0; break;
            case "KEYBOARD": costo=100.0; break;
        }
        return costo;
    }
    
      public double getBruto(int cantidad, double costo)
    {
       double bruto=costo*cantidad;
       return bruto;
    }
    
      public double getIgv(double bruto)
    {
        double igv=0.19*bruto;
        return igv;
    }
    
    
    public double getPropina(double bruto)
    {
        double propina=0.01*bruto;
        return propina;
    }
    
    
    public double getDescuento(double bruto, int cantidad)
    {
        double descuento=0.0;
        
        if (cantidad>100) {
            descuento=0.10*bruto;
        }
        return descuento;
    }
    
    public double getNeto(double bruto, double igv, double propina, double descuento)
    {
        double neto=bruto+igv+propina-descuento;
        return neto;
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEjecutar;
    private javax.swing.JComboBox<String> cboArticulos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lblCosto;
    private javax.swing.JTextField textArticuloID;
    private javax.swing.JTextArea txaImprimir;
    private javax.swing.JTextField txtCantidad;
    // End of variables declaration//GEN-END:variables
}