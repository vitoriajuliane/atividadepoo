package atividadepoo;
public class caminhao extends automovel implements veiculos {
    private int comprimento;
    private int  cargaSuportada;
////////////////////////// construtor
    public caminhao(int comprimento, int cargaSuportada, int velocidade, String descricao, int ano, int placa, int valor) {
        super(velocidade, descricao, ano, placa, valor);
        this.comprimento = comprimento;
        this.cargaSuportada = cargaSuportada;
        
        
    }
/////////////////////////// gets e sets /////////////////////
    public int getComprimento() {
        return comprimento;
    }

    public void setComprimento(int comprimento) {
        this.comprimento = comprimento;
    }

    public int getCargaSuportada() {
        return cargaSuportada;
    }

    public void setCargaSuportada(int cargaSuportada) {
        this.cargaSuportada = cargaSuportada;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    
 //////////////////////////// metodos ////////////////////////////

    @Override
    public String acelerar() {
      
        this.velocidade = this.velocidade + 8;
        return "O VEÍCULO ACELEROU! velocidade atual: " +this.velocidade+ "km/h.";
    }

    @Override
    public String frear() {
        
        if (this.velocidade == 0){
            return "ATENÇÃO O CARRO ESTÁ PARADO!!!";
        }
        else if ((this.velocidade - 8) < 0){
            this.velocidade =0;
            return "--> FREOU: o carro está parado";
            
        } 
        
        this.velocidade = this.velocidade - 8;
        return "O VEÍCULO FREOU!!  velocidade atual: " + this.velocidade+ "km/h.";
    }
    
}
