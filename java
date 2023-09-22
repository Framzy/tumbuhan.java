class Tanaman {
    String nama, jenis, warna;

    void biaya(int ppk, double hrg) {
        int pupuk = ppk;
        double harga = hrg;
        System.out.println("Perawatan: " + pupuk * harga);
    }
}

public class Main {
    public static void main(String[] args) {
        Tanaman tanaman = new Tanaman();
        tanaman.nama = "Mawar";
        tanaman.warna = "Merah";
        tanaman.jenis = "Berduri";

        System.out.println("Nama: " + tanaman.nama);
        System.out.println("Warna: " + tanaman.warna);
        System.out.println("Jenis: " + tanaman.jenis);
        tanaman.biaya(23, 12500);
        tanaman.biaya(10, 10000);
        tanaman.biaya(5, 12500);
    }
}
