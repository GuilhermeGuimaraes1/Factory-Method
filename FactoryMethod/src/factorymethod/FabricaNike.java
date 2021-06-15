
package factorymethod;

public class FabricaNike extends FabricaDeCamisetas {

    @Override
    public CamisetasEsportivas criarCamisetas(String type) {
        if(type == null) {
            return null;
        }
        else if(type.equalsIgnoreCase("BRASIL")) {
            return new Brasil();
        }
        return null;
    }
}
