import java.util.Scanner;

public class UcakBileti {

    public static void main(String[]args){

        int km, yas, tip;
        double biletFiyat, indirim, toplamFiyat, normalFiyat;
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Mesafe km türünden giriniz: ");
        km = keyboard.nextInt();

        System.out.print("Yasinizi giriniz: ");
        yas = keyboard.nextInt();

        System.out.print("Yolculuk tipini giriniz ( 1 => Tek yön , 2 => Gidiş dönüş ): ");
        tip = keyboard.nextInt();

        biletFiyat = km * 0.10;


        if ( !((km > 0) && ( yas > 0) && ( (tip == 1) || (tip == 2)) )) {
            System.out.println("Hatalı Veri Girdiniz !");
            System.exit(0);
        }
        if ( 1 == 1 ){
            if ( yas < 12 ) {
            indirim = biletFiyat * 0.5;
            if (tip == 2)
                System.out.println("Toplam tutar = " + ( 2*(toplamFiyat = indirim * 0.8)) + "TL");
            else
                System.out.println("Toplam tutar = " + (indirim = biletFiyat * 0.5) + "TL");
        }

        if ( (yas >= 12) && (yas <= 24) ) {
            indirim = biletFiyat * 0.9;
            if (tip == 2)
                System.out.println("Toplam tutar = " + (2*(toplamFiyat = indirim * 0.8)) + "TL");
            else
                System.out.println("Toplam tutar = " + (indirim = biletFiyat * 0.9) + "TL");
        }
        if ( yas > 65 ) {
            indirim = biletFiyat * 0.7;
            if (tip == 2)
                System.out.println("Toplam tutar = " + (2*(toplamFiyat = indirim * 0.8)) + "TL");
            else
                System.out.println("Toplam tutar = " + (indirim = biletFiyat * 0.7) + "TL");
        }}
        if (tip == 2)
        System.out.println("Toplam tutar = " + (2*(normalFiyat = biletFiyat * 0.8)) + "TL");
        if (tip == 1)
            System.out.println("Toplam tutar = " + (biletFiyat) + "TL");















    }
}
