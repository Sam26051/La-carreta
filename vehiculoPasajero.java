/*
 * 
 */

 public class vehiculoPasajero extends Vehiculo{
    private final int numMaxPasajeros;

    public vehiculoPasajero(String placa, String modelo, String color, String marca, int numMaxPasajeros){
        super(placa, modelo, color, marca);
        this.numMaxPasajeros = numMaxPasajeros;
    }

    public int getNumMaxPasajeros(){
        return numMaxPasajeros;
    }
}