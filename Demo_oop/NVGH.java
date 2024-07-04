package Demo_oop;

public class NVGH extends NhanVienVP {
    private String loaiXe;
    public NVGH(double id, String name, int phone, String chucVu, String loaiXe) {
        super(id, name, phone, chucVu);
        this.loaiXe = loaiXe;
    }

    public String getLoaiXe() {
        return loaiXe;
    }

    public void setLoaiXe(String loaiXe) {
        this.loaiXe = loaiXe;
    }

    @Override
    public String toString() {
        return "NVGH{" +
                "loaiXe='" + loaiXe + '\'' +
                '}';
    }
}
