package Services;

import Entidades.Gimnasio;
import java.util.Scanner;

public class GimnasioService {

    ClienteService cliS = new ClienteService();
    RutinaService rutiS = new RutinaService();

    Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public void menuGimnasio() {

        int menuPpal = 0;

        do {

            System.out.println("Ingrese opcion: \n");
            System.out.println("1. Registrar Cliente \n"
                    + "2. Obtener Clientes \n"
                    + "3. Actualizar Cliente \n"
                    + "4. Eliminar Cliente \n"
                    + "5. Crear Rutina \n"
                    + "6. Obtener Rutinas \n"
                    + "7. Actualizar Rutinas \n"
                    + "8. Eliminar Rutina \n"
                    + "9. Salir \n");

            menuPpal = sc.nextInt();

            switch (menuPpal) {
                case 1:
                    cliS.registrarCliente();
                    break;
                case 2:
                   // if(cliS.registrarCliente()) Necesito chequear que ya hay algun cliente registrado
                    cliS.obtenerClientes();
                    break;
                case 3:
                    cliS.actualizarCliente(); // Necesito chequear que ya hay algun cliente registrado
                    break;
                case 4:
                    cliS.eliminarCliente(); // Necesito chequear que ya hay algun cliente registrado
                    break;
                case 5:
                    rutiS.crearRutina();
                    break;
                case 6:
                    rutiS.obtenerRutinas();
                    break;
                case 7:

                    break;
                case 8:

                    break;
                case 9:
                    System.exit(0);  // Para salir del menu
                    break;

                default:
                    System.out.println("Ingrese una opcion correcta, por favor (1 a 8)");
            }

        } while (menuPpal > 0 && menuPpal < 10);

    }

}
