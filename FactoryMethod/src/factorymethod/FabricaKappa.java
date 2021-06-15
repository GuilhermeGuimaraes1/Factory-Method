
package factorymethod;

public class FabricaKappa extends FabricaDeCamisetas {
    
    @Override
    public CamisetasEsportivas criarCamisetas(String type) {
        if(type == null) {
            return null;
        }
        else if(type.equalsIgnoreCase("VASCO")) {
            return new Vasco();
        }
        return null;
    }
}
