public class Chambre {
	
	
	
	
   private static int idChambre = 0 ; // numero de la chambre 
   public String type ;// suite , simple  / on peut la faire comme une hashmap
   public String capasity ;// sinon on fait une hashmap et pur chaque valeur c'est un code wella bles collection 
   public double prix ; 
   private boolean isEmpthy; 

   public Chambre(String type , String capasity , double prix , boolean isEmpthy){
    idChambre++;
    this.type = type ; 
    this.capasity= capasity; 
    this.prix = prix;
    this.isEmpthy = isEmpthy;
   }
   public boolean getIsEmpthy(){
    return isEmpthy;
   }
   public void setIsEmpthy(boolean isEmpthy){
    this.isEmpthy= isEmpthy;
   }
public static int getIdChambre() {
	return idChambre;
}
public static void setIdChambre(int idChambre) {
	Chambre.idChambre = idChambre;
}



}
