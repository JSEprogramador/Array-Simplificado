
public class Boletim {

    private String nome;
    private int materia;
    private double[] nota;
    private double media;

    public Boletim() {

    }

    public Boletim(String nome, int materia, double[] nota, double media) {
        this.nome = nome;
        this.materia = materia;
        this.nota = nota;
        this.media = media;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMateria() {
        return materia;
    }

    public void setMateria(int materia) {
        this.materia = materia;
    }

    public double[] getNota() {
        return nota;
    }

    public void setNota(double[] nota) {
        this.nota = nota;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }
}