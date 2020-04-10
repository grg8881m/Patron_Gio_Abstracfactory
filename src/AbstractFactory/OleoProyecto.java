package AbstractFactory;

public class OleoProyecto implements ServicioFactory{
    @Override
    public ServicioEnArte crearServicio(){
        return new ServicioOleo();
    }
}
