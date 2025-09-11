public class Computador{

private int memoriaRAM;
private int SSD;
private int nucleos;
private float operacoesPorSegundo;





    public Computador(int memoriaRAM, int SSD, int nucleos, float operacoesPorSegundo) {
        this.memoriaRAM = memoriaRAM;
        this.SSD = SSD;
        this.nucleos = nucleos;
        this.operacoesPorSegundo = operacoesPorSegundo;
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

    public float getOperacoesPorSegundo() {
        return this.operacoesPorSegundo;
    }

    public void setOperacoesPorSegundo(float operacoesPorSegundo) {
        this.operacoesPorSegundo = operacoesPorSegundo;
    }
    
 



}