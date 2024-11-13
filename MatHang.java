package baitap.bai2;

public class MatHang {
    private float gia;
    private int matHangID;
    private int soLuong;
    private String tenMH;

    // Constructor
    public MatHang(int matHangID, String tenMH, int soLuong, float gia) {
        this.matHangID = matHangID;
        this.tenMH = tenMH;
        this.soLuong = soLuong;
        this.gia = gia;
    }

    // Getters and setters
    public float getGia() {
        return gia;
    }

    public void setGia(float gia) {
        this.gia = gia;
    }

    public int getMatHangID() {
        return matHangID;
    }

    public void setMatHangID(int matHangID) {
        this.matHangID = matHangID;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getTenMH() {
        return tenMH;
    }

    public void setTenMH(String tenMH) {
        this.tenMH = tenMH;
    }
}
