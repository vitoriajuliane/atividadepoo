package atividadepoo;

public abstract class automovel {
    public int velocidade;
    private String descricao;
    private int ano;
    private int placa;
    public int valor;

    public automovel(int velocidade, String descricao, int ano, int placa, int valor) {
        this.velocidade = velocidade;
        this.descricao = descricao;
        this.ano = ano;
        this.placa = placa;
        this.valor = valor;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getPlaca() {
        return placa;
    }

    public void setPlaca(int placa) {
        this.placa = placa;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "automovel{" + "velocidade=" + velocidade + ", descricao=" + descricao + ", ano=" + ano + ", placa=" + placa + ", valor=" + valor + '}';
    }
    
    
    
}
