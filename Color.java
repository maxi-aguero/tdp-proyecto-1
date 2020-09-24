
public class Color {
	private int rojo;
	private int verde;
	private int azul;
	
	public Color() {
		rojo=0;
		verde=0;
		azul=0;
		
	}
	
	public Color(int r, int v, int a) {
		rojo=r;
		verde=v;
		azul=a;
		
	}
	
	public int getRojo() {return rojo;}

	public int getVerde() {return verde;}
	
	public int getAzul() {return azul;}
	
	public void setRojo(int r) {rojo=r;}

	public void setVerde(int v) {verde=v;}

	public void setAzul(int a) {azul=a;}
	
	public String toString() {return "("+rojo+","+verde+","+azul+")";}
	
}
