package oops.classAndObjects;

public class NoteBookMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main Method Started");
		NoteBook n1= new NoteBook();
		System.out.println(n1.price);
		System.out.println(n1.no_of_pages);
		System.out.println(n1.blank);
		System.out.println("++++++++++++++\n");
		NoteBook n2= new NoteBook();
		n2.price=200;
		n2.blank=false;
		System.out.println(n2.price);
		System.out.println(n2.no_of_pages);
		System.out.println(n2.blank);
		System.out.println("Main Method Ended");
	}

}
