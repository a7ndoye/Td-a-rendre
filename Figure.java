public abstract class Figure{
	private double longueur;

	private static String unite;

	public Figure(){

	}

	public double getLongueur(){
	return this.longueur;	
	}

	public double setLongueur(double longueur){
	this.longueur=longueur;	
	}

	public static string getUnite(){
	return Figure.unite;

	}
	public static void setUnite(string unite){
	Figure.unite=unite;
	}

	public abstract double demiPerimetre();
	public abstract double surface();
	public abstract double diagonale();

	public abstract double perimetre(){
	return this.demiPerimetre()*2;
	}
	
}