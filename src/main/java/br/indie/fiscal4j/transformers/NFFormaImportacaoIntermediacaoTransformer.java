package br.indie.fiscal4j.transformers;

import br.indie.fiscal4j.classes.nota.NFFormaImportacaoIntermediacao;
import org.simpleframework.xml.transform.Transform;

public class NFFormaImportacaoIntermediacaoTransformer implements Transform<NFFormaImportacaoIntermediacao> {

    @Override
    public NFFormaImportacaoIntermediacao read(final String codigo) throws Exception {
        return NFFormaImportacaoIntermediacao.valueOfCodigo(codigo);
    }

    @Override
    public String write(final NFFormaImportacaoIntermediacao intermediacao) throws Exception {
        return intermediacao.getCodigo();
    }
}