package qualitas.form;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "qltstarifasmarcas")
public class QltsTarifasMarcas implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer CIDTARIFASMARCAS;

	@Column(name = "cmarca")
	private String cMarca;

	@Column(name = "cmarcalarga")
	private String cMarcaLarga;

    @Transient
    private String cUsuario;

	@Column(name = "ctarifa")
	private String cTarifa;

	@Column(name = "ctipo")
	private String cTipo;

	@Column(name = "cversion")
	private String cVersion;
	
	@Column(name = "cmodelo")
	private int cModelo;
	
	@Column(name = "camis")
	private String cAmis;
	
	@Column(name = "ccategoria")
	private int cCategoria;
	
	@Column(name = "cnvaAMIS")
	private String cNvaAMIS;
	
	@Column(name = "ctransmision")
	private String cTransmision;
	
	@Column(name = "cocupantes")
	private int cOcupantes;
	
	@Column(name = "nv1")
	private String nV1;
	
	@Column(name = "nv2")
	private String nV2;

	public QltsTarifasMarcas() {
		super();
		// TODO Auto-generated constructor stub
	}

	public QltsTarifasMarcas(Integer cIDTARIFASMARCAS, String cMarca, String cMarcaLarga, String cUsuario,
			String cTarifa, String cTipo, String cVersion, int cModelo, String cAmis, int cCategoria,
			String cNvaAMIS, String cTransmision, int cOcupantes, String nV1, String nV2) {
		super();
		CIDTARIFASMARCAS = cIDTARIFASMARCAS;
		this.cMarca = cMarca;
		this.cMarcaLarga = cMarcaLarga;
		this.cUsuario = cUsuario;
		this.cTarifa = cTarifa;
		this.cTipo = cTipo;
		this.cVersion = cVersion;
		this.cModelo = cModelo;
		this.cAmis = cAmis;
		this.cCategoria = cCategoria;
		this.cNvaAMIS = cNvaAMIS;
		this.cTransmision = cTransmision;
		this.cOcupantes = cOcupantes;
		this.nV1 = nV1;
		this.nV2 = nV2;
	}

	public Integer getCIDTARIFASMARCAS() {
		return CIDTARIFASMARCAS;
	}

	public void setCIDTARIFASMARCAS(Integer cIDTARIFASMARCAS) {
		CIDTARIFASMARCAS = cIDTARIFASMARCAS;
	}

	public String getcMarca() {
		return cMarca;
	}

	public void setcMarca(String cMarca) {
		this.cMarca = cMarca;
	}

	public String getcMarcaLarga() {
		return cMarcaLarga;
	}

	public void setcMarcaLarga(String cMarcaLarga) {
		this.cMarcaLarga = cMarcaLarga;
	}

	public String getcUsuario() {
		return cUsuario;
	}

	public void setcUsuario(String cUsuario) {
		this.cUsuario = cUsuario;
	}

	public String getcTarifa() {
		return cTarifa;
	}

	public void setcTarifa(String cTarifa) {
		this.cTarifa = cTarifa;
	}

	public String getcTipo() {
		return cTipo;
	}

	public void setcTipo(String cTipo) {
		this.cTipo = cTipo;
	}

	public String getcVersion() {
		return cVersion;
	}

	public void setcVersion(String cVersion) {
		this.cVersion = cVersion;
	}

	public int getcModelo() {
		return cModelo;
	}

	public void setcModelo(int cModelo) {
		this.cModelo = cModelo;
	}

	public String getcAmis() {
		return cAmis;
	}

	public void setcAmis(String cAmis) {
		this.cAmis = cAmis;
	}

	public int getcCategoria() {
		return cCategoria;
	}

	public void setcCategoria(int cCategoria) {
		this.cCategoria = cCategoria;
	}

	public String getcNvaAMIS() {
		return cNvaAMIS;
	}

	public void setcNvaAMIS(String cNvaAMIS) {
		this.cNvaAMIS = cNvaAMIS;
	}

	public String getcTransmision() {
		return cTransmision;
	}

	public void setcTransmision(String cTransmision) {
		this.cTransmision = cTransmision;
	}

	public int getcOcupantes() {
		return cOcupantes;
	}

	public void setcOcupantes(int cOcupantes) {
		this.cOcupantes = cOcupantes;
	}

	public String getnV1() {
		return nV1;
	}

	public void setnV1(String nV1) {
		this.nV1 = nV1;
	}

	public String getnV2() {
		return nV2;
	}

	public void setnV2(String nV2) {
		this.nV2 = nV2;
	}

	@Override
	public String toString() {
		return "QltsTarifasMarcas [CIDTARIFASMARCAS=" + CIDTARIFASMARCAS + ", cMarca=" + cMarca + ", cMarcaLarga="
				+ cMarcaLarga + ", cUsuario=" + cUsuario + ", cTarifa=" + cTarifa + ", cTipo=" + cTipo + ", cVersion="
				+ cVersion + ", cModelo=" + cModelo + ", cAmis=" + cAmis + ", cCategoria=" + cCategoria + ", cNvaAMIS="
				+ cNvaAMIS + ", cTransmision=" + cTransmision + ", cOcupantes=" + cOcupantes + ", nV1=" + nV1 + ", nV2="
				+ nV2 + "]";
	}

	


}
