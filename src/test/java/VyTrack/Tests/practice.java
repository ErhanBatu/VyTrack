package VyTrack.Tests;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class practice {

    @Test
    public void test(){

        List<String> urunler = new ArrayList<>();

        urunler.add("Biskirem"); //0
        urunler.add("Nutella");  //1
        urunler.add("Cekirdek");  //2
        urunler.add("Cayyy");  //3

        String silinecekUrun = "Cay";
        String eklenecekUrun = "Ikram";

        List<String> eskiUrunler = new ArrayList<>(); //3 tane eleman


        for (int i = 0; i < urunler.size(); i++) {

            if (urunler.get(i).contains(silinecekUrun)){
                eskiUrunler.add(silinecekUrun);
                urunler.set(i,eklenecekUrun);  //index numarasinin yerine
            }

        }

        System.out.println(urunler);
        System.out.println(eskiUrunler);


        //Test Data:
        //    birinci binary number: 100010
        //    ikinci  binary number: 110010
        //
        //    Beklenen Çıktı:
        //    1010100
        //     */
        //     public static void main(String[] args) {
        //         int sayi1 = 100010;
        //         int sayi2 = 110010;
        //
        //         int elde = 0;
        //         String toplam = "";
        //         int basToplam= 0;
        //
        //         while (sayi1>0 || sayi2>0) {
        //             basToplam = sayi1%10 + sayi2%10 + elde;
        //             toplam = basToplam%2 + toplam;
        //             if (basToplam>=2) {
        //                 elde = 1;
        //             } else elde=0;
        //             sayi1/=10;
        //             sayi2/=10;
        //         }
        //         toplam = 1 + toplam;
        //         System.out.println(toplam);

    }

    @Test
    public void testt(){

        /* Bir String değişkeni cümlesi verildiğinde, her sözcüğü almak için kod yazın ve tersine ters çevrilmiş String'e atayın. */

//        Test Data:
//        sentence -> 	 "Java is fun"
//        reversed **->	 "**fun is Java**"**

        String sentence = "Java is fun";
        String reversed = "";

        String[] newSentence = sentence.split(" ");

        System.out.println(Arrays.toString(newSentence));

        for (int i = newSentence.length-1; i > -1; i--) {

            reversed = reversed + " " + newSentence[i];


        }

        System.out.println(reversed);
    }


}

