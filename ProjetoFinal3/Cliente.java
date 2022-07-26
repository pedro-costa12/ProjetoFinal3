import java.math.BigDecimal;

public abstract class Cliente {
    private TipoPessoa tipoPesoa;
    private BigDecimal percentualDesconto;
    private String nome;
    private int diasAplicarDesconto;

    public enum TipoPessoa {
        PessoaFisica,
        PessoaJurídica
    };

    public int getDiasAplicarDesconto() {
        return diasAplicarDesconto;
    }

    public void setDiasAplicarDesconto(int diasAplicarDesconto) {
        this.diasAplicarDesconto = diasAplicarDesconto;
    }

    public BigDecimal getPercentualDesconto() {
        return percentualDesconto;
    }

    public void setPercentualDesconto(BigDecimal percentualDesconto) {
        this.percentualDesconto = percentualDesconto;
    }

    public TipoPessoa getTipoPesoa() {
        return tipoPesoa;
    }

    public void setTipoPesoa(TipoPessoa tipoPesoa) {
        this.tipoPesoa = tipoPesoa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
