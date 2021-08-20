package model.dao;

//Estructura de datos
import java.util.ArrayList;

//Librerías para SQL y Base de Datos
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

//Clase para conexión
import util.JDBCUtilities;

//Encapsulamiento de los datos
import model.vo.Requerimiento1;


public class Requerimiento1_Dao {
    
    public ArrayList<Requerimiento1> rankingLideresPorSalario() throws SQLException {
        // Su código
        ArrayList<Requerimiento1> respuesta = new ArrayList<Requerimiento1>();
        Connection conexion = JDBCUtilities.getConnection();

        try{       

            String consulta =   "SELECT Id_Lider, Nombre, Primer_Apellido, salario "+
                                "FROM Lider "+
                                "WHERE salario <= 500000 "+
                                "ORDER BY salario ";
                                

            PreparedStatement statement = conexion.prepareStatement(consulta);
            ResultSet resultSet = statement.executeQuery();

            //Recorrer los registros en los VO específicos
            while(resultSet.next()){
                Requerimiento1 liderPorSalario = new Requerimiento1();
                liderPorSalario.setNombre(resultSet.getString("Nombre"));
                liderPorSalario.setPrimerApellido(resultSet.getString("Primer_Apellido"));
                liderPorSalario.setIdLider(resultSet.getInt("Id_Lider"));
                liderPorSalario.setSalario(resultSet.getInt("Salario"));
              
                //Se agrega cada registro como un objeto del ArrayList que contiene la consulta
                respuesta.add(liderPorSalario);
            }

            resultSet.close();
            statement.close();

        }catch(SQLException e){
            System.err.println("Error consultando los lideres por salario: "+e);
        }finally{
            if(conexion != null){
                conexion.close();
            }
        }

        //Retornar la colección de vo's
        return respuesta;
    }
    
}
