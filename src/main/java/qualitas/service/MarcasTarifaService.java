package qualitas.service;

import java.util.List;

import qualitas.form.QltsTarifasMarcas;

public interface MarcasTarifaService {
	
	public List<QltsTarifasMarcas> insertarMarcasTarifas(List<QltsTarifasMarcas> qltsTarifasMarcas);
	
//	public List<QltsTarifasMarcas> getMarcasLargas(); 

/// public List<QltsTarifasMarcas> getDataCar(String cmarcalarga);
	public List<Integer> getModel (String cmarcalarga);
	
	public List<String> getSubMarcaCtipo(String cmarcalarga , int cmodelo); 
	
	public List<String> getVersion(String cmarcalarga , int cmodelo ,String ctipo);
	public List<String> getMarcasLargas();


}
