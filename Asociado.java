/*
 * 
 */

 public class Asociado {
    private final String nombre;
    private final String identificacion;
    private final String email;
    private final String celular;

    public Asociado(String nombre, String identificacion, String email, String celular){
        assert nombre!= null;
        assert identificacion!= null;
        assert email!= null;
        assert celular!= null;

        this.nombre = nombre;
        this.identificacion = identificacion;
        this.email = email;
        this.celular = celular;
    }

    public String getNombre(){
        return nombre;
    }

    public String getIdentificacion(){
        return identificacion;
    }

    public String getEmail(){
        return email;
    }

    public String getCelular(){
        return celular;
    }
 }