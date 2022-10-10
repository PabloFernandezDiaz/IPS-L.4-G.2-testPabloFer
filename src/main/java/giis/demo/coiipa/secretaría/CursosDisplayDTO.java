package giis.demo.coiipa.secretaría;

public class CursosDisplayDTO {

	private int C_ID;
	private String Titulo ;
	private double precio;
	private String fecha;
	private String estado;
	private int plazas;
	
	private String fechInicio;
	private String fechFinal;
	
	
	public CursosDisplayDTO(int c_ID, String titulo, double precio, String fecha, String estado, int plazas,
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
	public int getC_ID() {return C_ID;}
	public void setC_ID(int c_ID) {C_ID = c_ID;}
	
	public String getTitulo() {return Titulo;}
	public void setTitulo(String titulo) {Titulo = titulo;}
	
	public double getPrecio() {return precio;}
	public void setPrecio(double precio) {this.precio = precio;}
	
	public String getFecha() {return fecha;}
	public void setFecha(String fecha) {this.fecha = fecha;}
	
	public String getEstado() {return estado;}
	public void setEstado(String estado) {this.estado = estado;}
	
	public int getPlazas() {return plazas;}
	public void setPlazas(int plazas) {this.plazas = plazas;}
	
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
