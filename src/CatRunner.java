public class CatRunner {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Garfield", 6, 20.5);
        cat1.introduce();
        cat1.printCatInfo();

        Cat cat2 = new Cat("Tom", 8, 10.5);
        cat2.introduce();
        cat2.printCatInfo();
    }
}