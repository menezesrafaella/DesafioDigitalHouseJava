import java.util.Objects;

public class Aluno {
    private String nome;
    private String sobrenome;
    private int codAluno;

    public Aluno(String nome, String sobrenome, int codAluno) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.codAluno = codAluno;
    }

    public int getCodAluno() {
        return codAluno;
    }

    public void setCodAluno(int codAluno) {
        this.codAluno = codAluno;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return this.codAluno == aluno.codAluno;
    }

}
