import java.util.Scanner;

public class KasirKopiDriver {
    public static void main(String[] args) {


        Menu menu = new Menu();
        Kasir kasir = new Kasir();
        Pelanggan pelanggan = new Pelanggan(null,null);



        Scanner input = new Scanner(System.in);


        int PilihMenu;
        String[] NamaProduk = new String[3];
        NamaProduk[0] = "Kopi ";
        NamaProduk[1] = "teh";
        NamaProduk[2] = "titanium ";

        System.out.print("masukan nama depan : ");
        String NamaDepan = input.nextLine();
        pelanggan.setNamaDepan(NamaDepan);

        System.out.print("masukan nama belakang : ");
        String NamaBelakang = input.nextLine();
        pelanggan.setNamaBelakang(NamaBelakang);

        menu.TampilMenu();

        do {
            System.out.print("Pilih menu : ");
            PilihMenu = input.nextInt();
            switch (PilihMenu) {
                case 1:{
                    PilihMenu--;
                    System.out.println(NamaProduk[PilihMenu]+" || harga : "+menu.getHarga()[PilihMenu]);
                    System.out.print("masukan Jumlah : ");
                    int jumlah = input.nextInt();
                    kasir.setTotalHarga(jumlah * menu.getHarga()[PilihMenu]);
                    int Pesan = jumlah * menu.getHarga()[PilihMenu];
                    System.out.println("Harga : "+Pesan);
                    PilihMenu++;
                    break;
                }
                case 2:{
                    PilihMenu--;
                    System.out.println(NamaProduk[PilihMenu]+" || harga : "+menu.getHarga()[PilihMenu]);
                    System.out.print("masukan Jumlah : ");
                    int jumlah = input.nextInt();
                    kasir.setTotalHarga(jumlah * menu.getHarga()[PilihMenu]);
                    int Pesan = jumlah * menu.getHarga()[PilihMenu];
                    System.out.println("Harga : "+Pesan);
                    PilihMenu++;
                    break;
                }
                case 3:{
                    PilihMenu--;
                    System.out.println(NamaProduk[PilihMenu]+" || harga : "+menu.getHarga()[PilihMenu]);
                    System.out.print("masukan Jumlah : ");
                    int jumlah = input.nextInt();
                    kasir.setTotalHarga(jumlah * menu.getHarga()[PilihMenu]);
                    int Pesan = jumlah * menu.getHarga()[PilihMenu];
                    System.out.println("Harga : "+Pesan);
                    PilihMenu++;
                    break;
                }
                case 0:{
                    break;
                }
                default:{
                    System.out.println("menu tidak tersedia");
                    break;
                }
            }
        } while (PilihMenu != 0);


        System.out.println("total harga : "+kasir.getTotalHarga());

        System.out.println("=========================================");

        System.out.print("masukan pembayaran : ");
        int Pembayaran = input.nextInt();

        System.out.println("=========================================");

        if (Pembayaran < kasir.getTotalHarga()) {
            System.out.println("uang anda kurang kak "+pelanggan.getNamaLengkap()+"terimakasih, pesanan anda gagal :) jgn protes ");
        } else {
            int kembalian;
            kembalian = Pembayaran - kasir.getTotalHarga();
            System.out.println("terimakasih sudah memesan di kedai kami kak "+pelanggan.getNamaLengkap()+" ini kembalian mu : "+kembalian);
        }


    }
}
