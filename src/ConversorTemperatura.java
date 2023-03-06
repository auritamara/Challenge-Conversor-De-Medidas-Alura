public class ConversorTemperatura extends Temperatura {

    public ConversorTemperatura(double grau){
        this.grau = grau;
    }

    @Override
    public double converterCelsiusemF(double temperatura) {
        if (temperatura == Fahrenheit){
            return (this.grau * temperatura) + 32 ; 
        } else {
            return (this.grau - 32) / 1.8 ;
        }
       
    } 

    @Override
    public double converterCelsiusemK(double temperatura) {
        if (temperatura == Kelvin){
            return this.grau + temperatura;
        }else{
            return this.grau - Kelvin;
        }
    }

    
    @Override
    public double converterKelvinemF(double temperatura) {
        if (temperatura == Fahrenheit){
            return ((this.grau + 459.67) * 5/9);
        }else{
            return ((this.grau - 273) * Fahrenheit) + 32;
        }
        
         
    }



   

   
    
}
