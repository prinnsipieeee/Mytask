public class LowerCase {
    public static void main(String[] args) {
        String name = "prince";
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name);

        System.out.println("abc".contains("b"));
        System.out.println("abcde".replace("b", "E"));
        System.out.println(name.replace("prince", "Prince Pogi sakalam"));
        String Trimsample = "     \t \n \t Prince Penaflor \t \n";
        System.out.println(Trimsample);
        System.out.println(Trimsample.trim());

    }
}

class japan {
static void batiin(String pangalan) {
    System.out.println("Kamusta, " + pangalan + "!");
}

public static void main(String[] args) {
    batiin("Juan"); // Ang "Juan" ay ang argument
}
}

class origami {
    public static void main(String[] args) {
        int age = 26;
        String name = "Prince Albert C. Penaflor ";

        System.out.println(name.replace("C.", "B.") + age);
        System.out.println(name.toUpperCase() + age);
    }
}

class tester {
    static int sum (int x, int y) {
        int result = x + y;
        return result;
    }

    public static void main(String[] args) {
        int total = sum(10, 20);
        System.out.println("Ang kabuuan ay: " + total);
    }
}