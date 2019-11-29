import Songs.Song;

public class EqualTest {
    public static void main(String[] args) {
        Song first = new Song("Come as you are", "Nirvana");
        Song second = new Song("Come as you are", "Nirvana");

        if (first.equals(second)){
            System.out.println("Sunt egale");
        } else {
            System.out.println("Nu sunt egale");
        }
        System.out.println(first.hashCode());
        System.out.println(second.hashCode());

    }
}
