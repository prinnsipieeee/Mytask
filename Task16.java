interface Animal {
    boolean feed(boolean timeToEat);
    void groom();
    void pet();
}


class Gorilla implements Animal {

    @Override
    public boolean feed(boolean timeToEat) {
     
        if (timeToEat) {
            System.out.println("Feeding the gorilla...");
            return true;
        }
        return false;
    }

    @Override
    public void groom() {
        
        System.out.println("Grooming the gorilla's fur.");
    }

    @Override
    public void pet() {
        // Add comment: pet at your own risk
        System.out.println("Attempting to pet the gorilla...");
    }
}


public class Task16 {
    public static void main(String[] args) {
        Gorilla myGorilla = new Gorilla();
        
        myGorilla.feed(true);
        myGorilla.groom();
        myGorilla.pet();
    }
}