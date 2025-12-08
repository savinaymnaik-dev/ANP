public class Printer {
    public void printDetails(String name, int age) {
        System.out.println("Method 1 (String, int) called:");
        System.out.println("  Name: " + name);
        System.out.println("  Age: " + age);
    }

    public void printDetails(int age, String name) {
        System.out.println("Method 2 (int, String) called:");
        System.out.println("  Age: " + age);
        System.out.println("  Name: " + name);
    }

    public static void main(String[] args) {
        Printer printer = new Printer();

        System.out.println(" Method 1 ");
        printer.printDetails("Saviany", 23);
        
        System.out.println("\n");

        printer.printDetails(23, "Saviany");
    }
}    
