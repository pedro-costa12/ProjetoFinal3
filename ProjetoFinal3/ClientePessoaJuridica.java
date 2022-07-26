import java.math.BigDecimal;

public class ClientePessoaJuridica extends Cliente {

    ClientePessoaJuridica(String nome) {
        this.setTipoPesoa(TipoPessoa.PessoaJurídica);
        this.setPercentualDesconto(new BigDecimal(0.10));
        this.setNome(nome);
        this.setDiasAplicarDesconto(3);

    }

}