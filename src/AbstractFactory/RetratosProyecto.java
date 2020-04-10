package AbstractFactory;


public class RetratosProyecto implements ServicioFactory {
    
    @Override
    public ServicioEnArte crearServicio(){
        return new ServicioRetrato();
    }
    
    
}
