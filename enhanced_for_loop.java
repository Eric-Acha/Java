public class enhanced_for_loop {

    public static void main(String[] args) {
        int[] numbers = { 5, 10, 15, 20, 25, 30 };

        for (int x : numbers) {
            System.out.print(x + 2);
            System.out.print(", ");
        }
        System.out.println("\n");
        String[] names = { "Ngo", "Emma", "Drowah" };
        for (String name : names) {
            System.out.println("my name is : " + name);
            // System.out.println(",");
        }
    }
}