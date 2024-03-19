package qualitas.dao;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import qualitas.form.QltsDetallesCobertura;
@Repository
public interface QltsDetalleCoberturaDao extends JpaRepository<QltsDetallesCobertura,Long>{
	
	@Query(value = "SELECT CCDETALLECOBERTURAID, CCABREVIATURA, CCDESCRIPCION, CCSUMAASEGURADA, CCDEDUCIBLE, CCATEGORIA, CCTIPOPAQUETE FROM qltsdetallecobertura INNER JOIN  qltspaquetes on qltspaquetes.CCIDPAQUETE = qltsdetallecobertura.CCTIPOPAQUETE where qltspaquetes.CCCATEGORIA = :ccategoria AND qltspaquetes.CCTIPO = :ctipo", nativeQuery = true)
	public List<QltsDetallesCobertura> getDetailCoverage(@Param("ccategoria") Integer ccategoria , @Param("ctipo") String ctipo );

}
