import java.util.Scanner;

public class EbobEkokHesaplama {
    public static void main(String[] args) {
        Scanner imp = new Scanner(System.in);

        System.out.print("n1 sayısını girin : ");
        int n1 = imp.nextInt();
        System.out.print("n2 sayısını girin : ");
        int n2 = imp.nextInt();

        int ebob = 1;
        int ekok = n1 * n2;

        int i = 1;
        while (i <= n1 && i <= n2 ){
            if (n1 % i == 0 && n2 % i == 0){
                ebob = i;
            }
            i++;
        }
        System.out.println("EBOB : " + ebob);
        System.out.println("EKOK : " + ekok / ebob);
    }
}
