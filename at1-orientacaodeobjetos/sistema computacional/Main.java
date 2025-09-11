public class Main{

public static void  Main(String[] args){

    SistemaOperacional Windows10 = new SistemaOperacional("windows10", 19045, 450000);
    Computador meuComputador = new Computador("Dell", 8000, 1000000, 4, 10000, windows10); 
}
system.out.println("configuracao do Computador");
system.out.println("Marca: " + meuComputador.getMarca());
system.out.println("Memoria RAM: " +  meuComputador.getNucleos() + "MB");
system.out.println("SSD: " + meuComputador.getNucleos() );
system.out.println("Sistema Operacional: " + meuComputador.getSistema().getNome());
meuComputador.instalarPrograma(programaSucesso);
meuComputador.executarPrograma(programaSucesso);
system.out.println("-----------------------------");

}