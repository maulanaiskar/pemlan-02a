import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        KelasKonversi k = new KelasKonversi();
        System.out.println("\tMengubah teks menjadi bilangan dan input bilangan menjadi teks");
        System.out.println("\t==============================================================");
        System.out.print("Masukan terbilang : ");
        String satuan = in.nextLine();
        System.out.print("Hasil Konversi : ");k.overloadingMeth(satuan);
        System.out.println();
        System.out.print("Masukan angka : ");
        int angka  = in.nextInt();
        System.out.println("Hasil Konversi : " + k.overloadingMeth(angka));
    }
}

