public class woman extends person {
    String gender;

    woman(int a, String n, String g) {
        super(a, n);
        gender = g;
    }

    void show_gender() {
        System.out.println("Gender: " + gender);
    }

}