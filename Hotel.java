import java.util.HashMap;



public class Hotel {
	
	
	
	public static HashMap< String ,Client> clients = new HashMap<String, Client> ();
	 public static HashMap<Integer, Chambre> chambres = new HashMap<Integer, Chambre> ();
	public static HashMap<Integer , User> users = new HashMap<Integer, User> ();
	
	
	public static HashMap<Integer, Chambre> getchambres() {
		// TODO Auto-generated method stub
		return chambres;
	}


	public static HashMap<Integer, User> getusers() {
		// TODO Auto-generated method stub
		return users;
	}


	public static HashMap<String, Client> getclients() {
		// TODO Auto-generated method stub
		return clients;
	}
    public static void main(String[] args) {
    }
}
