package punto08.dominio;

public class Libro {
	private String ISBM, titulo, autor;
    private double precio;
	public Libro(String iSBM, String titulo, String autor, double precio) {
		super();
		ISBM = iSBM;
		this.titulo = titulo;
		this.autor = autor;
		this.precio = precio;
	}
	public Libro() {
		super();
	}
	public String getISBM() {
		return ISBM;
	}
	public void setISBM(String iSBM) {
		ISBM = iSBM;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}

}
