package oops.classAndObjects;

public class UserAccount {
		int userId=47891;
		boolean isActive=true;
		String username="Abhishek";
		String email= "abhi.raj2341@gmail.com";
		long phone=7823412890l;
		void showDetails() {
			System.out.println("The User id is "+userId+"\nThe Account is Active Or Not"+isActive+"\nUsername is"+username+"\nEmail is "
					+email+"\nPhone is"+phone);
		}
}
