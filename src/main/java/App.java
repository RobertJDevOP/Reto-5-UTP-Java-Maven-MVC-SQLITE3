import view.VistaRequerimientosReto4;

public class App {
    public static void main( String[] args ){        

      
     
        VistaRequerimientosReto4.requerimiento_1();
        System.out.println();

        
         VistaRequerimientosReto4.requerimiento_2();
         System.out.println();

       
        VistaRequerimientosReto4.requerimiento_3();
        System.out.println();
    }

}


/*

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.sql.PreparedStatement;


class JDBCUtilities {
    private static final String DATABASE_LOCATION = "ProyectosConstruccion.db";

    public static Connection getConnection() throws SQLException {
        String url = "jdbc:sqlite:"+DATABASE_LOCATION;

        return DriverManager.getConnection(url);
    }
}

//view 


public class VistaRequerimientosReto4 {

    
    public static final ControladorRequerimientosReto4 controlador = new ControladorRequerimientosReto4();

    public static void requerimiento1(){

        System.out.println("*** Lideres por Salario ***");       

        try{
            
            ArrayList<Requerimiento1> rankingLideresPorSalario = controlador.consultarLiderPorSalarios();

            //Cada VO cargado, mostrarlo en la vista
            for (Requerimiento1 liderPorSalario : rankingLideresPorSalario) {
                System.out.printf("El Lider %s %s con Id %d Tiene un salario de %d %n",
                    liderPorSalario.getNombre(),
                    liderPorSalario.getPrimerApellido(),
                    liderPorSalario.getIdLider(),
                    liderPorSalario.getSalario()
                );   
            }

        }catch(SQLException e){
            System.err.println("Ha ocurrido un error!"+e.getMessage());
        }
    }

    public static void requerimiento2(){

        System.out.println("*** Proyectos por Tipo ***");       

        try{
            
            ArrayList<Requerimiento2> rankingProyectosPorTipo = controlador.consultarProyectosPorTipo();

            //Cada VO cargado, mostrarlo en la vista
            for (Requerimiento2 proyectosPorTipo : rankingProyectosPorTipo) {
                System.out.printf("El proyecto con ID %d de la constructora: %s de la ciudad %s, tiene un estrato asignado igual a %d %n",
                    proyectosPorTipo.getIdProyecto(),
                    proyectosPorTipo.getConstructora(),
                    proyectosPorTipo.getCiudad(),
                    proyectosPorTipo.getEstrato()
                );   
            }

        }catch(SQLException e){
            System.err.println("Ha ocurrido un error!"+e.getMessage());
        }
    }

    public static void requerimiento3(){

        System.out.println("*** Lideres por Nombre ***");       

        try{
            
            ArrayList<Requerimiento3> rankingLideresPorNombre = controlador.consultarLiderPorNombre();

            //Cada VO cargado, mostrarlo en la vista
            for (Requerimiento3 liderPorNombre : rankingLideresPorNombre) {
                System.out.printf("El Lider con Id %d se llama %s %s %n",
                    liderPorNombre.getIdLider(),
                    liderPorNombre.getNombre(),
                    liderPorNombre.getPrimerApellido()
                     
                );   
            }

        }catch(SQLException e){
            System.err.println("Ha ocurrido un error!"+e.getMessage());
        }
    }




}






public class ControladorRequerimientosReto4 {       
 

    private final Requerimiento1_Dao Requerimiento1_Dao;
    private final Requerimiento_2Dao Requerimiento_2Dao;
    private final Requerimiento_3Dao Requerimiento_3Dao;

    public ControladorRequerimientosReto4(){
        this.Requerimiento1_Dao = new Requerimiento1_Dao();
        this.Requerimiento_2Dao = new Requerimiento_2Dao();
        this.Requerimiento_3Dao = new Requerimiento_3Dao();

    }

    public ArrayList<Requerimiento1> consultarLiderPorSalarios() throws SQLException {
        return this.Requerimiento1_Dao.rankingLideresPorSalario();

    }
    
    public ArrayList<Requerimiento2> consultarProyectosPorTipo() throws SQLException {
        return this.Requerimiento_2Dao.rankingProyectosPorTipo();
    }

    public ArrayList<Requerimiento3> consultarLiderPorNombre() throws SQLException {
        return this.Requerimiento_3Dao.rankingLideresPorNombre();
    }


}




public class Requerimiento1 {
    //Su codigo
  

    private Integer idLider;
    private String nombre;
    private String primerApellido;
    private Integer salario;
    

    public Requerimiento1() {
    }

    public Requerimiento1(Integer idLider, String nombre, String primerApellido, Integer salario) {
        this.idLider = idLider;
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.salario = salario;
    }

    
    public Integer getIdLider() {
        return idLider;
    }

    public void setIdLider(Integer idLider) {
        this.idLider = idLider;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public Integer getSalario() {
        return salario;
    }

    public void setSalario(Integer salario) {
        this.salario = salario;
    }
    

}



public class Requerimiento2 {
    //Su codigo
    private Integer idProyecto;
    private String constructora;
    private String ciudad;
    private Integer estrato;

    public Requerimiento2() {
    }

    public Requerimiento2(Integer idProyecto, String constructora, String ciudad, Integer estrato) {
        this.idProyecto = idProyecto;
        this.constructora = constructora;
        this.ciudad = ciudad;
        this.estrato = estrato;
    }

    
    public Integer getIdProyecto() {
        return idProyecto;
    }

    public void setIdProyecto(Integer idProyecto) {
        this.idProyecto = idProyecto;
    }

    public String getConstructora() {
        return constructora;
    }

    public void setConstructora(String constructora) {
        this.constructora = constructora;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public Integer getEstrato() {
        return estrato;
    }

    public void setEstrato(Integer estrato) {
        this.estrato = estrato;
    }
    
}



public class Requerimiento3 {
    //su codigo  
    private Integer idLider;
    private String nombre;
    private String primerApellido;
    

    public Requerimiento3() {
    }

    public Requerimiento3(Integer idLider, String nombre, String primerApellido) {
        this.idLider = idLider;
        this.nombre = nombre;
        this.primerApellido = primerApellido;

    }

    
    public Integer getIdLider() {
        return idLider;
    }

    public void setIdLider(Integer idLider) {
        this.idLider = idLider;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }
}

//DAO


public class Requerimiento_2Dao {
   
    public ArrayList<Requerimiento2> rankingProyectosPorTipo() throws SQLException {
        // Su código
        ArrayList<Requerimiento2> respuesta = new ArrayList<Requerimiento2>();

            Connection conexion = JDBCUtilities.getConnection();
    
            try{       
    
                String consulta =   "SELECT ID_Proyecto, Constructora, Ciudad, Estrato "+
                                    "FROM Proyecto "+
                                    "INNER JOIN Tipo "+
                                    "ON Proyecto.ID_Tipo = Tipo.ID_Tipo "+
                                    "WHERE Ciudad = 'Cartagena'"+
                                    "ORDER BY Estrato ";
                    
    
    
                PreparedStatement statement = conexion.prepareStatement(consulta);
                ResultSet resultSet = statement.executeQuery();
    
                //Recorrer los registros en los VO específicos
                while(resultSet.next()){
                    Requerimiento2 proyectosPorTipo = new Requerimiento2();
                    proyectosPorTipo.setIdProyecto(resultSet.getInt("Id_Proyecto"));
                    proyectosPorTipo.setConstructora(resultSet.getString("Constructora"));
                    proyectosPorTipo.setCiudad(resultSet.getString("Ciudad"));
                    proyectosPorTipo.setEstrato(resultSet.getInt("Estrato"));
    
                    //Se agrega cada registro como un objeto del ArrayList que contiene la consulta
                    respuesta.add(proyectosPorTipo);
                }
    
                resultSet.close();
                statement.close();
    
            }catch(SQLException e){
                System.err.println("Error consultando los proyectos por tipo: "+e);
            }finally{
                if(conexion != null){
                    conexion.close();
                }
            }
    
            //Retornar la colección de vo's
            return respuesta;
        }  
    }
        




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








*/