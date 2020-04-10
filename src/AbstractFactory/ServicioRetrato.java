
package AbstractFactory;

public class ServicioRetrato implements ServicioEnArte {
    
    
    public void asignarTrabajo(){
        System.out.println("El Artista de retratos se le ha asignado el proyecto.");
    
    }
    
    public void indicarFechaEntrega(){
        System.out.println("El retrato sera terminado a mas tardar el 12/03/2020.");
    }
    
    
    public void informarSobrePago(){
        System.out.println("El monto a pagar no incluye el envio.");
    }
}
