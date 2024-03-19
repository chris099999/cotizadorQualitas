package qualitas.service;

import java.util.List;

import qualitas.form.QltsDetallesCobertura;

public interface QltsDetallesCoberturaService {
	
	public List<QltsDetallesCobertura> getDetailCoverage( Integer cCategoria , String cTipo);

}
