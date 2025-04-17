public class student {
    // properties of the student class
    int ID;
    String name;
    String major;

    // constructor
    student(int i, String n, String m) {
        ID = i;
        name = n;
        major = m;
    }

    // method
    void enroll() {
        System.out.println(
                "Congrats " + name + " " + "you are enrolled into " + major + "," + " your student ID is " + ID);
    }

    public static void main(String[] args) {
        student student1 = new student(11, "Emma", "Playing");
        student student2 = new student(22, "Linda", "Nursing");
        student student3 = new student(33, "Massoma", "Science");
        student1.enroll();
        student2.enroll();
        student3.enroll();
    }
}