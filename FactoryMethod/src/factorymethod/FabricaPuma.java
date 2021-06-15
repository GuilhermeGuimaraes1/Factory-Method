
package factorymethod;

public class FabricaPuma extends FabricaDeCamisetas {
        
    @Override
    public CamisetasEsportivas criarCamisetas(String type) {
        if(type == null) {
            return null;
        }
        else if(type.equalsIgnoreCase("BOTAFOGO")) {
            return new Botafogo();
        }
        return null;
    }
    
}
