package br.indie.fiscal4j.nfe.classes.nota;

import br.indie.fiscal4j.common.DFBase;
import br.indie.fiscal4j.nfe.validadores.BigDecimalParser;
import org.simpleframework.xml.Element;

import java.math.BigDecimal;

public class NFImpostoDevolvido extends DFBase {

    @Element(name = "pDevol", required = true)
    private String percentualDevolucao;

    @Element(name = "IPI", required = true)
    private NFInformacaoImpostoDevolvido informacaoIPIDevolvido;

    public String getPercentualDevolucao() {
        return this.percentualDevolucao;
    }

    public void setPercentualDevolucao(final BigDecimal percentualDevolucao) {
        this.percentualDevolucao = BigDecimalParser.tamanho5Com2CasasDecimais(percentualDevolucao, "Percentual Devolucao");
    }

    public NFInformacaoImpostoDevolvido getInformacaoIPIDevolvido() {
        return this.informacaoIPIDevolvido;
    }

    public void setInformacaoIPIDevolvido(final NFInformacaoImpostoDevolvido informacaoIPIDevolvido) {
        this.informacaoIPIDevolvido = informacaoIPIDevolvido;
    }
}