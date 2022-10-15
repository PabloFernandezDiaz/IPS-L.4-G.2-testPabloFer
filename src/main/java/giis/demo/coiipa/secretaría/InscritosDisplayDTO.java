package giis.demo.coiipa.secretaría;

public class InscritosDisplayDTO {
	 //c.nombre, c.apellidos, i.estado
	 String nombre;
	 String apellidos;
	 String estado;
	 public InscritosDisplayDTO(String nombre, String apellidos, String estado) {
			super();
			this.nombre = nombre;
			this.apellidos = apellidos;
			this.estado = estado;
		}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	@Override
	public String toString() {
		return "[nombre=" + nombre + ", apellidos=" + apellidos + ", estado=" + estado + "]";
	}
	 
}
