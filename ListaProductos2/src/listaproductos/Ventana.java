
package listaproductos;

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Ventana extends javax.swing.JFrame {

    int i=0;
    ArrayList list = new ArrayList ();
    boolean igual = true;
    int imprimir2 =0;
    
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
        jScrollPane1 = new javax.swing.JScrollPane();
        area = new javax.swing.JTextArea();
        Imprimir = new javax.swing.JButton();
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
        getContentPane().add(adicion, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 10, 110, -1));

        cancelar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        cancelar.setText("Cancelar");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });
        getContentPane().add(cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 50, 110, -1));

        reiniciar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        reiniciar.setText("Reiniciar");
        reiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reiniciarActionPerformed(evt);
            }
        });
        getContentPane().add(reiniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 90, 110, -1));

        area.setColumns(20);
        area.setRows(5);
        jScrollPane1.setViewportView(area);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 720, 260));

        Imprimir.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Imprimir.setText("Imprimir Lista");
        Imprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImprimirActionPerformed(evt);
            }
        });
        getContentPane().add(Imprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 130, 150, 30));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cesta.jpg"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void adicionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionActionPerformed
        
        area.setText("");
        imprimir2=0;
        if (!ingresarproducto.getText().equals("")){
            
            int confirmacion =JOptionPane.showConfirmDialog(rootPane, "¿Esta seguro de ingresar este producto?", "Validacion",JOptionPane.YES_NO_OPTION);
      
            if (confirmacion ==0){
      
                               
               if (igual == false){
                   i++;
                     
               }
               
               String txt = ingresarproducto.getText();
               
               this.list.add(txt);
                   
                for (int j = 0; j < i; j++) {
                           
                        if (list.get(j).equals(list.get(i))){
                            igual = true;
                            this.list.remove(i);
                            JOptionPane.showMessageDialog(rootPane, "El producto ingresado ya ha sido regsitrado en la lista de productos, asi que no se puede registrar denuevo");
                            break;
                        }else{
                            igual = false;
                        }
                    
                }    
                
                if (i==0){
                    igual=false;
                }

            
            }
        }else{
            JOptionPane.showMessageDialog(rootPane, "Por favor ingrese un producto");
        }
    }//GEN-LAST:event_adicionActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        if (!ingresarproducto.getText().equals("")){
        ingresarproducto.setText("");
        }else{
            JOptionPane.showMessageDialog(rootPane, "NO ha ingresado ningun producto ");
        }
    }//GEN-LAST:event_cancelarActionPerformed

    private void reiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reiniciarActionPerformed

        int verificacion = JOptionPane.showConfirmDialog(rootPane, " ¿esta seguro de borrar la lista de productos?","Verificacion",JOptionPane.YES_NO_OPTION);
        
        if (verificacion ==0){
        area.setText("");
        igual=true;
        imprimir2=0;
        list.removeAll(list);
        i=0;
        }
        
    }//GEN-LAST:event_reiniciarActionPerformed

    private void ImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImprimirActionPerformed
        
        
        if (imprimir2==0){
        for (Object item : list){
                         
            area.setText(area.getText()+"\n"+item);
                   
        }  
        
        }
        
        imprimir2=1;
        
    }//GEN-LAST:event_ImprimirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton Imprimir;
    private javax.swing.JButton adicion;
    private javax.swing.JTextArea area;
    private javax.swing.JButton cancelar;
    private javax.swing.JTextField ingresarproducto;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lista;
    private javax.swing.JLabel producto;
    private javax.swing.JButton reiniciar;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
