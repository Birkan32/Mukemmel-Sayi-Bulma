import java.util.Scanner ;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int sayı,i ,toplam =0;
        System.out.print("Bir Sayı Giriniz :");
        sayı = input.nextInt();

        for (i=1 ; i<sayı ; i++) {
            if (sayı % i == 0) {
                System.out.println(i + "*" + (sayı / i) + "=" + sayı);
                toplam += i;

                System.out.println("");
                System.out.println(toplam);

            }

        }if(sayı == toplam) {
            System.out.println(sayı + " Mükemmel bir sayidir");
        }
        else {
            System.out.println(sayı + " Mükemmel bir sayi degildir.");
        }
    }
    }

