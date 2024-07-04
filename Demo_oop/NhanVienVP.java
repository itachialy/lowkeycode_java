package Demo_oop;

public abstract class NhanVienVP {
    private double id;
    private String name;
    private int phone;
    private String chucVu;

    public NhanVienVP(double id, String name, int phone, String chucVu) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.chucVu = chucVu;
    }

    public double getId() {
        return id;
    }

    public void setId(double id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }

    @Override
    public String toString() {
        return "NhanVien{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone=" + phone +
                ", chucVu='" + chucVu + '\'' +
                '}';
    }
}
