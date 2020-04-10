
package AbstractFactory;

public class ServicioCaricatura implements ServicioEnArte{
    
    @Override
    public void asignarTrabajo(){
        System.out.println("Nuestro Caricaturista esta informado del proyecto.");
    }
    
    @Override
    public void indicarFechaEntrega(){
        System.out.println("Su Caricatura estar terminada 20/3/2020");
    }
    
    @Override
    public void informarSobrePago(){
        System.out.println("El monto a pagar será proporcional a la cantidad de personas en caricaturizar");
    }
    
}
