
package atividadepoo;
public class AtividadePOO {

    public static void main(String[] args) {
        carro c1= new carro(4, 250, 150, "carro novo", 2021, 7821, 2225);
        System.out.println(  c1.acelerar() );
        System.out.println(  c1.frear() );
        caminhao caminhao1= new caminhao (2, 250, 80, "cor preta", 2002, 4690, 25000);
        System.out.println(  caminhao1.acelerar() );
        System.out.println(  caminhao1.frear() );
        
        onibus onibus1= new onibus((float) 250.5, 250, 150, "azul", 2011, 46759, 30000);
         System.out.println(  onibus1.acelerar() );
        System.out.println(  onibus1.frear() );
    }
    
    
    
}

