package baitap.bai2;

import java.util.ArrayList;
import java.util.List;

public class HoaDon {
    private int hoaDonID;
    private KhachHang kh;
    private String ngayBan;
    private float tongTien;
    private List<MatHangMua> danhSachMatHang = new ArrayList<>();

    // Constructor
    public HoaDon(int hoaDonID, KhachHang kh, String ngayBan) {
        this.hoaDonID = hoaDonID;
        this.kh = kh;
        this.ngayBan = ngayBan;
    }

    // Thêm mặt hàng vào hóa đơn
    public void themMatHang(MatHangMua matHangMua) {
        danhSachMatHang.add(matHangMua);
        tongTien += matHangMua.getThanhTien();
    }

    // In thông tin hóa đơn
    public void inHoaDon() {
        System.out.println("Hóa đơn ID: " + hoaDonID);
        System.out.println("Khách hàng: " + kh.getTenKH());
        System.out.println("Ngày bán: " + ngayBan);
        System.out.println("Danh sách mặt hàng:");

        for (MatHangMua mhMua : danhSachMatHang) {
            MatHang mh = mhMua.getMatHang();
            System.out.println(" - Tên mặt hàng: " + mh.getTenMH() +
                               ", Số lượng mua: " + mhMua.getSoLuongMua() +
                               ", Đơn giá: " + mh.getGia() +
                               ", Thành tiền: " + mhMua.getThanhTien());
        }

        System.out.println("Tổng tiền: " + tongTien);
    }
}
