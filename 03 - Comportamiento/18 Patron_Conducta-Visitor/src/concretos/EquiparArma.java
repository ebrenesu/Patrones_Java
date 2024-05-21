package concretos;

import java.util.List;

import interfaces.IPersonaje;
import interfaces.IVisitor;

public class EquiparArma implements IVisitor{

	@Override
    public void visit( Mago m ){
        m.setArma("DAGA");
    }
    // ------------------------------
    @Override
    public void visit( Guerrero g )
    {
        g.setArma("ESPADA");
    }
    // ------------------------------
    @Override
    public void visit( List<IPersonaje> personajes ) {
        for( IPersonaje p : personajes )
        	p.accept(this);
        
    }

}
