import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Test {

    /*
    public static void addSound(List<?> list) { // DOES NOT COMPILE: 
                                                // addSound(List<?>) and addSound(List<? super String>) have the same erasure
        //list.add("quack"); //DOES NOT COMPILE: list is IMMUTABLE
    }
     */

    /*
    public static void addSound(List<? extends Object> list) { // DOES NOT COMPILE: 
                                                               // addSound(List<? extends Object>) and addSound(List<? super String>) have the same erasure
        //list.add("quack"); //DOES NOT COMPILE: list is IMMUTABLE
    }
     */

    /*
    public static void addSound(List<Object> list) { // DOES NOT COMPILE: 
                                                     // addSound(List<Object>) and addSound(List<? super String>) have the same erasure
        list.add("quack");
    }
     */

    public static void addSound(List<? super String> list) { 
        list.add("quack");
    }




    public static void addCat(List<? super Cat> catList) {
        catList.add(new RedCat());
        System.out.println("Cat Added");
    }


    public static void main(String[] args) {
        List<String> strings = new ArrayList<String>();
        strings.add("tweet");

        List<Object> objects = new ArrayList<Object>(strings);
        addSound(strings);
        addSound(objects);





        List<? super IOException> exceptions = new ArrayList<Exception>();
        //exceptions.add(new Exception()); //DOES NOT COMPILE, porque en compilacion valida el lado izquierdo, en este caso IOException
        exceptions.add(new IOException());
        exceptions.add(new FileNotFoundException());



        

        List<Animal> animalList= new ArrayList<Animal>();
        List<Cat> catList= new ArrayList<Cat>();
        List<RedCat> redCatList= new ArrayList<RedCat>();
        List<Dog> dogList= new ArrayList<Dog>();

        //add list of super class Animal of Cat class
        addCat(animalList);

        //add list of Cat class
        addCat(catList);

        //compile time error
        //can not add list of subclass RedCat of Cat class
        //addCat(redCatList);

        //compile time error
        //can not add list of subclass Dog of Superclass Animal of Cat class
        //addCat.addMethod(dogList); 
    }
}

class Animal {}

class Cat extends Animal {}

class RedCat extends Cat {}

class Dog extends Animal {}