import java.math.BigDecimal;

public abstract class Veiculo {

    private TipoCarro tipoCarro;
    private BigDecimal precoDiariaAluguel;

    public enum TipoCarro {
        pequeno,
        médio,
        SUV
    };

    public TipoCarro getTipoCarro() {
        return tipoCarro;
    }

    public void setTipoCarro(TipoCarro tipoCarro) {
        this.tipoCarro = tipoCarro;
    }

    public BigDecimal getPrecoDiariaAluguel() {
        return precoDiariaAluguel;
    }

    public void setPrecoDiariaAluguel(BigDecimal precoDiariaAluguel) {
        this.precoDiariaAluguel = precoDiariaAluguel;
    }

}
