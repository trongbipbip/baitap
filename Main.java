package baitap.bai2;

public class Main {
    public static void main(String[] args) {
        // Tạo khách hàng
        KhachHang khachHang = new KhachHang(1, "Nguyễn Văn A", "123 Đường ABC");

        // Tạo các mặt hàng
        MatHang matHangX = new MatHang(1, "X", 100, 50.0f);
        MatHang matHangY = new MatHang(2, "Y", 200, 30.0f);
        MatHang matHangZ = new MatHang(3, "Z", 150, 20.0f);

        // Tạo hóa đơn và thêm mặt hàng vào hóa đơn
        HoaDon hoaDon = new HoaDon(1, khachHang, "2024-11-13");

        MatHangMua mhMua1 = new MatHangMua(1, matHangX, 2, hoaDon);
        MatHangMua mhMua2 = new MatHangMua(2, matHangY, 3, hoaDon);

        hoaDon.themMatHang(mhMua1);
        hoaDon.themMatHang(mhMua2);

        // In thông tin hóa đơn
        hoaDon.inHoaDon();
    }
}

