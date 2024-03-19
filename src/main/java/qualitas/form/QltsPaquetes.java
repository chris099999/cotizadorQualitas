package qualitas.form;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "qltspaquetes")
public class QltsPaquetes implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer ccidpaquete;
	
	@Column(name = "ccdescripcionpaquete")
	private String cDescripcionPaquete; 
	
	@Column(name = "cccategoria")
	private Integer cCategoria;
	
	@Column(name = "cctipo")
	private String cTipo;
	
	@Column(name = "ccprecio")
	private Integer cPrecio; 
	
	@Column(name = "ccdescuento")
	private Integer cDescuento ;
	

	public QltsPaquetes() {
		super();
		// TODO Auto-generated constructor stub
	}


	public QltsPaquetes(Integer ccidpaquete, String cDescripcionPaquete, Integer cCategoria, String cTipo,
			Integer cPrecio, Integer cDescuento) {
		super();
		this.ccidpaquete = ccidpaquete;
		this.cDescripcionPaquete = cDescripcionPaquete;
		this.cCategoria = cCategoria;
		this.cTipo = cTipo;
		this.cPrecio = cPrecio;
		this.cDescuento = cDescuento;
	}


	public Integer getCcidpaquete() {
		return ccidpaquete;
	}


	public void setCcidpaquete(Integer ccidpaquete) {
		this.ccidpaquete = ccidpaquete;
	}


	public String getcDescripcionPaquete() {
		return cDescripcionPaquete;
	}


	public void setcDescripcionPaquete(String cDescripcionPaquete) {
		this.cDescripcionPaquete = cDescripcionPaquete;
	}


	public Integer getcCategoria() {
		return cCategoria;
	}


	public void setcCategoria(Integer cCategoria) {
		this.cCategoria = cCategoria;
	}


	public String getcTipo() {
		return cTipo;
	}


	public void setcTipo(String cTipo) {
		this.cTipo = cTipo;
	}


	public Integer getcPrecio() {
		return cPrecio;
	}


	public void setcPrecio(Integer cPrecio) {
		this.cPrecio = cPrecio;
	}


	public Integer getcDescuento() {
		return cDescuento;
	}


	public void setcDescuento(Integer cDescuento) {
		this.cDescuento = cDescuento;
	}


	@Override
	public String toString() {
		return "QltsPaquetes [ccidpaquete=" + ccidpaquete + ", cDescripcionPaquete=" + cDescripcionPaquete
				+ ", cCategoria=" + cCategoria + ", cTipo=" + cTipo + ", cPrecio=" + cPrecio + ", cDescuento="
				+ cDescuento + "]";
	}


	

}
