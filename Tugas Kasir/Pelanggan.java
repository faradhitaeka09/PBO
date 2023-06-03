import java.util.Random;

public class Pelanggan {
    private String namaDepan;
    private String namaBelakang;


    Pelanggan(String namaDepan, String namaBelakang){
        this.namaDepan = namaDepan;
        this.namaBelakang = namaBelakang;
    }

    public void setNamaDepan (String namaDepan){
        this.namaDepan = namaDepan;
    }

    public void setNamaBelakang (String namaBelakang){
        this.namaBelakang = namaBelakang;
    }

    public String getNamaLengkap (){
        this.namaBelakang = " " +namaBelakang;
        String namaLengkap = namaDepan.concat (namaBelakang);
        return namaLengkap;
    }

    public String generalPassword (){
        Random rnd = new Random();
        int randomNumber = rnd.nextInt(100);
        String password = this.namaDepan+randomNumber;
        return password;

    }
}



