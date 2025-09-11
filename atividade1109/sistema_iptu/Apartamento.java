package sistema_iptu;

public class Apartamento extends Imovel {
    private Boolean possuiElevador;
  //boolean so pode receber true ou false.

   
   


  public Apartamento(Municipio municipio, Double areaM2, Integer vagas, Boolean possuiElevador) {
    super(municipio, areaM2, vagas);
  }

 
  

}
