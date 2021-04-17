package Lab2.Soale1;

/**
 * class Lab simulates a lab
 * students can be enrolled in the lab
 * @author Alborz Saadatmand
 * @version 1
 */
public class Lab {

    // Fields

    private Student[] students;    // an array of Student class objects
    private float avg;               // average grade of the students
    private String day;            // the day that the lab session is being held
    private int capacity;          // capacity of the lab
    private int currentSize;       // number of students currently in the lab


    /**
     * @param cap capacity of the lab
     * @param d the day that the lab class session is being held
     */
    public Lab(int cap, String d) {

        capacity = cap;    // assign cap to the capacity field
        day = d;           // assign d to the day field
        currentSize = 0;   // initialize currentSize field to zero
        avg = 0;           // initialize avg field to zero
        students = new Student[cap];

    }

    // Methods

    /**
     * enrolls a student to the lab
     * if the lab does'nt have enough space gives a warning
     * @param std the student that has to be enrolled in the lab
     */
    public void enrollStudent(Student std) {
        if (currentSize < capacity) {
            students[currentSize] = std;
            currentSize++;
        } else {
            System.out.println("Lab is full!!!");
        }
    }

    /**
     * prints information of the students and
     * the average grade of the students
     */
    public void print() {
        calculateAvg();
        for(int counter = 0 ; counter < currentSize ; counter++){
            System.out.print(students[counter].getFirstName() + " ");
            students[counter].print();

        }
        System.out.println("******************************");
        System.out.println("Average grade " + avg);
    }

    /**
     * get students
     * @return students (an array of Student class)
     */
    public Student[] getStudents() {
        return students;
    }

    /**
     * set students
     * @param students entered students
     */
    public void setStudents(Student[] students) {
        this.students = students;
    }

    /**
     * get average grade of students
     * @return avg field
     */
    public float getAvg() {
        return avg;
    }

    /**
     * calculate average grade of students in the lab
     */
    public void calculateAvg() {
        float total = 0;
        for(int counter = 0 ; counter < currentSize ; counter++)
            total += students[counter].getGrade();
        avg = total / currentSize;
    }

    /**
     * get the day the lab is being held
     * @return day field
     */
    public String getDay() {
        return  day;
    }


    /**
     * sets the day
     * @param day the day the lab is being held
     */
    public void setDay(String day) {
        this.day = day;
    }

    /**
     * get capacity of the lab
     * @return capacity field
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * set capacity of the lab
     * @param capacity capacity of the lab
     */
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

}// end class Lab

