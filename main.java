public class main {

    public static void main(String[] args) {
        man m = new man(22, "Ngo", "Male");
        m.intro();
        m.msg();
        m.show_gender();

        woman w = new woman(19, "Emma", "Female");
        w.intro();
        w.msg();
        w.show_gender();

    }
}