package Lab2.Soale1;

/**
 * class Run is where we create student objects
 * and enroll them to the Lab
 * @author Alborz Saadatmand
 * @version 1
 */
public class Run {

    public static void main(String[] args) {

        // create 3 Student objects
        Student std1 = new Student("Ehsan", "Edalat", "9031066");
        Student std2 = new Student("Seyed", "Ahmadpanah", "9031806");
        Student std3 = new Student("Ahmad", "Asadi", "9031054");
        Student std4 = new Student("Alborz", "Saadatman", "9831086");

        std1.print();         // print information of std1
        std1.setGrade(15);    // set grade of std1 to 15
        std1.print();         // print information of std1

        std2.print();         // print information of std2
        std2.setGrade(11);    // set grade of std2 to 11
        std2.print();         // print information of std2

        std3.print();                       // print information of std3
        std3.setFirstName("Mamad");     // set std3's name to HamidReza
        std3.print();

        std4.print();
        std4.setGrade(19.5f);
        std4.print();

        // create a Lab object which is held in Monday
        // and with the capacity of 2 students
        Lab lab1 = new Lab(2, "Monday");
        lab1.enrollStudent(std4);     //enroll std3 to lab1
        lab1.enrollStudent(std1);     //enroll std1 to lab1
        lab1.enrollStudent(std2);     //enroll std2 to lab1
        lab1.enrollStudent(std3);     //enroll std3 to lab1

        // capacity of the lab1 is 2 students so,
        // std3 cannot be enrolled to the lab
        // and a warning message should be displayed

        lab1.print();   // print information of the lab students
        // and their average grade

    }// end method main

} //end class Run
