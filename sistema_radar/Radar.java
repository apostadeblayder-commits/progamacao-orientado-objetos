package sistema_radar;

public class Radar {
    
    public Integer limitação;
    public Integer limiteVelocidade;
    public String localizacao;

    public void avaliarVelocidade(Carro carro){
        if(carro.velocidade > this.limiteVelocidade){

            emitirNotificacao(carro.placa, carro.velocidade);
        }
 
    }

    public void emitirNotificacao(String placa, Integer velocidadeObservada){
 System.out.println("placa: " +placa);
 System.out.println("Velocidade observada: "+ velocidadeObservada);
System.out.println("limite da vida "+ this.limiteVelocidade);
    }
}
