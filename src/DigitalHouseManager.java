import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DigitalHouseManager {
    private Curso curso;
    private Aluno aluno;
    private Matricula matricula;
    private Professor professor;

    List<Curso> listaCursos = new ArrayList<>();
    List<Aluno> listaAlunos = new ArrayList<>();
    List<Matricula> listaMatricula = new ArrayList<>();
    List<Professor> listaProfessor = new ArrayList<>();

    public DigitalHouseManager(Curso curso, Aluno aluno, Matricula matricula, Professor professor, List<Curso> listaCursos, List<Aluno> listaAlunos, List<Matricula> listaMatricula, List<Professor> listaProfessor) {
        this.curso = curso;
        this.aluno = aluno;
        this.matricula = matricula;
        this.professor = professor;
        this.listaCursos = listaCursos;
        this.listaAlunos = listaAlunos;
        this.listaMatricula = listaMatricula;
        this.listaProfessor = listaProfessor;
    }


    public void registrarCurso(String nome, Integer codCurso, Integer qtdMaxAlunos) {
        Curso curso = new Curso(nome, codCurso, qtdMaxAlunos);
        listaCursos.add(curso);
        System.out.println("Curso registrado com sucesso!");
    }

    public void excluirCurso(Integer codCurso) {
        listaCursos.remove(codCurso);
        System.out.println("Curso removido com sucesso");
    }

    public void registrarProfessoraAdjunto(String nome, String sobrenome, Integer codProfessor, Integer qntHorasMonitoria) {
        ProfessoraAdjunto professorAdjunto = new ProfessoraAdjunto(nome, sobrenome, 0, codProfessor, qntHorasMonitoria);
        listaProfessor.add(professorAdjunto);
        System.out.println("Professor Adjunto adicionado com sucesso!");
    }

    public void registrarProfessorTitular(String nome, String sobrenome, Integer codProfessor, String especialidade) {
        ProfessorTitular professorTitular = new ProfessorTitular(nome, sobrenome, 0, codProfessor, especialidade);
        listaProfessor.add(professorTitular);
        System.out.println("Professor titular adicionado com sucesso!");
    }

    public void excluirProfessor(Integer codProfessor) {
        listaProfessor.remove(codProfessor);
    }

    public void matricularAluno(String nome, String sobrenome, Integer codAluno) {
        Aluno aluno = new Aluno(nome, sobrenome, codAluno);
        listaAlunos.add(aluno);
        System.out.println("Aluno foi matriculado com sucesso!");
    }

    public Aluno encontrarAluno(Integer codAluno) {
        for (Aluno aluno : listaAlunos) {
            if (aluno.getCodAluno() == codAluno) {
                return aluno;
            }
        }
        return null;

    }

    public int encontrarCurso(Integer codCurso) {
        for (int i =0; i < listaCursos.size(); i++) {
            if (listaCursos.get(i).getCodCurso() == codCurso) {
                return i;
            }
        }
        return -1;
    }


    public void matricularAlunoCurso(Integer codAluno, Integer codCurso) {
        Aluno aluno = encontrarAluno(codAluno);
        int posCurso = encontrarCurso(codCurso);

        if (posCurso < 0) {
            System.out.println("Não foi possivel encontrar o curso");
        } else {
            if (aluno != null) {
                this.listaCursos.get(posCurso).adicionarUmAluno(aluno);
                Matricula matricula = new Matricula(aluno,this.listaCursos.get(posCurso),new Date());
                listaMatricula.add(matricula);
                System.out.println("Matricula realizada");
            } else {
                System.out.println("Não foi possivel encontrar o aluno");
            }

        }

    }

}