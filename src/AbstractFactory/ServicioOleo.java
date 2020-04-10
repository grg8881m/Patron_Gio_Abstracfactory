
package AbstractFactory;

public class ServicioOleo implements ServicioEnArte{
    @Override
    public void asignarTrabajo(){
        System.out.println("El trabajo ha sido asignado a artistas disponibles");
    }
    
    @Override
    public void indicarFechaEntrega(){
        System.out.println("El artista ha determinado terminar la obra como maximo el día 15/03/2020");
    }
    
    @Override
    public void informarSobrePago(){
        System.out.println("Debe realizar el pago en el momento de entrega y a satisfacción.");
    }
}
