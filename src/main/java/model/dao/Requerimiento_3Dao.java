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
import model.vo.Requerimiento3;

public class Requerimiento_3Dao {
    //Obtener los proyectos por Tipo en la ciudad de Montería
    public ArrayList<Requerimiento3> rankingLideresPorNombre() throws SQLException {

     
            ArrayList<Requerimiento3> respuesta = new ArrayList<Requerimiento3>();
            Connection conexion = JDBCUtilities.getConnection();
    
            try{       
    
                String consulta =   "SELECT ID_Lider, Nombre, Primer_Apellido "+
                                    "FROM Lider "+
                                    "WHERE Primer_Apellido LIKE '%z' "+
                                    "ORDER BY Nombre ";
                                    
    
                PreparedStatement statement = conexion.prepareStatement(consulta);
                ResultSet resultSet = statement.executeQuery();
    
                //Recorrer los registros en los VO específicos
                while(resultSet.next()){
                    Requerimiento3 liderPorNombre = new Requerimiento3();
                    liderPorNombre.setIdLider(resultSet.getInt("ID_Lider"));
                    liderPorNombre.setNombre(resultSet.getString("Nombre"));
                    liderPorNombre.setPrimerApellido(resultSet.getString("Primer_Apellido"));
                    
                  
                    //Se agrega cada registro como un objeto del ArrayList que contiene la consulta
                    respuesta.add(liderPorNombre);
                }
    
                resultSet.close();
                statement.close();
    
            }catch(SQLException e){
                System.err.println("Error consultando los lideres por nombre: "+e);
            }finally{
                if(conexion != null){
                    conexion.close();
                }
            }
    
            //Retornar la colección de vo's
            return respuesta;
        }    
}
