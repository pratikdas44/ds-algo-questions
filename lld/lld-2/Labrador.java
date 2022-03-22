public class Labrador extends Dog{
    Runningbehaviour runningBehaviour = new FastRunningbehaviour();
    @Override
    void sayName() {
        super.sayName();
        System.out.println("My name is prsaatika");
    }

    @Override
    public void run() {
        runningBehaviour.run();
    }
}
