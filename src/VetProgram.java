public class VetProgram {
    public static void main(String[] args) {
        Bear winnie = new Bear();
        Lion simba = new Lion();
        Chiucken kfc = new Chiucken();

        Vet marcel = new Vet();

        marcel.makeShot(simba);
        marcel.makeShot(kfc);
        marcel.makeShot(winnie);
    }
}
