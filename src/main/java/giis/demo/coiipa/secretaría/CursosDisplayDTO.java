package giis.demo.coiipa.secretaría;

import java.sql.Date;

public class CursosDisplayDTO {

//	private int C_ID;
//	private String Titulo ;
//	private float precio;
//	private Date fecha;
////	private enum estados {PLANIFICADO,ABIERTO,CERRADO} 
////	private estados estado;
//	private String estado;
//	private int plazas;
//	
//	private Date fechInicio;
//	private Date fechFinal;

	private String C_ID;
	private String Titulo ;
	private String precio;
	private String fecha;

	private String estado;
	private String plazas;
	
	private String fechInicio;
	private String fechFinal;
	
	public CursosDisplayDTO(String c_ID, String titulo, String precio, String fecha, String estado, String plazas,
			String fechInicio, String fechFinal) {
		
		C_ID = c_ID;
		Titulo = titulo;
		this.precio = precio;
		this.fecha = fecha;
		this.estado = estado;
		this.plazas = plazas;
		this.fechInicio = fechInicio;
		this.fechFinal = fechFinal;
	}
	public String getC_ID() {return C_ID;}
	public void setC_ID(String c_ID) {C_ID = c_ID;}
	
	public String getTitulo() {return Titulo;}
	public void setTitulo(String titulo) {Titulo = titulo;}
	
	public String getPrecio() {return precio;}
	public void setPrecio(String precio) {this.precio = precio;}
	
	public String getFecha() {return fecha;}
	public void setFecha(String fecha) {this.fecha = fecha;}
	
//	public estados getEstado() {return estado;}
//	public void setEstado(estados estado) {this.estado = estado;}
	
	public String getEstado() {return estado;}
	public void setEstado(String estado) {this.estado = estado;}
	
	public String getPlazas() {return plazas;}
	public void setPlazas(String plazas) {this.plazas = plazas;}
	
	public String getFechInicio() {return fechInicio;}
	public void setFechInicio(String fechInicio) {this.fechInicio = fechInicio;}
	
	public String getFechFinal() {return fechFinal;}
	public void setFechFinal(String fechFinal) {this.fechFinal = fechFinal;}
	@Override
	public String toString() {
		return "[C_ID=" + C_ID + ", Titulo=" + Titulo + ", precio=" + precio + ", fecha=" + fecha
				+ ", estado=" + estado + ", plazas=" + plazas + ", fechInicio=" + fechInicio + ", fechFinal="
				+ fechFinal + "]";
	}
	
	
	
	
	
}
