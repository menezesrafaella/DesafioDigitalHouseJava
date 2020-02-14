import java.util.Date;

public class Matricula {
    private Aluno aluno;
    private Curso curso;
    private Date dtaMatricula;


    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Date getDtaMatricula() {
        return dtaMatricula;
    }

    public void setDtaMatricula(Date dtaMatricula) {
        this.dtaMatricula = dtaMatricula;
    }


    public Matricula(Aluno aluno, Curso curso, Date dtaMatricula) {
        this.aluno = aluno;
        this.curso = curso;
        this.dtaMatricula = new Date();
    }
}

