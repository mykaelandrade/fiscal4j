package br.indie.fiscal4j.nfe310.classes.nota;

import br.indie.fiscal4j.DFBase;
import br.indie.fiscal4j.DFUnidadeFederativa;
import br.indie.fiscal4j.validadores.IntegerValidador;
import br.indie.fiscal4j.validadores.StringValidador;
import org.simpleframework.xml.Element;

public class NFInfoModelo1Por1AReferenciada extends DFBase {
    private static final long serialVersionUID = 4441065943167631316L;

    @Element(name = "cUF", required = true)
    private DFUnidadeFederativa uf;

    @Element(name = "AAMM", required = true)
    private String anoMesEmissaoNFe;

    @Element(name = "CNPJ", required = true)
    private String cnpj;

    @Element(name = "mod", required = true)
    private String modeloDocumentoFiscal;

    @Element(name = "serie", required = true)
    private Integer serie;

    @Element(name = "nNF", required = false)
    private String numeroDocumentoFiscal;

    public DFUnidadeFederativa getUf() {
        return this.uf;
    }

    public void setUf(final DFUnidadeFederativa uf) {
        this.uf = uf;
    }

    public String getAnoMesEmissaoNFe() {
        return this.anoMesEmissaoNFe;
    }

    public void setAnoMesEmissaoNFe(final String anoMesEmissaoNFe) {
        StringValidador.aamm(anoMesEmissaoNFe);
        this.anoMesEmissaoNFe = anoMesEmissaoNFe;
    }

    public String getCnpj() {
        return this.cnpj;
    }

    public void setCnpj(final String cnpj) {
        StringValidador.cnpj(cnpj);
        this.cnpj = cnpj;
    }

    public String getModeloDocumentoFiscal() {
        return this.modeloDocumentoFiscal;
    }

    public void setModeloDocumentoFiscal(final String modeloDocumentoFiscal) {
        StringValidador.exatamente2(modeloDocumentoFiscal, "Modelo Documento Fiscal");
        this.modeloDocumentoFiscal = modeloDocumentoFiscal;
    }

    public Integer getSerie() {
        return this.serie;
    }

    public void setSerie(final Integer serie) {
        IntegerValidador.tamanho3(serie, "Serie");
        this.serie = serie;
    }

    public String getNumeroDocumentoFiscal() {
        return this.numeroDocumentoFiscal;
    }

    public void setNumeroDocumentoFiscal(final String numeroDocumentoFiscal) {
        StringValidador.tamanho9(numeroDocumentoFiscal, "Numero Documento Fiscal");
        this.numeroDocumentoFiscal = numeroDocumentoFiscal;
    }
}