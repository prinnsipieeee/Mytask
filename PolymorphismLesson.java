import java.util.*;
import java.util.Collections;

public class PolymorphismLesson {
    public static void main(String[] args) {
        Animal a;

        a = new Animal();
        a.sound();

        a = new Dog();
        a.sound();
        a.eat();

        a = new Cat();
        a.sound();

        a = new Cow();
        a.sound();

        a = new student();
        a.grades();

        Registrar b;

        b = new Applicant();
        b.person();

        Bird bird1 = new Bird();
        bird1.display();
        Bird bird2 = new Maya();
        bird2.display();
        Bird bird3 = new Bird();
        bird3.display(); 
    }
}

class Animal{
    void sound(){
        System.out.println("Animal Makes a Sound!");
    }

    void eat(){
        return;
    }

    void grades(){
        return;
    }

    int grades = 66;
    String name = " Bagsak ka pala eh!";


}

class Dog extends Animal{
    @Override
    void sound(){
        System.out.println("Dog Barks");
    }

    void eat(){
        System.out.println("Yummy");
    }
}

class Cat extends Animal{
    @Override
    void sound(){
        System.out.println("Meow Meow");
    }
}

class Cow extends Animal{
    @Override
    void sound(){
        System.out.println("Mooooo");
    }
}

class student extends Animal{
    @Override
    void grades(){
        System.out.println("Your grade is: " + grades + name);
    }
    
}

class Registrar{
    void person(){
        System.out.println("--\tTHIS IS THE LIST OF APPLICANT---");
    }
}

class Applicant extends Registrar{

    List<String> Applicant1 = Arrays.asList("Prince", "Gabo", "Pido", "Johnny", "Wayne", "Drei");

    void person(){
        Collections.reverse(Applicant1);
        System.out.println("The Apllicant Names: " + Applicant1);
        
    }
}

class Bird{
    public String getName(){
        return "Unknown";
    }
    public void display(){
        System.out.println("This bird name is: " + getName());
    }
}

class Peacock extends Bird{
    public String getName(){
        return "Peacock";
    }
}

class Maya extends Bird{
    public String getName(){
        return "Maya";
    }
}