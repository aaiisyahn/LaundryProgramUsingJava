//Implementasi Abstract Class
//berisi variabel harga-harga layanan laundry
abstract class AbstractLaundry {
    //implementasi Enkapsulasi melalui penggunaan access modifier
    protected double hargaCuci = 10000;
    protected double hargaSetrika = 7000;
    protected double hargaKB = 10000;
    protected double hargaCR = 10000;
    protected double hargaJJ = 15000;
    protected double hargaKG = 20000;
    protected double hargaSB = 25000;

    protected double hitungTotalCuci(double berat) {
        return berat * hargaCuci;
    }

    protected double hitungTotalSetrika(double berat) {
        return berat * hargaSetrika;
    }
}

