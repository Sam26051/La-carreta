/*
 * 
 */

public class vehiculoCarga extends Vehiculo{
    private final int capCarga;
    private final int numEjes;

    public vehiculoCarga(String placa, String modelo, String color, String marca, int capCarga, int numEjes){
        super(placa, modelo, color, marca);
        this.capCarga = capCarga;
        this.numEjes = numEjes;
    }

    public int getCapCarga(){
        return capCarga;
    }

    public int getNumEjes(){
        return numEjes;
    }
}