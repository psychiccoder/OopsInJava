package oops.initializationStatesOfObjects.constructors;

public class InstaAcc {
		String username;
		String email;
		long phone;
		private String password;
		InstaAcc(String username, String email, long phone, String password) {
			this.username = username;
			this.email = email;
			this.phone = phone;
			this.password = password;
		}
		 InstaAcc(String username, long phone, String password) {
			this.username = username;
			this.phone = phone;
			this.password = password;
		}
		 InstaAcc(String username, String email, String password) {
			this.username = username;
			this.email = email;
			this.password = password;
		}
		 void showDetails() {
			 System.out.println("Username: "+username+"\nEmail: "+email+"\nPhone: "+phone);
		 }
		
		
		
}
