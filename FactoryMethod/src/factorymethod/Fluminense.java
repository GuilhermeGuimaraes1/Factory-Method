
package factorymethod;

public class Fluminense extends CamisetasEsportivas{
        
    public Fluminense(){};
    
    @Override
    public void exibirInfo() {
        System.out.println("Marca: Umbro \n Camiseta: Fluminense. ");
    }
}
