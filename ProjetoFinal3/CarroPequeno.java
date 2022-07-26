import java.math.BigDecimal;

public class CarroPequeno extends Veiculo {

    CarroPequeno() {
        this.setTipoCarro(TipoCarro.pequeno);
        this.setPrecoDiariaAluguel(new BigDecimal(100));

    }

}
