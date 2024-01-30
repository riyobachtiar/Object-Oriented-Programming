/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;

/**
 *
 * @author USER
 */
public class PilihanPaketToko {
    public String KodePaket, Spesifikasi;
    public int Harga;

    public String getKodePaket() {
        return KodePaket;
    }

    public void setKodePaket(String KodePaket) {
        this.KodePaket = KodePaket;
    }

    public String getSpesifikasi() {
        return Spesifikasi;
    }

    public void setSpesifikasi(String Spesifikasi) {
        this.Spesifikasi = Spesifikasi;
    }

    public int getHarga() {
        return Harga;
    }

    public void setHarga(int Harga) {
        this.Harga = Harga;
    }
    public void pilih(String KodePaket){
        this.KodePaket=KodePaket;
        if(KodePaket.equalsIgnoreCase("PAKET PC 1"))
        {
            Spesifikasi="CPU : Intel Core i3-10100"
                    + "\n"
                    +   "RAM : 8GB DDR4 3200MHz"
                    + "\n"
                    +   "GPU : NVIDIA GTX 1080";
            Harga=6000000;
        }
        else if(KodePaket.equalsIgnoreCase("PAKET PC 2"))
        {
            Spesifikasi="CPU : AMD Ryzen 5 5600XT"
                    + "\n"
                    +   "RAM : 16GB DDR4 3600MHz"
                    + "\n"
                    +   "GPU : AMD Radeon 6700XT";
            Harga=10000000;
        }
        else if(KodePaket.equalsIgnoreCase("PAKET PC 3"))
        {
            Spesifikasi="CPU : AMD Ryzen 9 5950XT"
                    + "\n"
                    +   "RAM : 32GB DDR4 3600MHz"
                    + "\n"
                    +   "GPU : NVDIA RTX 3080";
            Harga=30000000;
        }
        else
        {
            Spesifikasi="";
            Harga=0;
        }
    }
}
