import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

    public class Curso {
        private String nome;
        private int codCurso;
        private ProfessoraAdjunto professoraAdjunto;
        private ProfessorTitular professorTitular;
        private Professor professor;
        private int qntMaxAlunos;
        private int alunosMatriculados;
        List<Aluno> listaAlunos = new ArrayList<>();

        public Curso(String nome, int codCurso, int qntMaxAlunos) {
            this.nome = nome;
            this.codCurso = codCurso;
            this.qntMaxAlunos = qntMaxAlunos;
    }

    public Curso(String nome, int codCurso, ProfessoraAdjunto professoraAdjunto, ProfessorTitular professorTitular, Professor professor, int qntMaxAlunos, int alunosMatriculados) {
        this.nome = nome;
        this.codCurso = codCurso;
        this.professoraAdjunto = professoraAdjunto;
        this.professorTitular = professorTitular;
        this.professor = professor;
        this.qntMaxAlunos = qntMaxAlunos;
        this.alunosMatriculados = alunosMatriculados;

    }
        public boolean adicionarUmAluno(Aluno umAluno){
            if (this.qntMaxAlunos < this.alunosMatriculados){
                listaAlunos.add(umAluno);
                System.out.println("Vagas disponiveis");
                return true;
            }
            else{
                System.out.println("Não há vagas disponiveis");
                return false;
            }
        }

        public void excluirAluno(Aluno umAluno){
            listaAlunos.remove(umAluno);
        }


        public int getQntMaxAlunos() {
            return qntMaxAlunos;
        }

        public void setQntMaxAlunos(int qntMaxAlunos) {
            this.qntMaxAlunos = qntMaxAlunos;
        }

        public int getAlunosMatriculados() {
            return alunosMatriculados;
        }

        public void setAlunosMatriculados(int alunosMatriculados) {
            this.alunosMatriculados = alunosMatriculados;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public int getCodCurso() {
            return codCurso;
        }

        public void setCodCurso(int codCurso) {
            this.codCurso = codCurso;
        }

        public ProfessoraAdjunto getProfessoraAdjunto() {
            return professoraAdjunto;
        }

        public void setProfessoraAdjunto(ProfessoraAdjunto professoraAdjunto) {
            this.professoraAdjunto = professoraAdjunto;
        }

        public ProfessorTitular getProfessorTitular() {
            return professorTitular;
        }

        public void setProfessorTitular(ProfessorTitular professorTitular) {
            this.professorTitular = professorTitular;
        }

        public Professor getProfessor() {
            return professor;
        }

        public void setProfessor(Professor professor) {
            this.professor = professor;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Curso curso = (Curso) o;
            return codCurso == curso.codCurso;
        }




    }
