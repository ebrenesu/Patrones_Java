package sistemaClasico.objetos;

public class Vaso {
	private int idVaso, mOz, cantidad;
	private String tipo_vaso;

	public Vaso(int idVaso, int mg, int cantidad) {
		setIdVaso(idVaso);
		setMg(mg);
		setCantidad(cantidad);
		
		switch (idVaso){
			case 1: 
				tipo_vaso = "pequenno";
			break;
			case 2: 
				tipo_vaso = "mediano";
			break;
			case 3: 
				tipo_vaso = "grande";
			break;
		}
	}

	private void setIdVaso(int idVaso) {
		this.idVaso = idVaso;
	}

	private void setMg(int mg) {
		this.mOz = mg;
	}
	
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	public int getIdVaso() {
		return idVaso;
	}
	
	public int get_CantidadMG() {
		return mOz;
	}

	public int get_CantidadVasos() {
		return cantidad;
	}
	
	public String get_TipoVaso() {
		return tipo_vaso;
	}

}
