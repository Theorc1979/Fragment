package hector_corredor.mascotas.pojo;

/**
 * Created by ASUS on 08/09/2017.
 */

public class DetMascota {
    private int foto;
    private String huesos;

    public DetMascota (int foto, String huesos){
        this.foto = foto;
        this.huesos = huesos;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public String getHuesos() {
        return huesos;
    }

    public void setHuesos(String huesos) {
        this.huesos = huesos;
    }
}
