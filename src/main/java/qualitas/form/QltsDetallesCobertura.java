package qualitas.form;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "qltsdetallecobertura")
public class QltsDetallesCobertura implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer ccdetallecoberturaid;
	
	@Column(name = "ccabreviatura")
	private String cAbreviatura;
	
	@Column(name = "ccdescripcion")
	private String cDescripcion;
	
	@Column(name = "ccsumaasegurada")
	private Integer cSumaasegurada;
	
	@Column(name = "ccdeducible")
	private Integer cDeducible;
	
	@Column(name = "ccategoria")
	private Integer cCategoria;
	
	@Column(name = "cctipopaquete")
	private Integer cTipopaquete;
	

	public QltsDetallesCobertura() {
		super();
		// TODO Auto-generated constructor stub
	}

	public QltsDetallesCobertura(Integer ccdetallecoberturaid, String cAbreviatura, String cDescripcion,
			Integer cSumaasegurada, Integer cDeducible, Integer cCategoria, Integer cTipopaquete) {
		super();
		this.ccdetallecoberturaid = ccdetallecoberturaid;
		this.cAbreviatura = cAbreviatura;
		this.cDescripcion = cDescripcion;
		this.cSumaasegurada = cSumaasegurada;
		this.cDeducible = cDeducible;
		this.cCategoria = cCategoria;
		this.cTipopaquete = cTipopaquete;
	}

	public Integer getCcdetallecoberturaid() {
		return ccdetallecoberturaid;
	}

	public void setCcdetallecoberturaid(Integer ccdetallecoberturaid) {
		this.ccdetallecoberturaid = ccdetallecoberturaid;
	}

	public String getcAbreviatura() {
		return cAbreviatura;
	}

	public void setcAbreviatura(String cAbreviatura) {
		this.cAbreviatura = cAbreviatura;
	}

	public String getcDescripcion() {
		return cDescripcion;
	}

	public void setcDescripcion(String cDescripcion) {
		this.cDescripcion = cDescripcion;
	}

	public Integer getcSumaasegurada() {
		return cSumaasegurada;
	}

	public void setcSumaasegurada(Integer cSumaasegurada) {
		this.cSumaasegurada = cSumaasegurada;
	}

	public Integer getcDeducible() {
		return cDeducible;
	}

	public void setcDeducible(Integer cDeducible) {
		this.cDeducible = cDeducible;
	}

	public Integer getcCategoria() {
		return cCategoria;
	}

	public void setcCategoria(Integer cCategoria) {
		this.cCategoria = cCategoria;
	}

	public Integer getcTipopaquete() {
		return cTipopaquete;
	}

	public void setcTipopaquete(Integer cTipopaquete) {
		this.cTipopaquete = cTipopaquete;
	}

	@Override
	public String toString() {
		return "QltsDetalleCobertura [ccdetallecoberturaid=" + ccdetallecoberturaid + ", cAbreviatura=" + cAbreviatura
				+ ", cDescripcion=" + cDescripcion + ", cSumaasegurada=" + cSumaasegurada + ", cDeducible=" + cDeducible
				+ ", cCategoria=" + cCategoria + ", cTipopaquete=" + cTipopaquete + "]";
	}
	
	
	
	
}
