package giis.demo.coiipa.secretaría;

import lombok.*;
@Getter @Setter 
/**
 * Clase utilizada para enseñar por pantalla dentro del menu de la secretaría 
 * la información que queremos enseñar. La secretaria es la encargada de añadir al
 * curso la infomación restante
 * @author pablo
 *
 */
public class CursoDisplayDTO {
	
	private String c_id;
	private String titulo;
	private String fecha;
	private String precio;
	private String estado;
	private String plazas;
	private String ins_inicio;
	private String ins_final;
	
	public String getPlazas() {
		return plazas;
	}
	public void setPlazas(String plazas) {
		this.plazas = plazas;
	}
	public String getIns_inicio() {
		return ins_inicio;
	}
	public void setIns_inicio(String ins_inicio) {
		this.ins_inicio = ins_inicio;
	}
	public String getIns_final() {
		return ins_final;
	}
	public void setIns_final(String ins_final) {
		this.ins_final = ins_final;
	}
	public String getC_id() {
		return c_id;
	}
	public void setC_id(String c_id) {
		this.c_id = c_id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getPrecio() {
		return precio;
	}
	public void setPrecio(String precio) {
		this.precio = precio;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	@Override
	public String toString() {
		return "[C_ID=" + c_id + ", Titulo=" + titulo + ", precio=" + precio + ", fecha=" + fecha
				+ ", estado=" + estado + ", plazas=" + plazas + ", fechInicio=" + ins_inicio + ", fechFinal="
				+ ins_final + "]";
	}

}
	
	
	
	
	
	

