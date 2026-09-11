import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nama anda: ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan NIM anda: ");
        int NIM = scanner.nextInt();

        System.out.print("Masukkan umur anda: ");
        int umur = scanner.nextInt();

        System.out.print("Masukkan tinggi anda: ");
        double tinggi = scanner.nextDouble();

        scanner.nextLine();

        System.out.print("Masukkan asal kota anda: ");
        String asal_kota = scanner.nextLine();

        System.out.println("Halo! Nama saya " + nama + " (NIM " + NIM + "), umur " + umur + " tahun,");
        System.out.println("tinggi " + tinggi + " cm, berasal dari " + asal_kota + "." );



    }
    }
