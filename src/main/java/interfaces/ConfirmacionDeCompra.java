/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaces;

import conexion.conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author SFTA
 */
public class ConfirmacionDeCompra extends javax.swing.JFrame {

  
    conexion cone =new conexion();
    Connection cn=cone.conectar();
    
    public ConfirmacionDeCompra() {
        initComponents();
        setLocationRelativeTo(null);
        addWindowListener(new java.awt.event.WindowAdapter() {
        @Override
        public void windowOpened(java.awt.event.WindowEvent evt) {
            cargarUltimoVueloPendiente();
        }
    });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtOrigen = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtDestino = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtPrecioFinal = new javax.swing.JTextField();
        btnConfirmar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtCantidadPasajeros = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        dateIda = new com.toedter.calendar.JDateChooser();
        dateVuelta = new com.toedter.calendar.JDateChooser();
        comoMedioDePago = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        txtEmailUsuario = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        comboHoras = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 102));
        jLabel1.setText("Confirmación de compra");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 102));
        jLabel3.setText("Origen");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(256, 49, -1, -1));

        txtOrigen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 102)));
        txtOrigen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOrigenActionPerformed(evt);
            }
        });
        jPanel1.add(txtOrigen, new org.netbeans.lib.awtextra.AbsoluteConstraints(256, 75, 312, 20));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 102));
        jLabel4.setText("Destino");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(256, 107, -1, -1));

        txtDestino.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtDestino.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 102)));
        jPanel1.add(txtDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(256, 133, 312, 20));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 102));
        jLabel5.setText("Fecha ida");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(256, 165, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 102));
        jLabel6.setText("Fecha vuelta");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(453, 165, -1, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 51, 102));
        jLabel7.setText("Precio Final");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(256, 229, -1, -1));

        txtPrecioFinal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 102)));
        jPanel1.add(txtPrecioFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(256, 255, 312, 20));

        btnConfirmar.setBackground(new java.awt.Color(102, 153, 255));
        btnConfirmar.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnConfirmar.setForeground(new java.awt.Color(255, 255, 255));
        btnConfirmar.setText("Confirmar");
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });
        jPanel1.add(btnConfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 510, -1, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 51, 102));
        jLabel8.setText("Cantidad de pasajeros");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(256, 287, -1, -1));

        txtCantidadPasajeros.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 102)));
        txtCantidadPasajeros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadPasajerosActionPerformed(evt);
            }
        });
        jPanel1.add(txtCantidadPasajeros, new org.netbeans.lib.awtextra.AbsoluteConstraints(256, 313, 312, 20));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 51, 102));
        jLabel9.setText("Pago");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(256, 345, -1, -1));

        dateIda.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 102)));
        jPanel1.add(dateIda, new org.netbeans.lib.awtextra.AbsoluteConstraints(256, 191, 115, -1));

        dateVuelta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 102)));
        jPanel1.add(dateVuelta, new org.netbeans.lib.awtextra.AbsoluteConstraints(453, 191, 115, -1));

        comoMedioDePago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tarjeta Credito", "Tarjeta Devito", "Mercado Pago", "Rapipago", "Pago Facil" }));
        comoMedioDePago.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 102)));
        comoMedioDePago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comoMedioDePagoActionPerformed(evt);
            }
        });
        jPanel1.add(comoMedioDePago, new org.netbeans.lib.awtextra.AbsoluteConstraints(256, 371, 318, 20));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 102));
        jLabel2.setText("Email");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(256, 403, -1, -1));

        txtEmailUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 102)));
        jPanel1.add(txtEmailUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(256, 429, 312, 20));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 51, 102));
        jLabel10.setText("Vuelve A Indicar la hora en la que viajas");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(256, 461, -1, -1));

        comboHoras.setModel(new javax.swing.DefaultComboBoxModel<>
            (new String[] { "06:30", "08:00", "09:00",
                "10:00","11:00","12:00","13:30","15:00","17:00","19:00","20:00","21:00" }));
    comboHoras.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 102)));
    jPanel1.add(comboHoras, new org.netbeans.lib.awtextra.AbsoluteConstraints(256, 487, 312, 20));

    jLabel12.setBackground(new java.awt.Color(255, 255, 255));
    jLabel12.setAutoscrolls(true);
    jLabel12.setOpaque(true);
    jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 350, 530));

    jLabel13.setIcon(new javax.swing.ImageIcon("C:\\Users\\USUARIO\\OneDrive\\Escritorio\\Imagenes Boleto de Avion\\Logo.jpeg")); // NOI18N
    jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

    jLabel11.setIcon(new javax.swing.ImageIcon("C:\\Users\\USUARIO\\OneDrive\\Escritorio\\Imagenes Boleto de Avion\\Nubes.jpeg")); // NOI18N
    jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 810, 550));

    getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 830, 570));

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
    confirmarCompra();
    new primeraParteBoletos().setVisible(true);
    dispose();
    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void txtCantidadPasajerosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadPasajerosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadPasajerosActionPerformed

    private void comoMedioDePagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comoMedioDePagoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comoMedioDePagoActionPerformed

    private void txtOrigenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOrigenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOrigenActionPerformed

// Método para cargar los datos del último vuelo pendiente
private void cargarUltimoVueloPendiente() {
    String sql = "SELECT Origen, Destino, FechaIda, FechaVuelta, PrecioFinal, Adultos, Niños " +
                 "FROM vuelos_pendientes " +
                 "ORDER BY id DESC " +
                 "LIMIT 1";

    try (PreparedStatement pstmt = cn.prepareStatement(sql);
         ResultSet rs = pstmt.executeQuery()) {

        if (rs.next()) {
            // Obtener datos del último vuelo pendiente
            String origen = rs.getString("Origen");
            String destino = rs.getString("Destino");
            Date fechaIda = rs.getDate("FechaIda");
            Date fechaVuelta = rs.getDate("FechaVuelta");
            double precioFinal = rs.getDouble("PrecioFinal");
            int pasajerosAdultos = rs.getInt("Adultos");
            int pasajerosNinos = rs.getInt("Niños");
            int cantidadPasajeros = pasajerosAdultos + pasajerosNinos;

            // Mostrar los datos en los campos correspondientes de la interfaz
            txtOrigen.setText(origen);
            txtDestino.setText(destino);
            dateIda.setDate(fechaIda);
            dateVuelta.setDate(fechaVuelta);
            txtPrecioFinal.setText(String.valueOf(precioFinal));
            txtCantidadPasajeros.setText(String.valueOf(cantidadPasajeros));
        } else {
            // No se encontraron vuelos pendientes
            JOptionPane.showMessageDialog(this, "No se encontró ningún vuelo pendiente.", "Error", JOptionPane.ERROR_MESSAGE);
        }

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error al obtener el último vuelo pendiente: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
}

// Método para confirmar la compra y guardar la información en la tabla vuelos_pagados
private void confirmarCompra() {
      String medioDePago = comoMedioDePago.getSelectedItem().toString();
    String emailUsuario = txtEmailUsuario.getText();
    String hora = comboHoras.getSelectedItem().toString();

    // Guardar en la tabla vuelos_pagados
    String sql = "INSERT INTO vuelos_pagados (origen, destino, fecha_ida, fecha_vuelta, hora, precio_final, cantidad_pasajeros, medio_pago, email_usuario) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
    try (PreparedStatement pstmt = cn.prepareStatement(sql)) {
        // Obtener los datos de la interfaz
        String origen = txtOrigen.getText();
        String destino = txtDestino.getText();
        Date fechaIda = dateIda.getDate();
        Date fechaVuelta = dateVuelta.getDate();
        double precioFinal = Double.parseDouble(txtPrecioFinal.getText());
        int cantidadPasajeros = Integer.parseInt(txtCantidadPasajeros.getText());

        // Guardar los datos en vuelos_pagados
        pstmt.setString(1, origen);
        pstmt.setString(2, destino);
        pstmt.setDate(3, new java.sql.Date(fechaIda.getTime()));
        pstmt.setDate(4, new java.sql.Date(fechaVuelta.getTime()));
        pstmt.setString(5, hora);
        pstmt.setDouble(6, precioFinal);
        pstmt.setInt(7, cantidadPasajeros);
        pstmt.setString(8, medioDePago);
        pstmt.setString(9, emailUsuario);
        pstmt.executeUpdate();

        // Confirmación de éxito
        JOptionPane.showMessageDialog(this, "Compra confirmada y guardada en la base de datos.");

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error al guardar la compra: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
}




    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JComboBox<String> comboHoras;
    private javax.swing.JComboBox<String> comoMedioDePago;
    private com.toedter.calendar.JDateChooser dateIda;
    private com.toedter.calendar.JDateChooser dateVuelta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtCantidadPasajeros;
    private javax.swing.JTextField txtDestino;
    private javax.swing.JTextField txtEmailUsuario;
    private javax.swing.JTextField txtOrigen;
    private javax.swing.JTextField txtPrecioFinal;
    // End of variables declaration//GEN-END:variables
}
