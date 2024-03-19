package qualitas.dao;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import qualitas.form.QltsTarifasMarcas;



@Repository
public interface MarcasTarifasDao  extends JpaRepository<QltsTarifasMarcas,Long>{
	
	@Query(value = "select distinct cmarcalarga as cmarcalarga from qltstarifasmarcas where  cmarcalarga not in ('NO REGULARIZADO')", nativeQuery = true)
	public List<String>getMarcasLargas();
	
//	@Query(value = "SELECT * FROM qltsTarifasMarcas WHERE  CMARCALARGA = :cmarcalarga  ORDER BY CMODELO DESC", nativeQuery = true)
//	public List<QltsTarifasMarcas> getDataCar(@Param("cmarcalarga")String cmarcalarga);
	
	@Query(value = "SELECT DISTINCT CMODELO FROM qltsTarifasMarcas WHERE CMARCALARGA = :cmarcalarga ORDER BY CMODELO DESC", nativeQuery = true)
	public List<Integer> findModelsByLongBrand(@Param("cmarcalarga") String cmarcalarga);

	@Query(value = "SELECT DISTINCT CTIPO  FROM QltsTarifasMarcas WHERE  CMARCALARGA = :cmarcalarga AND CMODELO = :cmodelo ORDER BY CTIPO DESC", nativeQuery = true)
	public List<String> getSubMarcaCtipo(@Param("cmarcalarga")String cmarcalarga , @Param("cmodelo") int cmodelo);
	
	@Query(value = "SELECT CVERSION FROM qltsTarifasMarcas WHERE  CMARCALARGA = :cmarcalarga AND CMODELO = :cmodelo AND CTIPO = :ctipo ", nativeQuery = true)
	public List<String> getVersion(@Param("cmarcalarga")String cmarcalarga , @Param("cmodelo") int cmodelo ,@Param("ctipo")String ctipo  );
	
	  @Query("SELECT DISTINCT m.cMarcaLarga FROM QltsTarifasMarcas m where cmarcalarga not in ('NO REGULARIZADO')")
	  List<String> findDistinctCMarcaLarga();

}
