package geometry;

public interface Moveable {
	
	//Interfejsi dozvoljavaju samo staticke konstante
//	public static final boolean VALID = true;

	//interfejsi mogu da imaju smo apstraktne metode
		//public abstract void primer(); 

	//S obzirom da se ocekuje da su metode javne i apstraktne public i absytract kljucne reci publi i abstract se mogu izostaviti
	void moveTo(int x, int y);
	
	void moveBy(int byX, int byY);
	
}
