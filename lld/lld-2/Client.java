public class Client {
    public static void main(String[] args){
        Animal a = new Animal();
        Dog d = new Dog();

        a.name = "pratik";
        a.age = 12;
//        d.sayName();
//        Animal ad = new Dog();
//        ad.name = "pratik";
//        ad.sayName();
        Animal gh = new Labrador();
        gh.name = "newpratik";
//        gh.sayName();
//        ad.breed = "news";


        ///Interface and Code duplication:
        Runnable ab = new Dog();
        Runnable cd = new Labrador();
        ab.run();
        cd.run();

    }
}
