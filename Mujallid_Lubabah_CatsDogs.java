
public class Mujallid_Lubabah_CatsDogs {

    public static void main(String[] args) {
        System.out.println();

        Dog[] dogs = new Dog[5];
        makeDogArray(dogs);

        Cat[] cats = new Cat[5];
        makeCatArray(cats);

        loop(dogs, cats);
    }

    static void loop(Dog[] dogs, Cat[] cats) {
        for (int i = 0; i < cats.length; i++) {
            cats[i].meow();
            for (int j = 0; j < dogs.length; j++) {
                if (dogs[j].age > cats[i].age) {
                    dogs[j].bark();
                }

            }
        }
    }

    static void makeDogArray(Dog[] dogs) {
        dogs[0] = new Dog("doggy", 2);
        dogs[1] = new Dog("daggy", 5);
        dogs[2] = new Dog("droggy", 7);
        dogs[3] = new Dog("dangy", 3);
        dogs[4] = new Dog("dongy", 4);
        // System.out.println("finished making dog array");
    }

    static void makeCatArray(Cat[] cats) {
        cats[0] = new Cat("kitty", 3);
        cats[1] = new Cat("kitten", 4);
        cats[2] = new Cat("kitt", 6);
        cats[3] = new Cat("kat", 2);
        cats[4] = new Cat("katty", 8);
        // System.out.println("finished making cat array");
    }
}

class Dog {
    String name;
    int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void bark() {
        System.out.println(this.name + ": Woof!");
    }
}

class Cat {
    String name;
    int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void meow() {
        System.out.println(this.name + ": Meow!");
    }
}
