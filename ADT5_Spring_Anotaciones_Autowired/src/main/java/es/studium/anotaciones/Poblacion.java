package es.studium.anotaciones;
import org.springframework.beans.factory.annotation.Autowired;
public class Poblacion {
	private String nombre;
	@Autowired
	private Provincia provincia;
	public Poblacion() {
		nombre = "";
		provincia = new Provincia();
	}
	public Poblacion(String nombre, Provincia provincia) {
		this.nombre = nombre;
		this.provincia = provincia;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Provincia getProvincia() {
		return provincia;
	}
	public void setProvincia(Provincia provincia) {
		this.provincia = provincia;
	}
	@Override
	public String toString() {
		return "Población [nombre=" + nombre + ", cantidadHabitantes="
				+ provincia + "]";
	}
}
