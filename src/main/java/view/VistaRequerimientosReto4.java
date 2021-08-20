package view;


import controller.ControladorRequerimientosReto4;
import model.vo.Requerimiento1;
import model.vo.Requerimiento2;
import model.vo.Requerimiento3;


import java.sql.SQLException;
import java.util.ArrayList;

public class VistaRequerimientosReto4 {



    
    public static final ControladorRequerimientosReto4 controlador = new ControladorRequerimientosReto4();

    public static void requerimiento_1(){

        System.out.println("*** Lideres por Salario ***");       
      
        try{
            
            ArrayList<Requerimiento1> rankingLideresPorSalario = controlador.consultarLiderPorSalarios();

            //Cada VO cargado, mostrarlo en la vista desde aqui lleno la table same 
            for (Requerimiento1 liderPorSalario : rankingLideresPorSalario) {
                System.out.printf("El Lider %s %s con Id %d Tiene un salario de %d %n",
                    liderPorSalario.getNombre(),
                    liderPorSalario.getPrimerApellido(),
                    liderPorSalario.getIdLider(),
                    liderPorSalario.getSalario()
                );   
            }

   ///////////////////////////////////////////////////////////////////////////////////////         
            
        }catch(SQLException e){
            System.err.println("Ha ocurrido un error!"+e.getMessage());
        }
    }

    public static void requerimiento_2(){

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

    public static void requerimiento_3(){

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
