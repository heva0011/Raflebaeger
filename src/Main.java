public class Main {

    public static void main(String[] args) {
        Raflebæger raflebæger = new Raflebæger(2);

        int samletAntalØjne = raflebæger.ryst(); //tildeler retur værdi fra metodekald til variablen af samlet antal øjne
        System.out.println(samletAntalØjne);

        int[] terninger = raflebæger.se();

        //loop
        for (int tal : terninger) {
            System.out.println(tal);
        }
    }
}
