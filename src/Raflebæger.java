import java.util.Random;

public class Raflebæger {

    public int antalTerninger;
    private int[] terninger;

    public Raflebæger(int antalTerninger) {
        this.antalTerninger = antalTerninger;
        terninger = new int[antalTerninger];
    }

    public int ryst() {
        Random random = new Random(); //random generator

        int sum = 0;
        //loopene er svarenede til antalTerninger
        for (int i = 0; i < antalTerninger; i++) {
            //lave tilfældigt tal ml. 1-6
            int randomNumber = random.nextInt(6) + 1;

            sum = sum + randomNumber;
        }
        return sum;
        //summere og returnere samlet værdi
        //simulere ryst med ti terninger

    }
    public int[] se() {
        return terninger;

    }
}
