package qualitas.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import qualitas.dao.QltsPaqueteDao;
import qualitas.form.QltsDetallesCobertura;
import qualitas.form.QltsPaquetes;

@Service
public class QltsPaquetesServiceImpl implements QltsPaquetesService {
	
	@Autowired
	private QltsPaqueteDao paquetesDao;
	
	
	public List<QltsPaquetes> getPackages(Integer cCategoria ){
		
		List<QltsPaquetes> paquetes = new ArrayList<>();
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
			paquetes = paquetesDao.getPackages(cCategoria);
		}
		return paquetes;
	}

}
