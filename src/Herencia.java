public class Herencia  {

    public static void  main (String [] args) {

        Dispositivo dispositivo = new Dispositivo("Robot", true);

        dispositivo.mostrarEstado();
        dispositivo.ejecutarDiagnostico();
    }
}