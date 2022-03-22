public class Dog extends Animal implements Runnable {
    String breed;
    String hairColour;

    @Override
    void sayName() {
//        super.sayName();
        System.out.println("My name is prsaatik");
    }

    @Override
    public void run() {
        System.out.println("Nothing");
    }
}
