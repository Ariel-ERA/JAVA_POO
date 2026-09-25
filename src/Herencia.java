public class Herencia {

    public static void main(String[] args) {

        Dispositivo dispositivo = new Dispositivo("Robot", true);

        System.out.println(" \n\t ******** Dispositivo ******** \n\n\t " + dispositivo);

        dispositivo.mostrarEstatus();
        dispositivo.ejecutarDiagnostico();
    }
}
