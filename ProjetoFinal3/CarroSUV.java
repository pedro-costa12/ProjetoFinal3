import java.math.BigDecimal;

public class CarroSUV extends Veiculo {
    CarroSUV() {
        this.setTipoCarro(TipoCarro.SUV);
        this.setPrecoDiariaAluguel(new BigDecimal(200));

    }
}
