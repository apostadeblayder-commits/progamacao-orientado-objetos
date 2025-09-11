public class SistemaOperacional {

private String nome;
private int versao;
private long espacoLivresSSD0s;



    public SistemaOperacional(Srting nome, int versao, long espacoLivresSSD0s) {
        this.nome = nome;
        this.versao = versao;
        this.espacoLivresSSD0s = espacoLivresSSD0s;
    }



    public Srting getNome() {
        return this.nome;
    }

    public void setNome(Srting nome) {
        this.nome = nome;
    }

    public int getVersao() {
        return this.versao;
    }

    public void setVersao(int versao) {
        this.versao = versao;
    }

    public long getEspacoLivresSSD0s() {
        return this.espacoLivresSSD0s;
    }

    public void setEspacoLivresSSD0s(long espacoLivresSSD0s) {
        this.espacoLivresSSD0s = espacoLivresSSD0s;
    }


}