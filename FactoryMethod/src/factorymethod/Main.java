
package factorymethod;

public class Main {

    public static void main(String[] args) {
        FabricaDeCamisetas fabricaNike = new FabricaNike();
        CamisetasEsportivas nike = fabricaNike.criarCamisetas("BRASIL");
        nike.exibirInfo();
        
        FabricaDeCamisetas fabricaAdidas = new FabricaAdidas();
        CamisetasEsportivas adidas = fabricaAdidas.criarCamisetas("FLAMENGO");
        adidas.exibirInfo();
        
        FabricaDeCamisetas fabricaPuma = new FabricaPuma();
        CamisetasEsportivas puma = fabricaPuma.criarCamisetas("BOTAFOGO");
        puma.exibirInfo();
        
        FabricaDeCamisetas fabricaUmbro = new FabricaUmbro();
        CamisetasEsportivas umbro = fabricaUmbro.criarCamisetas("FLUMINENSE");
        umbro.exibirInfo();
        
        FabricaDeCamisetas fabricaKappa = new FabricaKappa();
        CamisetasEsportivas kappa = fabricaKappa.criarCamisetas("VASCO");
        kappa.exibirInfo();
    }
    
}
