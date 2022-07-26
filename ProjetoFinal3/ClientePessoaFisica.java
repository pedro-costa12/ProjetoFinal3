import java.math.BigDecimal;

public class ClientePessoaFisica extends Cliente {

    ClientePessoaFisica(String nome){
        this.setTipoPesoa(TipoPessoa.PessoaFisica);
        this.setPercentualDesconto(new BigDecimal(0.05));
        this.setNome(nome);
        this.setDiasAplicarDesconto(6);
        
    }
    
}
