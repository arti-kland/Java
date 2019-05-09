package demenagement;

public class Algo_Demenage {
    public static void main(String[] args) {


        //fixer variables nombres
        int locala = 34;
        int localb = 0;
        int camion = 0;
//fixer variables poids
        int tas_1 = 0;
        int tas_2 = 0;
        int tas_3 = 0;
        int tas_4 = 0;


        //programme
        while (locala > 0) {
//            remplir();
            System.out.println("un voyage de " + camion + " cartons ");
//            vider();
            //trier();
        }
        System.out.println("nombres de colis = " + tas_1 + " de 1kg ");
        System.out.println("nombres de colis = " + tas_2 + " de 1 à 3kg ");
        System.out.println("nombres de colis = " + tas_3 + " de 3 à 5kg ");
        System.out.println("nombres de colis = " + tas_4 + " de 5kg ");
        System.out.println("34 colis déménagés");


//fonction remplir camion
//        void remplir () {
            while (locala != 0 && camion < 9) {
                locala--;
                camion++;
            }
//        }

//fonction vider camion
//        void vider () {
            while (camion != 0) {
                camion--;
                localb++;
                int poids =  1 + (int)(Math.random() * ((8 - 1) + 1));
                if (poids <= 1) {
                    tas_1++;


                    if (poids > 1 && poids < 3) {
                        tas_2++;
                    }
                    if (poids > 3 && poids < 5) {
                        tas_3++;
                    }
                    if (poids > 5) {
                        tas_4++;
                    }
                }
            }


        }
//    }
}