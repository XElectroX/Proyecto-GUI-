

public class Propiedad
{
    private String nombre;
    private String propietario;
    private Double area;
    private Integer habitante;
    public Propiedad(String nombre , String propietario, Double area, Integer habitante)
    {
       this.nombre = nombre;
       this.propietario = propietario;
       this.area = area;
       this.habitante = habitante;
    }
    
    public String getNombre()
    {return nombre;}
    
    public void setNombre(String nombre)
    {this.nombre = nombre;}
    
    public String getPropieario()
    {return propietario;}
    
    public void setPropieario(String propieario)
    {this.propietario = propietario;}
    
    public Double getArea()
    {return area;}
    
    public void setArea(Double area)
    {this.area = area;}
    
    public Integer getHabitante()
    {return habitante;}
    
    public void setHabitante(Integer habitante)
    {this.habitante = habitante;}

    
}
