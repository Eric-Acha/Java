public class person {
    int age;
    String name;

    person(int a, String n) {
        age = a;
        name = n;

    }

    void intro() {
        System.out.println(
                "My name is " + name + ", i am " + age + " years old.");
    }

    void msg() {
        System.out.println("I am pleased to meet you!");
    }

}