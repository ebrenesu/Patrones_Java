package compositor.base;

public abstract class IEmpresa{
	public String myNombre;
	public abstract int getSalario();
	public abstract String getNombre();
	public abstract void agregarComponente(IEmpresa composicion);	
}