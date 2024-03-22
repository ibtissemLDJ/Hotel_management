public class User {
   public String name; 
   public String lastName;
   public static int idUser = 0;
   private String phoneNumber; 
   private String email;
   
   public User(String name , String lastName , String phoneNumber ,String email){
     idUser++;
     this.name= name ; 
     this.lastName = lastName;
     this.phoneNumber= phoneNumber; 
     this.email= email;
   }
   public String getEmail() {
       return email;
   }
   public String getPhoneNumber() {
       return phoneNumber;
   }
   public void setEmail(String email) {
       this.email = email;
   }
   public void setPhoneNumber(String phoneNumber) {
       this.phoneNumber = phoneNumber;
   }
   public  void subsecribe(){

   }

}
