import java.math.BigDecimal;
import java.math.RoundingMode;
import java.security.InvalidParameterException;

// Crie a classe Aluguel que deve receber um Veículo, um Cliente e uma
// quantidade de dias para esse aluguel, com essas informações, a classe
// deve calcular qual é o valor final do aluguel.

public class Aluguel {

    final Veiculo v;
    final Cliente c;
    final int dias;
    final BigDecimal valorAluguel;

    Aluguel(Veiculo v, Cliente c, int dias) {
        this.v = v;
        this.c = c;
        this.dias = dias;
        this.valorAluguel = calcularValorAluguel(v, c, dias);
    }

    private static BigDecimal calcularValorAluguel(Veiculo v, Cliente c, int dias) {
        BigDecimal valorAluguel = v.getPrecoDiariaAluguel().multiply(new BigDecimal(dias));

        if ((c.getTipoPesoa() == Cliente.TipoPessoa.PessoaFisica)) {
            if (dias > 5) {
                valorAluguel = valorAluguel.multiply(c.getPercentualDesconto());
            }
        } else if (c.getTipoPesoa() == Cliente.TipoPessoa.PessoaJurídica) {
            if (dias > 3) {
                valorAluguel = valorAluguel.multiply(c.getPercentualDesconto());
            }
        } else {
            throw new InvalidParameterException("Tipo de inválido");
        }

        return valorAluguel.setScale(2, RoundingMode.HALF_UP);

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        BigDecimal valorTotalAluguel = v.getPrecoDiariaAluguel().multiply(new BigDecimal(dias)).setScale(2,
        RoundingMode.HALF_UP);
        sb.append("O aluguel de " + this.dias + " dias,");
        sb.append(" do cliente: " + this.c.getNome() + ",");
        sb.append(" de um carro do tipo " + this.v.getTipoCarro().toString() + ".");
        sb.append(" Cuja diária tem valor: " + this.v.getPrecoDiariaAluguel() + ".");
        sb.append(" O valor total do contrato foi de: " + valorTotalAluguel + ".");

        BigDecimal valorDesconto = valorTotalAluguel.subtract(this.valorAluguel).setScale(2, RoundingMode.HALF_UP);

        if (valorDesconto == new BigDecimal(0.0001).setScale(2, RoundingMode.HALF_UP)) {
            return sb.toString();
        } else {
            sb.append(" O valor com desconto foi de : " + this.valorAluguel + ".");
            sb.append(" E total do contrato foi de: " + valorDesconto + " reais.");
            return sb.toString();
        }

    }

}
