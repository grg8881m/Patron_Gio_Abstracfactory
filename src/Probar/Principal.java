package Probar;
import AbstractFactory.OleoProyecto;
import AbstractFactory.ServicioFactory;
import AbstractFactory.ServicioEnArte;
import AbstractFactory.CaricaturaProyecto;
import AbstractFactory.RetratosProyecto;
import java.util.Scanner;

public class Principal {
    
    private static Scanner S = new Scanner(System.in);

    public static void main(String[] args) {
        int o;
        
        do{
            o = seleccionarServicio();
                    switch(o) {
                case 1:
                    usarServicio(new OleoProyecto());
                    break;
                case 2:
                    usarServicio(new CaricaturaProyecto());
                    break;
                case 3:
                    usarServicio(new RetratosProyecto());
                    break;
                case 4:
                    System.out.println("Cerrando programa.");
                    break;
                default:
                    System.out.println("Se ha ingresado una opción inválida.");
            }
            System.out.print("\n");
        
        }while(0!=4);      
        
    }
    public static void usarServicio(ServicioFactory factory) {
        ServicioEnArte servicio = factory.crearServicio();
        servicio.asignarTrabajo();
        servicio.indicarFechaEntrega();
        servicio.informarSobrePago();
    }
    
    
    public static int seleccionarServicio(){
        System.out.println(
                "SELECCIONE LA OPCION\n"
        + "---- -- --------\n"
        + "1. Solicitar Crear Obra al Oleo.\n"
        + "2. Solicitar elaborar una Caricatura.\n"
        + "3. Solictar crear Retrato.\n"
        + "4. Cerrar aplicacion.\n"
        + "Seleccione opción : "
        );
        return Integer.parseInt(S.nextLine());
    }
    
}
