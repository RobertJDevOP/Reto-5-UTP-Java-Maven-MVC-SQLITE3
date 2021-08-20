package controller;

//Estructuras de datos (colecciones)
import java.util.ArrayList;

//Modelos (acceso y objetos contenedores)
import model.dao.Requerimiento1_Dao;
import model.dao.Requerimiento_2Dao;
import model.dao.Requerimiento_3Dao;


import model.vo.Requerimiento1;
import model.vo.Requerimiento2;
import model.vo.Requerimiento3;


//Librerías para bases de datos
import java.sql.SQLException;

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
