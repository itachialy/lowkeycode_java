package Demo_oop;

public class NVCX extends NhanVienVP {
    private double maXuong;
    private double type;
    public NVCX(double id, String name, int phone, String chucVu, double maXuong, double type) {
        super(id, name, phone, chucVu);
        this.maXuong = maXuong;
        this.type = type;
    }

    public double getMaXuong() {
        return maXuong;
    }

    public void setMaXuong(double maXuong) {
        this.maXuong = maXuong;
    }

    public double getType() {
        return type;
    }

    public void setType(double type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "NVCX{" +
                "maXuong=" + maXuong +
                ", type=" + type +
                '}';
    }
}
