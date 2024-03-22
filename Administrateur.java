import java.util.HashMap;



public class Administrateur extends User{
    public boolean active ; 
    public double salary;
    public Administrateur (String firstName , String lastName , String phoneNumber ,String email, boolean active ){
        super(firstName, lastName, phoneNumber, email);
        this.active= active ; 
    }
    
    
    
        
        public void addRoom (Chambre chambr , HashMap<String, Chambre> chambres) {
        	Hotel.getchambres().put(chambr.getIdChambre() , chambr);
        }
        
        
       public void deletRoom ( Chambre chambr, HashMap<String, Chambre> chambres) {
    	   Hotel.getchambres().remove(chambr.getIdChambre() );
    }
       
       public void addUser (User utilisateur , HashMap<Integer, User> users) {
        	Hotel.getusers().put(utilisateur.getIdUser() , utilisateur);
        }
        
        
       public void deletUser (User utilisateur , HashMap<Integer, User> users) {
    	   Hotel.getusers().remove(utilisateur.getIdUser()  );
    }  
       
       public void addClient (Client clien , HashMap< String ,Client> clients ) {
        	Hotel.getclients().put(clien.getID() , clien );
        }
        
        
       public void deletClient (Client clien , HashMap< String ,Client> clients) {
    	   Hotel.getclients().remove(clien.getID() );
    }  
    
    
}
