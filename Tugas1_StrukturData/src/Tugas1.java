//Nama : Wildan Krisna Hakim
//NIM : 054607866

import java.util.LinkedList;

public class Tugas1 {
    static void main(String[] args) {
        //Buatlah sebuah deklarasi variabel dengan tipe data integer yang bernama ‘StrukturBaris’? (15 Poin)
        int StruktuBaris;
        StruktuBaris = 15;
        System.out.println("No. 1 :\t" + StruktuBaris);
        System.out.println("\n");
        /*Buatlah sebuah deklarasi variabel dengan tipe data string yang
        bernama ‘KataBaru’ yang berisi kata ‘Deklarasi tipe data String’? (15 Poin)*/
        String KataBaru;
        KataBaru = "Deklarasi tipe data String";
        System.out.println("No. 2 : " + KataBaru);
        System.out.println("\n");

        /*Buatlah pendeklarasian array satu dimensi dengan nama ‘empatAngka’,
        tipe data integer, yang berisi angka (07, 10, 20, 23)? Pendeklarasian
        tersebut dengan menggunakan bahasa pemrograman Java. (15 Poin)*/
        int[] empatAngka = {07, 10, 20, 23};
        System.out.println("No. 3 :");
        for (int a=0; a < empatAngka.length; a++) {
            System.out.print(empatAngka[a] + "\t");
        }


        /*Buatlah pendeklarasian array dua dimensi dengan nama ‘Angka’,
        tipe data String, yang terdiri dari tiga baris dan tiga kolom,
        isi baris dan kolom berisi angka berikut (1, 3, 5, 14, 19, 20, 22, 27, 29)
        Pendeklarasian tersebut dengan menggunakan bahasa pemrograman Java. (20 Poin)*/
        String [][] Angka = {
                {"1","3","5"},
                {"14","19","20"},
                {"22","27","29"}
        };
        System.out.println("\n");

        System.out.println("No. 4 :");
        for (int x = 0; x < Angka.length; x++){
            for (int y = 0;y < Angka.length ;y++){
                System.out.print(Angka[x][y] + "\t");
            }
            System.out.println("");
        }

        System.out.println("\n");


        /*Buatlah deklarasi linked list dengan nama 'listAngka' yang memiliki list (22, 19, 44, 60, 72),
        Pendeklarasian tersebut dengan menggunakan bahasa pemrograman Java. (20 Poin)
        */
        LinkedList<Integer> lisAngka = new LinkedList<>();
        lisAngka.add(22);
        lisAngka.add(19);
        lisAngka.add(44);
        lisAngka.add(60);
        lisAngka.add(72);
        System.out.println("No. 5 : " + lisAngka);
    }
}
