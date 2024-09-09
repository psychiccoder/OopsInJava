package oops.initializationStatesOfObjects.methods;

public class StudentMain {
    public static void main(String[] args) {
        // Create the first student object
        Student stu1 = new Student();
        stu1.setRoll(101);
        stu1.setName("Raj");
        stu1.setMarks(190.12);
        System.out.println("Student 1:");
        System.out.println("Roll: " + stu1.getRoll() + "\nName: " + stu1.getName() + "\nMarks: " + stu1.getMarks());

        // Create the second student object
        Student stu2 = new Student();
        stu2.setRoll(102);
        stu2.setName("Rahul");
        stu2.setMarks(180.50);
        System.out.println("\nStudent 2:");
        System.out.println("Roll: " + stu2.getRoll() + "\nName: " + stu2.getName() + "\nMarks: " + stu2.getMarks());

        // Create the third student object
        Student stu3 = new Student();
        stu3.setRoll(103);
        stu3.setName("Priya");
        stu3.setMarks(195.75);
        System.out.println("\nStudent 3:");
        System.out.println("Roll: " + stu3.getRoll() + "\nName: " + stu3.getName() + "\nMarks: " + stu3.getMarks());
    }
}