import java.util.Objects;

public class Professor {
    private String nome;
    private String sobrenome;
    private int tempoCasa;
    private int codProfessor;

    public Professor(String nome, String sobrenome, int tempoCasa, int codProfessor) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.tempoCasa = tempoCasa;
        this.codProfessor = codProfessor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getTempoCasa() {
        return tempoCasa;
    }

    public void setTempoCasa(int tempoCasa) {
        this.tempoCasa = tempoCasa;
    }

    public int getCodProfessor() {
        return codProfessor;
    }

    public void setCodProfessor(int codProfessor) {
        this.codProfessor = codProfessor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Professor professor = (Professor) o;
        return codProfessor == professor.codProfessor;
    }

}
