package canvas.mediador.concreto;

import canvas.colega.interfaz.Componente;
import canvas.mediador.interfaces.*;
import canvas.objetos.Canvas;

public class MediadorCanvas implements IMediadorCanvas{
	private Componente pintador;
	private Componente borrador;
	private Componente recortador;
	private Canvas lienzo;
	

	@Override
	public void pintar(String pM) {
		this.lienzo.actualizar_el_canvas(pM.toLowerCase());
	}

	@Override
	public void borrar(String pM) {
		this.lienzo.actualizar_el_canvas(pM.toUpperCase());
	}

	@Override
	public void recortar(String pM) {
		this.lienzo.actualizar_el_canvas(pM);
	}

	@Override
	public String mostrarHistorial() {
		return lienzo.get_historial();
	}

	//------------------------------------------------//
	
	public void setPintador(Componente pintador) {
		this.pintador = pintador;
	}

	public void setBorrador(Componente borrador) {
		this.borrador = borrador;
	}

	public void setRecortador(Componente recortador) {
		this.recortador = recortador;
	}

	public void setLienzo(Canvas lienzo) {
		this.lienzo = lienzo;
	}
	
}