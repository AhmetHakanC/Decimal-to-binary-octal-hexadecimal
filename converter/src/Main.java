import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int girdi, temp1;
        ArrayList <Integer> sayilar = new ArrayList<Integer>();
        ArrayList <Integer> ikilik_donusumler = new ArrayList<Integer>();
        ArrayList <Integer> sekizlik_donusumler = new ArrayList<Integer>();
        ArrayList <Integer> onaltilik_donusumler = new ArrayList<Integer>(); // 10=A - 11=B - 12=C - 13=D - 14=E - 15=F

        System.out.print("Kaç sayı dönüştürülsün? --> ");
        Scanner input = new Scanner(System.in);
        girdi = input.nextInt();


        for (int i = 1; i < girdi + 1; i++){
            sayilar.add(i);
            System.out.print(sayilar.get(i-1) + " -- ");
            temp1 = sayilar.get(i-1);

            while (temp1 > 0) {
                ikilik_donusumler.add(temp1 % 2);
                temp1 /= 2;
            }
            temp1 = sayilar.get(i-1);
            while (temp1 > 0) {
                sekizlik_donusumler.add(temp1 % 8);
                temp1 /= 8;
            }
            temp1 = sayilar.get(i-1);
            while (temp1 > 0) {
                onaltilik_donusumler.add(temp1 % 16);
                temp1 /= 16;
            }
            System.out.print("İkilik taban: ");
            for (int j = ikilik_donusumler.size(); j > 0; j--) {
                System.out.print(ikilik_donusumler.get(j-1));
            }
            System.out.print(" -- Sekizlik taban: ");
            for (int j = sekizlik_donusumler.size(); j > 0; j--) {
                System.out.print(sekizlik_donusumler.get(j-1));
            }
            System.out.print(" -- Onaltılık taban: ");
            for (int j = onaltilik_donusumler.size(); j > 0; j--) { // 10=A - 11=B - 12=C - 13=D - 14=E - 15=F
                if (onaltilik_donusumler.get(j-1) == 10 && onaltilik_donusumler.size() >= 2) {
                    System.out.print("A");
                } else if (onaltilik_donusumler.get(j-1) == 11 && onaltilik_donusumler.size() >= 2) {
                    System.out.print("B");
                } else if (onaltilik_donusumler.get(j-1) == 12 && onaltilik_donusumler.size() >= 2) {
                    System.out.print("C");
                } else if (onaltilik_donusumler.get(j-1) == 13 && onaltilik_donusumler.size() >= 2) {
                    System.out.print("D");
                } else if (onaltilik_donusumler.get(j-1) == 14 && onaltilik_donusumler.size() >= 2) {
                    System.out.print("E");
                } else if (onaltilik_donusumler.get(j-1) == 15 && onaltilik_donusumler.size() >= 2) {
                    System.out.print("F");
                }else{
                    System.out.print(onaltilik_donusumler.get(j-1));
                }
            }
            System.out.println("\n");
            ikilik_donusumler.clear();
            sekizlik_donusumler.clear();
            onaltilik_donusumler.clear();
        }
    }
}