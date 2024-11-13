package baitap.bai2;

public class MatHangMua {
    private HoaDon hd;
    private MatHang mh;
    private int matHangMuaID;
    private int soLuongMua;

    // Constructor
    public MatHangMua(int matHangMuaID, MatHang mh, int soLuongMua, HoaDon hd) {
        this.matHangMuaID = matHangMuaID;
        this.mh = mh;
        this.soLuongMua = soLuongMua;
        this.hd = hd;
    }

    // Thêm mặt hàng vào hóa đơn
    public float getThanhTien() {
        return mh.getGia() * soLuongMua;
    }

    public MatHang getMatHang() {
        return mh;
    }

    public int getSoLuongMua() {
        return soLuongMua;
    }
}
