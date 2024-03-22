public class Client  extends User{
    private String adress; 
    public String clientType; 
    public Client (String name , String lastName , String phoneNumber ,String email,  String adress , String clientType ){
        super(name, lastName, phoneNumber, email);
        this.adress= adress; 
        this.clientType= clientType; 
    }
    public String getAdress() {
        return adress;
    }
    public void setAdress(String adress) {
        this.adress = adress;
    }
}
