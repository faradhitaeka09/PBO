import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Pelanggan {
    private String namaDepan;
    private String namaBelakang;
    private String Nomor;

   private String fileName = "C:/Users/LENOVO/IdeaProjects/pelanggan/src/NamaPelanggan.txt";
    private boolean isDataAvailable = false;

    Pelanggan(String namaDepan, String namaBelakang, String nomor){
        this.namaDepan = namaDepan;
        this.namaBelakang = namaBelakang;
        this.Nomor = nomor;
    }

    public void setNamaDepan (String namaDepan){
        this.namaDepan = namaDepan;
    }

    public void setNamaBelakang (String namaBelakang){
        this.namaBelakang = namaBelakang;
    }

    public void setNomor(String nomor) {
        Nomor = nomor;
    }

    public String getNomor() {
        return Nomor;
    }

    public String getNamaLengkap (){

        String namaLengkap = namaDepan.concat (" "+namaBelakang);
        return namaLengkap;
    }

    public void cekData() {
        try {
            // Membaca isi file
            BufferedReader reader = new BufferedReader(new FileReader(fileName));

            String line;

            String newData = getNamaLengkap()+", "+getNomor();

            while ((line = reader.readLine()) != null) {
                if (line.equals(newData)) {
                    isDataAvailable = true;
                    break;
                }
            }

            reader.close();

            // Menambahkan data baru jika tidak ada data yang sama
            if (!isDataAvailable) {
                BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
                writer.write(getNamaLengkap()+", "+getNomor());
                writer.newLine();
                writer.close();
                System.out.println("\nAnda berhasil Terdaftar.\n");
            } else {
                System.out.println("\nAnda sudah pernah Terdaftar.\n");
            }

        } catch (IOException e) {
            System.out.println("file tidak tersedia : " + e.getMessage());
        }
    }

