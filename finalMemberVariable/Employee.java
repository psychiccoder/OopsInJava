package oops.finalMemberVariable;

public class Employee {
    final int id;
    static int firstId = 1001;
    String name;
    double salery;
    String designation;
    int experience;

    void showdetails() {
        System.out.println("id " + id);
        System.out.println("name " + name);
        System.out.println("designation " + designation);
        System.out.println("exp " + experience);
    }

    Employee(String name, double salery, String designation, int experience) {
        id = firstId++;
        this.name = name;
        this.salery = salery;
        this.designation = designation;
        this.experience = experience;
    }

}

