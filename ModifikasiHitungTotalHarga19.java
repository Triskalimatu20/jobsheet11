import java.util.Scanner;
public class ModifikasiHitungTotalHarga19 {

    public static int hitungTotalHarga(int pilihanMenu, int banyakItem, String kodePromo) {
        int[] hargaItems = {15000, 20000, 22000, 10000, 18000};
        int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;

        if (kodePromo.equalsIgnoreCase("DISKON50")) {
            hargaTotal *= 0.5;
        } else if (kodePromo.equalsIgnoreCase("DISKON30")) {
            hargaTotal *= 0.7;
        } else if (!kodePromo.isEmpty()) {
            System.out.println("Kode promo tidak valid. Tidak ada diskon yang diberikan.");
        }

        return hargaTotal;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nMasukkan nomor menu yang ingin Anda pesan (1-5): ");
        int pilihanMenu = sc.nextInt();
        System.out.print("Masukkan jumlah item yang ingin dipesan: ");
        int banyakItem = sc.nextInt();
        System.out.print("Masukkan kode promo (jika ada): ");
        sc.nextLine();
        String kodePromo = sc.nextLine();
        int totalHarga = hitungTotalHarga(pilihanMenu, banyakItem, kodePromo);
        System.out.print("Total harga untuk pesanan Anda: Rp" + totalHarga);
        sc.close();
    }
}
    

