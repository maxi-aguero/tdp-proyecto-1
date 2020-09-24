
public class Libro {
	private String titulo;
	private String autor;
	private int edicion;
	
	public Libro(String t, String a, int e) {
		titulo=t;
		autor=a;
		edicion=e;
		
	}
	
	public String getTitulo() {return titulo;}
	
	public void setAutor(String a ) {autor=a;}
	
	public String toString() {return titulo+","+autor+","+edicion;}
	
}
