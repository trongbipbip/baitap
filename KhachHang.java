package baitap.bai2;

public class KhachHang {
    private String diaChi;
    private int khachHangID;
    private String tenKH;

    // Constructor
    public KhachHang(int khachHangID, String tenKH, String diaChi) {
        this.khachHangID = khachHangID;
        this.tenKH = tenKH;
        this.diaChi = diaChi;
    }

    // Getters and setters
    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public int getKhachHangID() {
        return khachHangID;
    }

    public void setKhachHangID(int khachHangID) {
        this.khachHangID = khachHangID;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }
}

