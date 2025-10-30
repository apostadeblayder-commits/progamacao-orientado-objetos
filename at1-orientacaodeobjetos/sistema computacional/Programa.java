 
public class Programa{

private int memoriaRAM;
private int SSD;
private int nucleos;
private int quantidadeOperacoes;



    public Programa(int memoriaRAM, int SSD, int nucleos, int quantidadeOperacoes) {
        this.memoriaRAM = memoriaRAM;
        this.SSD = SSD;
        this.nucleos = nucleos;
        this.quantidadeOperacoes = quantidadeOperacoes;
    }


    public int getMemoriaRAM() {
        return this.memoriaRAM;
    }

    public void setMemoriaRAM(int memoriaRAM) {
        this.memoriaRAM = memoriaRAM;
    }

    public int getSSD() {
        return this.SSD;
    }

    public void setSSD(int SSD) {
        this.SSD = SSD;
    }

    public int getNucleos() {
        return this.nucleos;
    }

    public void setNucleos(int nucleos) {
        this.nucleos = nucleos;
    }

    public int getQuantidadeOperacoes() {
        return this.quantidadeOperacoes;
    }

    public void setQuantidadeOperacoes(int quantidadeOperacoes) {
        this.quantidadeOperacoes = quantidadeOperacoes;
    }





}