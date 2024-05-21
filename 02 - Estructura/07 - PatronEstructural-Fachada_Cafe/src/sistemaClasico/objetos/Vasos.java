package sistemaClasico.objetos;

public enum Vasos {
	SMALL, MEDIUM, LARGE, EXTRALARGE;

	public int getID() {
	    switch(this) {
	      case SMALL:
	        return 1;

	      case MEDIUM:
	        return 2;

	      case LARGE:
	        return 3;

	      case EXTRALARGE:
	        return 4;

	      default:
	        return 0;
	      }   
	}
	
	public String getSize() {
	    switch(this) {
	      case SMALL:
	        return "small";

	      case MEDIUM:
	        return "medium";

	      case LARGE:
	        return "large";

	      case EXTRALARGE:
	        return "extra large";

	      default:
	        return null;
	      }
	   }
	  
	  public String getOnce() {
		    switch(this) {
		      case SMALL:
		        return "5oz";

		      case MEDIUM:
		        return "10oz";

		      case LARGE:
		        return "14oz";

		      case EXTRALARGE:
		        return "16oz";

		      default:
		        return null;
		      }   
	  }
}
