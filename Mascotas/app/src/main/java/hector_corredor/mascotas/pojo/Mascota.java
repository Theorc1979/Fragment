package hector_corredor.mascotas.pojo;

/**
 * Created by ASUS on 30/08/2017.
 */

public class Mascota {
    private int foto;
    private String nombre;
    private String huesos;

    public Mascota (int foto, String nombre, String huesos){
        this.foto = foto;
        this.nombre = nombre;
        this.huesos = huesos;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getHuesos() {
        return huesos;
    }

    public void setHuesos(String huesos) {
        this.huesos = huesos;
    }


}
