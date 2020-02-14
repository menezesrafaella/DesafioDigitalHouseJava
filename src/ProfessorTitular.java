public class ProfessorTitular extends Professor{
    public String especialidade;

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public ProfessorTitular(String nome, String sobrenome, int tempoCasa, int codProfessor, String especialidade) {
        super(nome, sobrenome, tempoCasa, codProfessor);
        this.especialidade = especialidade;
    }
}
