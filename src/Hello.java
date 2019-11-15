public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello Java");
        long age;
        age = 12567890;
        boolean _lightOn1 = false;
        String text = "Hello Java";
        System.out.println(age);
        String nimic = null;
        // nu este corect: boolean public = true
        System.out.println(100 + 50);
        System.out.println(100 + age);
        int x = 80;
        double y = x;
        System.out.println(x);
        x++;
        System.out.println(x);
        int a = 10;
        int b = ++a;
        System.out.println(a);
        System.out.println(b);

        boolean isReaning = true;
        boolean isSunny = false;
        boolean isSnowing = true;



        if(isReaning) {
            System.out.println("iesim in ploaie");
            System.out.println("luam o umbrela");
        } else if(isSunny) {
            System.out.println("luam ochelarii de soare");
        } else if(isSnowing) {
            System.out.println("stam acasa la caldura");
        }else {
            System.out.println("scriem cod Java");}
        if(isSnowing && isReaning) {
            System.out.println("stam acsa si scriem cod Java");
        }





    }
}
