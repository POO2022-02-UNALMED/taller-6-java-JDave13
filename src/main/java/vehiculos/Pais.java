package vehiculos;
public class Pais {
    private String nombre;

    public Pais(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this._nombre = nombre;
    }

    public static Pais paisMasVendedor() {
        Fabricante fabMVentas = Fabricante.fabricaMayorVentas();
        return fabMVentas.getPais();
    }

}