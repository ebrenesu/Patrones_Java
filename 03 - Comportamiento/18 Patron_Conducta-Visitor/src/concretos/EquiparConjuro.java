package concretos;

import java.util.List;

import interfaces.IPersonaje;
import interfaces.IVisitor;

public class EquiparConjuro  implements IVisitor{

	@Override
	public void visit(Mago m) {
		
		if( m.getNivelMagia() <= 5 )
            m.setConjuro("Bola de Fuego");
        else
            m.setConjuro("Rayo de hielo");
		
	}

	@Override
	public void visit(Guerrero g) {
		if(g.cont > 2)
			g.setArma(g.getArma()+" DE FUEGO");
		if(g.cont > 3)
			g.setArma(g.getArma()+" DE Rayos");
	}

	@Override
	public void visit(List<IPersonaje> elementList) {
		for( IPersonaje p : elementList ){
            p.accept(this);
        }
	}

}
