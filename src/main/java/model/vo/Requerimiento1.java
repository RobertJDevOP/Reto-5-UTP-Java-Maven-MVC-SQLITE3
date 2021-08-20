package model.vo;

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
