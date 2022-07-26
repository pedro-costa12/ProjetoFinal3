import java.math.BigDecimal;

public class CarroMédio extends Veiculo {
    CarroMédio() {
        this.setTipoCarro(TipoCarro.médio);
        this.setPrecoDiariaAluguel(new BigDecimal(150));

    }
}
