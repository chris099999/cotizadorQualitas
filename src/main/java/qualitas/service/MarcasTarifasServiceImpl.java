package qualitas.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import qualitas.dao.MarcasTarifasDao;
import qualitas.form.QltsTarifasMarcas;


@Service
public class MarcasTarifasServiceImpl implements MarcasTarifaService{
	
	@Autowired
	private MarcasTarifasDao marcasTarifasDao;
	
	public List<QltsTarifasMarcas> insertarMarcasTarifas(List<QltsTarifasMarcas> qltsTarifasMarcas) {
		List<QltsTarifasMarcas> respuestas = new ArrayList<>();
		
		marcasTarifasDao.saveAll(qltsTarifasMarcas);
//		for (QltsTarifasMarcas wsTarifasMarcas : qltsTarifasMarcas) {
//			respuestas.add(marcasTarifasDao.save(wsTarifasMarcas));
//		}
//		
		return respuestas;
	}

	@Override
	public List<String> getMarcasLargas() {
		List<String> marcaLarga =  marcasTarifasDao.findDistinctCMarcaLarga();
		
		return marcaLarga;
	}

	@Override
	@Transactional(readOnly = true)
	public List<Integer> getModel (String cmarcalarga) {
		List<Integer> listaAñoModelos = marcasTarifasDao.findModelsByLongBrand(cmarcalarga);	
		return listaAñoModelos;
	}

	@Override
	public List<String> getSubMarcaCtipo(String cmarcalarga, int cmodelo) {
		List<String> listaTipoSubMarca =  marcasTarifasDao.getSubMarcaCtipo(cmarcalarga, cmodelo);
		
		
		return listaTipoSubMarca;
	}

	@Override
	public List<String> getVersion(String cmarcalarga, int cmodelo, String ctipo) {
		List<String> listasVersion = marcasTarifasDao.getVersion(cmarcalarga, cmodelo, ctipo) ;
		
		
		return listasVersion;
	}
}
