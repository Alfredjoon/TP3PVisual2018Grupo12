package punto07.dominio;

public class Auto {
	private String patente, marca, color, modelo, tipComb;
    private int id;
	
    public Auto() {
		super();
	}
	public Auto(int id,String patente, String marca, String color, String modelo, String tipComb) {
		super();
		this.patente = patente;
		this.marca = marca;
		this.color = color;
		this.modelo = modelo;
		this.tipComb = tipComb;
		this.id = id;
	}
	public Auto(String patente, String marca, String color, String modelo, String tipComb) {
		super();
		this.patente = patente;
		this.marca = marca;
		this.color = color;
		this.modelo = modelo;
		this.tipComb = tipComb;
		
	}
	public String getPatente() {
		return patente;
	}
	public void setPatente(String patente) {
		this.patente = patente;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getTipComb() {
		return tipComb;
	}
	public void setTipComb(String tipComb) {
		this.tipComb = tipComb;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
    

}
