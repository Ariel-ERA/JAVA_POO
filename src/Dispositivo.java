
public class Dispositivo {

    private String nombre;
    private boolean activo; ;

    public Dispositivo(){
    }
    public Dispositivo(String nombre , boolean activo) {
        this.nombre = nombre;
        this.activo = activo;
    }
    public void mostrarEstatus(){
        System.out.println(nombre + " - " + activo);
    }
    public void ejecutarDiagnostico() {
        System.out.println("Ejecutando diagnóstico general...");
    }
}
