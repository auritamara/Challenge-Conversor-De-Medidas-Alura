

public class ConversorMoeda extends Moeda {


    public ConversorMoeda(double valor){

        this.valor = valor;
    }

    @Override
    public double converterReal(double moeda) {
       
        return this.valor / moeda;
    }

    @Override
    public double converterParaReal(double moeda) {

        return this.valor * moeda;
    }
    
}
