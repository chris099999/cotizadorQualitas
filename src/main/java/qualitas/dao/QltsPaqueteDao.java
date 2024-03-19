package qualitas.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import qualitas.form.QltsPaquetes;

@Repository
public interface QltsPaqueteDao extends JpaRepository<QltsPaquetes,Long>{
	
	@Query(value = "SELECT CCIDPAQUETE, CCDESCRIPCIONPAQUETE, CCCATEGORIA, CCTIPO, CCPRECIO, CCDESCUENTO FROM  qltspaquetes WHERE CCCATEGORIA = :ccategoria ", nativeQuery = true)
	public List<QltsPaquetes> getPackages(@Param("ccategoria") Integer ccategoria );
}
