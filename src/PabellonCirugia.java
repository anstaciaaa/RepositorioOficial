import java.util.Objects;

public class PabellonCirugia {
    private int numero;
    private String especialidad;
    private Estado estado;

    public PabellonCirugia(int cirugia, String especialidad) {
        this.numero = cirugia;
        this.especialidad = especialidad;
        estado = Estado.DISPONIBLE;
    }

    public int getNumero() {
        return numero;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    @Override
    public String toString(){
        String newestado = this.estado.name().toLowerCase();
        return numero + ", " + especialidad + ", " + newestado;
    }
    @Override
    public boolean equals(Object otro){
        if (this == otro) return true;
        if (otro == null || getClass() != otro.getClass()) return false;

        PabellonCirugia pabellonCirugia = (PabellonCirugia) otro;
        return Objects.equals(numero, pabellonCirugia.numero);

    }
}
