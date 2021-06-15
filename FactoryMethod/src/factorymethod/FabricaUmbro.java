
package factorymethod;

public class FabricaUmbro extends FabricaDeCamisetas {
    
    @Override
    public CamisetasEsportivas criarCamisetas(String type) {
        if(type == null) {
            return null;
        }
        else if(type.equalsIgnoreCase("FLUMINENSE")) {
            return new Fluminense();
        }
        return null;
    }
    
}
