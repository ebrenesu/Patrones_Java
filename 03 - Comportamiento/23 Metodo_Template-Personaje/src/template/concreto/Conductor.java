package template.concreto;

import template.abstracto.Personaje;

public class Conductor extends Personaje{
	private int _GastoEstamina;
	
	public Conductor(String _Nombre, int _Estamina, boolean _Activo) {
		super(_Nombre, _Estamina, _Activo);
		this._GastoEstamina = 4;
	}

	@Override
	protected String ejecutarAccion() {
		if(this.is_Activo()) {
			this.set_Estamina(this.get_Estamina() - calculoGastoEstamina());
			return "Seguimos manejando";
		}else
			return "No se pudo hacer la accion porque ya no tiene estamina";
	}

	@Override
	protected int calculoGastoEstamina() {
		return this._GastoEstamina;
	}
	
}
