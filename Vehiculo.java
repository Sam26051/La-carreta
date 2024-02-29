/*
 * 
 */

public abstract class Vehiculo {
    private final String placa;
    private final String modelo;
    private final String color;
    private final String marca;

    public Vehiculo(String placa, String modelo, String color, String marca){
        assert placa!= null;
        assert modelo!= null;
        assert color!= null;
        assert marca!= null;

        this.placa = placa;
        this.modelo = modelo;
        this.color = color;
        this.marca = marca;
    }

    public String getPlaca(){
        return placa;
    }

    public String getModelo(){
        return modelo;
    }

    public String getColor(){
        return color;
    }

    public String getMarca(){
        return marca;
    }
}