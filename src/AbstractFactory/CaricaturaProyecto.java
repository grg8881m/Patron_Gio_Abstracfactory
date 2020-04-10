package AbstractFactory;

public class CaricaturaProyecto implements ServicioFactory {
    
    @Override
    public ServicioEnArte crearServicio(){
        return new ServicioCaricatura();
    }
    
}
