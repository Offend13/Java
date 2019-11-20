public class Program {
    public static void main(String[] args) {
        Person alex = new Person("Alexandru", 20, 175, 10);
        Student andrei = new Student("Andrei", 25, 180, 100, "A");
        andrei.grow(10);

        if (andrei instanceof Student) {
            System.out.println(andrei.getName() + " este student");

        }
        Student s = (Student) andrei;
        System.out.println();
        System.out.println(andrei.getHeight());
        System.out.println(andrei.toString());

        System.out.println(alex.getName() + " are " + alex.getAge() + " de ani");

        alex.run();
        alex.run();
        alex.run();
        System.out.println(alex.getName() + " are energia " + alex.getStamina());

        alex.sleep();
        System.out.println(alex.getName() + " are energia " + alex.getStamina());

        if (alex.isMajor()) {
            System.out.println(alex.getName() + " drinks beer");
        } else
            System.out.println(alex.getName() + " drinks milk");

    }
}
