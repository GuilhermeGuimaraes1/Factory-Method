
package factorymethod;

public class Botafogo extends CamisetasEsportivas {
    
    public Botafogo(){};
    
    @Override
    public void exibirInfo() {
        System.out.println("Marca: Puma \n Camiseta: Botafogo. ");
    }
}
