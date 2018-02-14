package br.indie.fiscal4j.mdfe3.classes.nota.evento;

import br.indie.fiscal4j.DFAmbiente;
import br.indie.fiscal4j.DFBase;
import br.indie.fiscal4j.validadores.BigDecimalParser;
import br.indie.fiscal4j.validadores.IntegerValidador;
import br.indie.fiscal4j.validadores.StringValidador;
import org.joda.time.DateTime;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;

import java.math.BigDecimal;

public class MDFeInfoEvento extends DFBase {

    @Attribute(name = "Id", required = false)
    private String id;

    @Element(name = "cOrgao", required = false)
    private String orgao;

    @Element(name = "tpAmb")
    private DFAmbiente ambiente;

    @Element(name = "CNPJ", required = false)
    private String cnpj;

    @Element(name = "chMDFe")
    private String chave;

    @Element(name = "dhEvento")
    private DateTime dataHoraEvento;

    @Element(name = "tpEvento")
    private String codigoEvento;

    @Element(name = "nSeqEvento")
    private Integer numeroSequencialEvento;

    @Element(name = "verEvento", required = false)
    private String versaoEvento;

    /**
     * Detalhamento do evento específico
     * (cancelamento, encerramento, registro de passagem).
     */
    @Element(name = "detEvento")
    private MDFeDetalhamentoEvento detEvento;

    public void setVersaoEvento(final BigDecimal versaoEvento) {
        this.versaoEvento = BigDecimalParser.tamanho5Com2CasasDecimais(versaoEvento, "Versao do Evento");
    }

    public String getId() {
        return this.id;
    }

    public void setId(final String id) {
        StringValidador.exatamente54(id, "Info Evento  ID");
        this.id = id;
    }

    public DFAmbiente getAmbiente() {
        return this.ambiente;
    }

    public void setAmbiente(final DFAmbiente ambiente) {
        this.ambiente = ambiente;
    }

    public String getCnpj() {
        return this.cnpj;
    }

    public void setCnpj(final String cnpj) {
        StringValidador.cnpj(cnpj);
        this.cnpj = cnpj;
    }

    public String getChave() {
        return this.chave;
    }

    public void setChave(final String chave) {
        StringValidador.exatamente44N(chave, "Info Evento Cancelamento Chave");
        this.chave = chave;
    }

    public DateTime getDataHoraEvento() {
        return this.dataHoraEvento;
    }

    public void setDataHoraEvento(final DateTime dataHoraEvento) {
        this.dataHoraEvento = dataHoraEvento;
    }

    public String getCodigoEvento() {
        return this.codigoEvento;
    }

    public void setCodigoEvento(final String codigoEvento) {
        StringValidador.exatamente6N(codigoEvento, "Info Evento Cancelamento Codigo");
        this.codigoEvento = codigoEvento;
    }

    public int getNumeroSequencialEvento() {
        return this.numeroSequencialEvento;
    }

    public void setNumeroSequencialEvento(final int numeroSequencialEvento) {
        IntegerValidador.tamanho1a2(numeroSequencialEvento, "Numero Sequencial Evento");
        this.numeroSequencialEvento = numeroSequencialEvento;
    }

    public void setNumeroSequencialEvento(Integer numeroSequencialEvento) {
        this.numeroSequencialEvento = numeroSequencialEvento;
    }

    public String getVersaoEvento() {
        return this.versaoEvento;
    }

    public void setVersaoEvento(String versaoEvento) {
        this.versaoEvento = versaoEvento;
    }

    public String getOrgao() {
        return this.orgao;
    }

    public void setOrgao(final String orgao) {
        this.orgao = orgao;
    }

    public MDFeDetalhamentoEvento getDetEvento() {
        return detEvento;
    }

    public void setDetEvento(MDFeDetalhamentoEvento detEvento) {
        this.detEvento = detEvento;
    }
}