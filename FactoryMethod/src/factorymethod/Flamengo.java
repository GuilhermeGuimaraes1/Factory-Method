
package factorymethod;

public class Flamengo extends CamisetasEsportivas {
    
    public Flamengo(){};
    
    @Override
    public void exibirInfo() {
        System.out.println("Marca: Adidas \n Camiseta: Flamengo. ");
    }
}
