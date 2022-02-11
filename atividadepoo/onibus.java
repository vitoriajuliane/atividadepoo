package atividadepoo;

public class onibus extends automovel implements veiculos  {
    public float comprimento;
    public int cpcDePassageiros;
/////////////////////////////////construtor/////////////////////////////////
    public onibus(float comprimento, int cpcDePassageiros, int velocidade, String descricao, int ano, int placa, int valor) {
        super(velocidade, descricao, ano, placa, valor);
        this.comprimento = comprimento;
        this.cpcDePassageiros = cpcDePassageiros;
    }
    
/////////////////////////////// gets e sets ///////////////////////////////////

    public float getComprimento() {
        return comprimento;
    }

    public void setComprimento(float comprimento) {
        this.comprimento = comprimento;
    }

    public int getCpcDePassageiros() {
        return cpcDePassageiros;
    }

    public void setCpcDePassageiros(int cpcDePassageiros) {
        this.cpcDePassageiros = cpcDePassageiros;
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

////////////////////////////////metodos////////////////////////////////

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
