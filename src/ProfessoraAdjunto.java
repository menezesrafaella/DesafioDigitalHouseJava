public class ProfessoraAdjunto extends Professor{
    private int qntHorasMonitoria;

    public int getQntHorasMonitoria() {
        return qntHorasMonitoria;
    }

    public void setQntHorasMonitoria(int qntHorasMonitoria) {
        this.qntHorasMonitoria = qntHorasMonitoria;
    }

    public ProfessoraAdjunto(String nome, String sobrenome, int tempoCasa, int codProfessor, int qntHorasMonitoria) {
        super(nome, sobrenome, tempoCasa, codProfessor);
        this.qntHorasMonitoria = qntHorasMonitoria;
    }

}
