package interfaces;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

public class VueloDAO {
    private Connection cn;

    public VueloDAO(Connection cn) {
        this.cn = cn;
    }

    public DefaultTableModel obtenerVuelos() {
        String[] columnNames = {"Origen", "Destino", "Aerolínea", "Nombre del Avión", "Horario de Salida", "Duración del Viaje", "Modelo del Avión"};
        DefaultTableModel tableModel = new DefaultTableModel(columnNames, 0);

        String consulta = "SELECT origen, destino, aerolinea, nombre_avion, horario_salida, duracion_viaje, modelo_avion FROM vuelos";

        try (PreparedStatement ps = cn.prepareStatement(consulta); ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                String origen = rs.getString("origen");
                String destino = rs.getString("destino");
                String aerolinea = rs.getString("aerolinea");
                String nombreAvion = rs.getString("nombre_avion");
                String horarioSalida = rs.getString("horario_salida");
                String duracionViaje = rs.getString("duracion_viaje");
                String modeloAvion = rs.getString("modelo_avion");

                Object[] data = {origen, destino, aerolinea, nombreAvion, horarioSalida, duracionViaje, modeloAvion};
                tableModel.addRow(data);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return tableModel;
    }
}
