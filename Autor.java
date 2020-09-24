
public class Autor {
	
	private String nombre;
	private String apellido;
	private int ano_nacimiento;
	
	public Autor(String nombre,String apellido, int a) {
		this.nombre=nombre;
		this.apellido=apellido;
		ano_nacimiento=a;				
		
	}
	
	public String getnombre() {return apellido+" "+nombre; }
	
	public void setApellido(String a) {apellido=a;}
	
	public void setNombre(String n) {nombre=n;}
	
	public void setAnio(int a) {ano_nacimiento=a;}
	
}
