package builder.constructorConcreto;

import builder.constructorAbstracto.IBuilderParte;
import builder.productoAbstracto.AParte;
import builder.productoConcreto.Elevaluna;

public class BuilderElevaluna implements IBuilderParte{
	private Elevaluna _Elevaluna;

	/**
	 * @return the _Elevaluna
	 */
	private Elevaluna get_Elevaluna() {
		return _Elevaluna;
	}

	/**
	 * @param _Elevaluna the _Elevaluna to set
	 */
	private void set_Elevaluna(Elevaluna _Elevaluna) {
		this._Elevaluna = _Elevaluna;
	}

	@Override
	public AParte CrearProducto() {
		return CrearElevaluna(false, "Abajo", "EV-0");
	}
	public AParte CrearProducto(Boolean pReguladorElectrico, String pEstadoActual, String pNumSerie) {
		return this.CrearElevaluna(pReguladorElectrico,  pEstadoActual,  pNumSerie);
	}

	@Override
	public AParte ObtenerProducto() {
		return this.get_Elevaluna();
	}
	
	private AParte CrearElevaluna(Boolean pReguladorElectrico, String pEstadoActual, String pNumSerie) {
		this.set_Elevaluna(new Elevaluna(  pReguladorElectrico,  pEstadoActual,  pNumSerie));
		return this.get_Elevaluna();
	}
}
