public class Menu {

    private int harga[] = {10000, 20000, 30000};

    public void TampilMenu() {



        String[] NamaProduk = new String[3];
        NamaProduk[0] = "Kopi ";
        NamaProduk[1] = "teh";
        NamaProduk[2] = "titanium";

        System.out.println("================= MENU ==================");
        System.out.println("=========================================");
        System.out.println("1. "+NamaProduk[0]+" \t|| harga : "+harga[0]);
        System.out.println("2. "+NamaProduk[1]+" \t\t|| harga : "+harga[1]);
        System.out.println("3. "+NamaProduk[2]+" \t|| harga : "+harga[2]);
        System.out.println(" - - - - - 0 to check out - - - - - - - -");
        System.out.println("=========================================");
    }

    public int[] getHarga() {
        return harga;
    }
}
