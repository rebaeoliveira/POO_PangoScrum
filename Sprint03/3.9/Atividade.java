import java.util.*;

public class Atividade {
    private String nome;
    private String descricao;
    private int habilidadeAtividade;
    private List<String> niveisHabilidade;
    private List<Turma> turmas;
    private List<String> horariosDisponiveis;

    public Atividade(String nome, String descricao, int faixaEtaria) {
        this.nome = nome;
        this.descricao = descricao;
        this.habilidadeAtividade = faixaEtaria;
        this.niveisHabilidade = new ArrayList<>();
        this.turmas = new ArrayList<>();
        this.horariosDisponiveis = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public int gethabilidadeAtividade() {
        return habilidadeAtividade;
    }

    public void adicionarNivelHabilidade(String nivelHabilidade) {
        this.niveisHabilidade.add(nivelHabilidade);
    }

    public void adicionarTurma(Turma turma) {
        this.turmas.add(turma);
    }

    public void adicionarHorarioDisponivel(String horarioDisponivel) {
        this.horariosDisponiveis.add(horarioDisponivel);
    }

    public List<String> getNiveisHabilidade() {
        return niveisHabilidade;
    }

    public List<Turma> getTurmas() {
        return turmas;
    }

    public List<String> getHorariosDisponiveis() {
        return horariosDisponiveis;
    }
}

class Turma {
    private String atividade;
    private String instrutor;
    private List<String> horarios;
    private List<String> diasSemana;

    public Turma(String atividade, String instrutor) {
        this.atividade = atividade;
        this.instrutor = instrutor;
        this.horarios = new ArrayList<>();
        this.diasSemana = new ArrayList<>();
    }

    public String getAtividade() {
        return atividade;
    }

    public String getInstrutor() {
        return instrutor;
    }

    public void adicionarHorario(String horario) {
        this.horarios.add(horario);
    }

    public void adicionarDiaSemana(String diaSemana) {
        this.diasSemana.add(diaSemana);
    }

    public List<String> getHorarios() {
        return horarios;
    }

    public List<String> getDiasSemana() {
        return diasSemana;
    }
}