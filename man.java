public class man extends person {
    String gender;

    man(int a, String n, String g) {
        super(a, n);
        gender = g;

    }

    void show_gender() {
        System.out.println("Gender: " + gender);
    }

}