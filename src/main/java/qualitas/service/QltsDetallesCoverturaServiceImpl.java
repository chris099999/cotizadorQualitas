package qualitas.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import qualitas.dao.QltsDetalleCoberturaDao;
import qualitas.form.QltsDetallesCobertura;

@Service
public class QltsDetallesCoverturaServiceImpl implements QltsDetallesCoberturaService {
	
	@Autowired
	QltsDetalleCoberturaDao qltsDetallesCobertura;

	public List<QltsDetallesCobertura> getDetailCoverage( Integer cCategoria, String cTipo ) {
		List<QltsDetallesCobertura> detallesCoberturas = new ArrayList<>();
		boolean respuesta = false;
		if(cCategoria== 100 || cCategoria==103 ||  cCategoria==104 || cCategoria==105 || cCategoria==132) {
			cCategoria=100;
			respuesta= true;
		}else if(cCategoria== 200 || cCategoria==210) {
			cCategoria=200;
			respuesta= true;
		}else if(cCategoria== 400 || cCategoria==405) {
			cCategoria=400;
			respuesta= true;

		}else if(cCategoria== 111){
			cCategoria =111;
			respuesta= true;
		}else {
			respuesta= false;
		}
		
		if(respuesta) {
			detallesCoberturas = qltsDetallesCobertura.getDetailCoverage(cCategoria ,cTipo );
		}
		
		return detallesCoberturas ;
	}
	

}
