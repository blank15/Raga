package id.dilo.raga.model;


public class DataMerchandise {

    private int img_merchandise;
    private String nama_merchandise;
    private String harga;

    public DataMerchandise(int img_merchandise, String nama_merchandise, String harga) {
        this.img_merchandise = img_merchandise;
        this.nama_merchandise = nama_merchandise;
        this.harga = harga;
    }

    public int getImg_merchandise() {
        return img_merchandise;
    }

    public String getNama_merchandise() {
        return nama_merchandise;
    }

    public String getHarga() {
        return harga;
    }
}





