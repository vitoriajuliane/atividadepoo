package atividadepoo;
public class carro extends automovel implements veiculos{
    private int quantidadeDePortas;
    private int potência;
   

    public carro(int quantidadeDePortas, int potência, int velocidade, String descricao, int ano, int placa, int valor) {
        super(velocidade, descricao, ano, placa, valor);
        this.quantidadeDePortas = quantidadeDePortas;
        this.potência = potência;
    }

    public int getQuantidadeDePortas() {
        return quantidadeDePortas;
    }

    public void setQuantidadeDePortas(int quantidadeDePortas) {
        this.quantidadeDePortas = quantidadeDePortas;
    }

    public int getPotência() {
        return potência;
    }

    public void setPotência(int potência) {
        this.potência = potência;
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


    
    
    
    @Override
    public String acelerar() {
        
        this.velocidade = this.velocidade +10;
        return "O VEÍCULO ACELEROU! velocidade atual: " +this.velocidade+ "km/h.";
    }
    
    

    @Override
    public String frear() {
        
        if (this.velocidade == 0){
            return "ATENÇÃO O CARRO ESTÁ PARADO!!!";
        }
        else if ((this.velocidade - 10)< 0){
            this.velocidade =0;
            return "--> FREOU: o carro está parado";
            
        } 
        
        this.velocidade = this.velocidade - 10;
        return "O VEÍCULO FREOU!!  velocidade atual: " + this.velocidade+ "km/h.";
    }

    
}


