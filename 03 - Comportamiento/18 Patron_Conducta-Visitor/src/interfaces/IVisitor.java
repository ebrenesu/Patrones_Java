package interfaces;

import java.util.List;
import concretos.*;

public interface IVisitor {
	public void visit( Mago m );
    public void visit( Guerrero g );
    public void visit( List<IPersonaje> elementList );
}