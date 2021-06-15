
package factorymethod;

public class FabricaAdidas extends FabricaDeCamisetas {
    
    @Override
    public CamisetasEsportivas criarCamisetas(String type) {
        if(type == null) {
            return null;
        }
        else if(type.equalsIgnoreCase("FLAMENGO")) {
            return new Flamengo();
        }
        return null;
    }
}
