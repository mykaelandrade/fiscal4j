package br.indie.fiscal4j.classes.nota;

import br.indie.fiscal4j.classes.NFBase;
import br.indie.fiscal4j.classes.NFUnidadeFederativa;
import br.indie.fiscal4j.validadores.IntegerValidador;
import br.indie.fiscal4j.validadores.StringValidador;
import org.simpleframework.xml.Element;

public class NFInfoProdutorRuralReferenciada extends NFBase {
    @Element(name = "cUF", required = true)
    private NFUnidadeFederativa ufEmitente;

    @Element(name = "AAMM", required = true)
    private String anoMesEmissao;

    @Element(name = "CNPJ", required = false)
    private String cnpjEmitente;

    @Element(name = "CPF", required = false)
    private String cpfEmitente;

    @Element(name = "IE", required = true)
    private String ieEmitente;

    @Element(name = "mod", required = true)
    private String modeloDocumentoFiscal;

    @Element(name = "serie", required = true)
    private Integer serieDocumentoFiscal;

    @Element(name = "nNF", required = true)
    private Integer numeroDocumentoFiscal;

    public void setUfEmitente(final NFUnidadeFederativa ufEmitente) {
        this.ufEmitente = ufEmitente;
    }

    public void setAnoMesEmissao(final String anoMesEmissao) {
        StringValidador.aamm(anoMesEmissao);
        this.anoMesEmissao = anoMesEmissao;
    }

    public void setCnpjEmitente(final String cnpjEmitente) {
        if (this.cpfEmitente != null) {
            throw new IllegalStateException("Nao pode setar CNPJ pois CPF ja esta setado");
        }
        StringValidador.cnpj(cnpjEmitente);
        this.cnpjEmitente = cnpjEmitente;
    }

    public void setCpfEmitente(final String cpfEmitente) {
        if (this.cnpjEmitente != null) {
            throw new IllegalStateException("Nao pode setar CPF pois CNPJ ja esta setado");
        }
        StringValidador.cpf(cpfEmitente);
        this.cpfEmitente = cpfEmitente;
    }

    public void setIeEmitente(final String ieEmitente) {
        StringValidador.inscricaoEstadual(ieEmitente);
        this.ieEmitente = ieEmitente;
    }

    public void setModeloDocumentoFiscal(final String modeloDocumentoFiscal) {
        StringValidador.exatamente2(modeloDocumentoFiscal, "Modelo Documento Fiscal");
        this.modeloDocumentoFiscal = modeloDocumentoFiscal;
    }

    public void setSerieDocumentoFiscal(final Integer serieDocumentoFiscal) {
        IntegerValidador.tamanho3(serieDocumentoFiscal, "Serie Documento Fiscal");
        this.serieDocumentoFiscal = serieDocumentoFiscal;
    }

    public void setNumeroDocumentoFiscal(final Integer numeroDocumentoFiscal) {
        IntegerValidador.tamanho6(numeroDocumentoFiscal, "Numero Documento Fiscal");
        this.numeroDocumentoFiscal = numeroDocumentoFiscal;
    }

    public NFUnidadeFederativa getUfEmitente() {
        return this.ufEmitente;
    }

    public String getAnoMesEmissao() {
        return this.anoMesEmissao;
    }

    public String getCnpjEmitente() {
        return this.cnpjEmitente;
    }

    public String getCpfEmitente() {
        return this.cpfEmitente;
    }

    public String getIeEmitente() {
        return this.ieEmitente;
    }

    public String getModeloDocumentoFiscal() {
        return this.modeloDocumentoFiscal;
    }

    public Integer getSerieDocumentoFiscal() {
        return this.serieDocumentoFiscal;
    }

    public Integer getNumeroDocumentoFiscal() {
        return this.numeroDocumentoFiscal;
    }
}