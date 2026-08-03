package exercises.mediaAlunos;

public class Aluno {
    private String nome;
    private Long matricula;
    private double p1;
    private double p2;
    private double p3;
    private double p4;
    private double media;
    private String situacao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getMatricula() {
        return matricula;
    }

    public void setMatricula(Long matricula) {
        this.matricula = matricula;
    }

    public void setP1(double p1) {
        this.p1 = p1;
    }

    public void setP2(double p2) {
        this.p2 = p2;
    }

    public void setP3(double p3) {
        this.p3 = p3;
    }

    public void setP4(double p4) {
        this.p4 = p4;
    }

    public double getMedia() {
        media = (p1 + p2 + p3 + p4) / 4;
        return media;
    }

    public String getSituacao() {
        if (getMedia() >= 7.0) {
            situacao = "Aprovado";
        } else if (getMedia() >= 5.0) {
            situacao = "Recuperação";
        } else {
            situacao = "Reprovado";
        }
        return situacao;
    }

    public void boletim() {
        System.out.println("Aluno: " + getNome() + " | Matricula: " + getMatricula() + " | Média: " + getMedia() + " | Situação: " + getSituacao());
    }
}