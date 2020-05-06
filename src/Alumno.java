

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;


public class Alumno {
    
    private int legajo;
    private String apellido;
    private String nombre;
    private Set <Materia> lisMateria;

    public Alumno(int legajo, String apellido, String nombre) {
        this.legajo = legajo;
        this.apellido = apellido;
        this.nombre = nombre;
        lisMateria = new HashSet<Materia>();
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) 
    {
        this.nombre = nombre;
    }
    
    public void agregarMateria (Materia m)
    {
        lisMateria.add(m);
    }

    public int cantidadMaterias ()
    {
        return lisMateria.size();
    }

}
