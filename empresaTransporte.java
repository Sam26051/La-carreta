/*
 * 
 */

import java.util.Collection;
 import java.util.Collections;
 import java.util.LinkedList;

 public class empresaTransporte{
    private final String nombre;
    private final Collection<Asociado> asociados;
    private final Collection<Vehiculo> vehiculos;

    public empresaTransporte(String nombre){
        assert nombre!= null;

        this.nombre = nombre;
        this.asociados= new LinkedList<>();
        this.vehiculos = new LinkedList<>();
    }

    public String getNombre(){
        return nombre;
    }
 }