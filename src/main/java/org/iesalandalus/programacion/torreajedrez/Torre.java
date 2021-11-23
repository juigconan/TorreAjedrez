package org.iesalandalus.programacion.torreajedrez;

public class Torre {
	
	private Posicion posicion;
	private Color color;
	
	
	public Torre(){
		setColor(color.NEGRO);
		setPosicion(new Posicion(8, 'h'));
		
	}
	
	public Torre(Color color) {
		setColor(color);
		if(color == color.BLANCO)
			setPosicion(new Posicion(1, 'h'));
		if(color == color.NEGRO)
			setPosicion(new Posicion(8, 'h'));
		
	}
	
	public Torre(Color color, char columna) {
		if(columna != 'a' & columna != 'h')
			throw new IllegalArgumentException("ERROR: Argumento no váido");
		setColor(color);
		if(color == color.BLANCO)
			setPosicion(new Posicion(1, columna));
		if(color == color.NEGRO)
			setPosicion(new Posicion(8, columna));
		
		}
	
	public Color getColor() {
		return color;
	}
	
	private void setColor(Color color) {
		if(color == null)
			throw new NullPointerException("ERROR: El color es nulo");
		
		if(color != color.NEGRO & color != color.BLANCO)
			throw new IllegalArgumentException("ERROR: El color no el válido");
		
		this.color = color;
	}
	
	public Posicion getPosicion() {
		return posicion;
	}
	
	private void setPosicion(Posicion posicion) {
		if(posicion == null)
			throw new NullPointerException("");
		
		this.posicion = posicion;
	}
}
