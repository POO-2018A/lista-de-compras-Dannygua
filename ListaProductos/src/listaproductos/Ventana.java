
package listaproductos;

import javax.swing.JOptionPane;


public class Ventana extends javax.swing.JFrame {

    int i=0;
    String txt[] = new String [8];
    boolean igual = true;
    
    public Ventana() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titulo = new javax.swing.JLabel();
        producto = new javax.swing.JLabel();
        lista = new javax.swing.JLabel();
        ingresarproducto = new javax.swing.JTextField();
        adicion = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        reiniciar = new javax.swing.JButton();
        p1 = new javax.swing.JTextField();
        p2 = new javax.swing.JTextField();
        p3 = new javax.swing.JTextField();
        p4 = new javax.swing.JTextField();
        p5 = new javax.swing.JTextField();
        p6 = new javax.swing.JTextField();
        p7 = new javax.swing.JTextField();
        p8 = new javax.swing.JTextField();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titulo.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        titulo.setText("LISTA DE PRODUCTOS");
        getContentPane().add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, -1, -1));

        producto.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        producto.setText("Producto: ");
        getContentPane().add(producto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        lista.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lista.setForeground(new java.awt.Color(0, 0, 255));
        lista.setText("PRODUCTOS INGRESADOS");
        getContentPane().add(lista, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        ingresarproducto.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        getContentPane().add(ingresarproducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 400, -1));

        adicion.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        adicion.setText("Añadir");
        adicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionActionPerformed(evt);
            }
        });
        getContentPane().add(adicion, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 40, 110, -1));

        cancelar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        cancelar.setText("Cancelar");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });
        getContentPane().add(cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 90, 110, -1));

        reiniciar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        reiniciar.setText("Reiniciar");
        reiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reiniciarActionPerformed(evt);
            }
        });
        getContentPane().add(reiniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 140, 110, -1));

        p1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        p1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p1ActionPerformed(evt);
            }
        });
        getContentPane().add(p1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 320, 30));

        p2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        getContentPane().add(p2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 320, 30));

        p3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        p3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p3ActionPerformed(evt);
            }
        });
        getContentPane().add(p3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 320, 30));

        p4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        getContentPane().add(p4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 320, 30));

        p5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        getContentPane().add(p5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 230, 370, 30));

        p6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        p6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p6ActionPerformed(evt);
            }
        });
        getContentPane().add(p6, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 290, 370, 30));

        p7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        getContentPane().add(p7, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 350, 370, 30));

        p8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        getContentPane().add(p8, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 410, 370, 30));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cesta.jpg"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void adicionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionActionPerformed
        if (!ingresarproducto.getText().equals("")){
            
            int confirmacion =JOptionPane.showConfirmDialog(rootPane, "¿Esta seguro de ingresar este producto?", "Validacion",JOptionPane.YES_NO_OPTION);
      
            if (confirmacion ==0){
            if (i<7){
                               
               if (igual == false){
                   i++;
                   
               }
                
                txt [i]= ingresarproducto.getText();
            switch (i){
                case 0:
                    p1.setText(txt[i]);
                    break;
                case 1:
                    p2.setText(txt[i]);
                    break;
                case 2:
                    p3.setText(txt[i]);
                    break;
                case 3:
                    p4.setText(txt[i]);
                    break;
                case 4:
                    p5.setText(txt[i]);
                    break;
                case 5:
                    p6.setText(txt[i]);
                    break;
                case 6:
                    p7.setText(txt[i]);
                    break;
                case 7:
                    p8.setText(txt[i]);
                    break;
                    
            }
            
            
            
                for (int j = 0; j < i; j++) {
                           
                        if (txt[j].equals(txt[i])){
                            igual = true;
                            txt[i]="";
                            JOptionPane.showMessageDialog(rootPane, "El producto ingresado ya ha sido regsitrado en la lista de productos");
                            break;
                        }else{
                            igual = false;
                        }
                    
                }    
                
                if (i==0){
                    igual=false;
                }
            
            }else{
                JOptionPane.showMessageDialog(rootPane, "Todos los espacios para los productos ya han sido ocupados");
            }
            
            
            }
        }else{
            JOptionPane.showMessageDialog(rootPane, "Por favor ingrese un producto");
        }
    }//GEN-LAST:event_adicionActionPerformed

    private void p3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p3ActionPerformed

    private void p6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p6ActionPerformed

    private void p1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p1ActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        if (!ingresarproducto.getText().equals("")){
        ingresarproducto.setText("");
        }else{
            JOptionPane.showMessageDialog(rootPane, "NO ha ingresado ningun producto ");
        }
    }//GEN-LAST:event_cancelarActionPerformed

    private void reiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reiniciarActionPerformed
        if (!p1.getText().equals("")){
        int confirmacion = JOptionPane.showConfirmDialog(rootPane, "¿Esta seguro de querer borrar los productos ingresados ?","Confirmacion",JOptionPane.YES_NO_OPTION);
        if (confirmacion ==0){
        p1.setText("");
        p2.setText("");
        p3.setText("");
        p4.setText("");
        p5.setText("");
        p6.setText("");
        p7.setText("");
        p8.setText("");
        i=0;
        igual =true;
        }
        }else{
            JOptionPane.showMessageDialog(rootPane, "No existen productos que se puedan borrar en la lista");
        }
        
    }//GEN-LAST:event_reiniciarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton adicion;
    private javax.swing.JButton cancelar;
    private javax.swing.JTextField ingresarproducto;
    private javax.swing.JLabel lista;
    private javax.swing.JTextField p1;
    private javax.swing.JTextField p2;
    private javax.swing.JTextField p3;
    private javax.swing.JTextField p4;
    private javax.swing.JTextField p5;
    private javax.swing.JTextField p6;
    private javax.swing.JTextField p7;
    private javax.swing.JTextField p8;
    private javax.swing.JLabel producto;
    private javax.swing.JButton reiniciar;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
