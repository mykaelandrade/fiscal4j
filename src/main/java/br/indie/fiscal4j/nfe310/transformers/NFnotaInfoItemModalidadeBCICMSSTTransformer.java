package br.indie.fiscal4j.nfe310.transformers;

import br.indie.fiscal4j.nfe310.classes.NFNotaInfoItemModalidadeBCICMSST;
import org.simpleframework.xml.transform.Transform;

public class NFnotaInfoItemModalidadeBCICMSSTTransformer implements Transform<NFNotaInfoItemModalidadeBCICMSST> {

    @Override
    public NFNotaInfoItemModalidadeBCICMSST read(final String codigo) {
        return NFNotaInfoItemModalidadeBCICMSST.valueOfCodigo(codigo);
    }

    @Override
    public String write(final NFNotaInfoItemModalidadeBCICMSST modalidadeBCICMSST) {
        return modalidadeBCICMSST.getCodigo();
    }
}