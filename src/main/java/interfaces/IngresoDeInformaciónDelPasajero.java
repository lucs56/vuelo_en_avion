/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaces;

import conexion.conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author SFTA
 */
public class IngresoDeInformaciónDelPasajero extends javax.swing.JFrame {

    conexion cone =new conexion();
    Connection cn=cone.conectar();
    
    private int adultos;
    private int menores;
    private int totalPasajeros;
    private int pasajerosProcesados = 0;
    
    private Date fechaVuelo;
    
    public IngresoDeInformaciónDelPasajero(int adultos, int menores, Date fechaVuelo) {
        this.adultos = adultos;
        this.menores = menores;
        this.totalPasajeros = adultos + menores;   
         this.fechaVuelo = fechaVuelo; 

        initComponents();
        setLocationRelativeTo(null);
        txtTicket.setText(generarTicketPasajero()); // Generar un nuevo ticket para el primer pasajero
        
        dateFechaVuelo.setDate(fechaVuelo);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnSiguiente = new javax.swing.JButton();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtTicket = new javax.swing.JTextField();
        dateNacimiento = new com.toedter.calendar.JDateChooser();
        btnAnterior = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        dateFechaVuelo = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 102));
        jLabel1.setText("Información de los Pasajeros");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(309, 36, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 102));
        jLabel2.setText("Nombre");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(253, 75, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 102));
        jLabel3.setText("Apellido");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(253, 143, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 102));
        jLabel4.setText("Fecha de nacimiento");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(253, 211, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 102));
        jLabel5.setText("Ticket Del Pasajero");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(253, 351, -1, -1));

        btnSiguiente.setBackground(new java.awt.Color(102, 153, 255));
        btnSiguiente.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnSiguiente.setForeground(new java.awt.Color(255, 255, 255));
        btnSiguiente.setText("Siguiente");
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });
        jPanel1.add(btnSiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(489, 432, -1, -1));

        txtNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 102)));
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(253, 101, 313, 24));

        txtApellido.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 102)));
        jPanel1.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(253, 169, 313, 24));

        txtTicket.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 102)));
        jPanel1.add(txtTicket, new org.netbeans.lib.awtextra.AbsoluteConstraints(253, 377, 313, 24));

        dateNacimiento.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 102)));
        jPanel1.add(dateNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(253, 237, 313, -1));

        btnAnterior.setBackground(new java.awt.Color(102, 153, 255));
        btnAnterior.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnAnterior.setForeground(new java.awt.Color(255, 255, 255));
        btnAnterior.setText("Anterior");
        btnAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnteriorActionPerformed(evt);
            }
        });
        jPanel1.add(btnAnterior, new org.netbeans.lib.awtextra.AbsoluteConstraints(253, 433, -1, 27));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 102));
        jLabel6.setText("Fecha del vuelo");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(253, 281, -1, -1));

        dateFechaVuelo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 102)));
        jPanel1.add(dateFechaVuelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(253, 307, 313, -1));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setOpaque(true);
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 390, 490));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\USUARIO\\OneDrive\\Escritorio\\Imagenes Boleto de Avion\\Nubes.jpeg")); // NOI18N
        jLabel7.setOpaque(true);
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 810, 530));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 830, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
        String nombre = txtNombre.getText();
        String apellido = txtApellido.getText();
        Date fechaNacimiento = dateNacimiento.getDate();
        String ticket = txtTicket.getText();

        if (nombre.isEmpty() || apellido.isEmpty() || fechaNacimiento == null || ticket.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
    // Verificar la edad del pasajero
    int edad = calcularEdad(fechaNacimiento);        
    // Si el pasajero es adulto, verificar si tiene al menos 18 años
    if (adultos > 0 && edad < 18) {
        JOptionPane.showMessageDialog(this, "Los adultos deben tener al menos 18 años.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
        // Guardar los datos en la base de datos
        try {
            String sql = "INSERT INTO pasajeros (nombre, apellido, fecha_nacimiento, fecha_vuelo, ticket_pasajero) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, nombre);
            pst.setString(2, apellido);
            pst.setDate(3, new java.sql.Date(fechaNacimiento.getTime()));
            pst.setDate(4, new java.sql.Date(fechaVuelo.getTime()));
            pst.setString(5, ticket);
            pst.executeUpdate();

            JOptionPane.showMessageDialog(this, "Datos guardados correctamente en la base de datos.");
            pasajerosProcesados++;
             // Actualizar el número de adultos y menores restantes
        if (adultos > 0) {
            adultos--;
        } else {
            menores--;
        }
            if (pasajerosProcesados < totalPasajeros) {
                txtNombre.setText("");
                txtApellido.setText("");
                dateNacimiento.setDate(null);
                txtTicket.setText(generarTicketPasajero()); // Generar nuevo ticket para el siguiente pasajero
            } else {
                dispose();
                new MetodosDePago().setVisible(true);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error al guardar en la base de datos: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnSiguienteActionPerformed
private int calcularEdad(Date fechaNacimiento) {
    Date hoy = new Date();
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
    int anioNacimiento = Integer.parseInt(sdf.format(fechaNacimiento));
    int anioActual = Integer.parseInt(sdf.format(hoy));
    return anioActual - anioNacimiento;
}
    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void btnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorActionPerformed
    dispose();
    new CriteriosDeBusqueda().setVisible(true);
    }//GEN-LAST:event_btnAnteriorActionPerformed

   private String generarTicketPasajero() {
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        StringBuilder ticket = new StringBuilder();
        Random rnd = new Random();
        while (ticket.length() < 10) { // longitud del ticket
            int index = (int) (rnd.nextFloat() * caracteres.length());
            ticket.append(caracteres.charAt(index));
        }
        return ticket.toString();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnterior;
    private javax.swing.JButton btnSiguiente;
    private com.toedter.calendar.JDateChooser dateFechaVuelo;
    private com.toedter.calendar.JDateChooser dateNacimiento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTicket;
    // End of variables declaration//GEN-END:variables
}
