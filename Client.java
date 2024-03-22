public class Client  extends User{
	
	
    private String adress; 
    public String clientType; 
    private String ID ;
    
    
    public Client (String ID ,String name , String lastName , String phoneNumber ,String email,  String adress , String clientType ){
        super(name, lastName, phoneNumber, email);
        this.adress= adress; 
        this.clientType= clientType; 
        this.ID = ID ;
    }
    public String getAdress() {
        return adress;
    }
    public void setAdress(String adress) {
        this.adress = adress;
    }
    public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
}
