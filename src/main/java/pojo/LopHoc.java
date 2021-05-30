package pojo;

public class LopHoc {
	private String tenLop;
	private int tongSinhVien;
	private int tongNam;
	private int tongNu;

	public LopHoc(){}
	public LopHoc(String tenLop, int tongSinhVien, int tongNam, int tongNu){
		this.tenLop = tenLop;
		this.tongSinhVien = tongSinhVien;
		this.tongNam = tongNam;
		this.tongNu = tongNu;
	}

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    public int getTongSinhVien() {
        return tongSinhVien;
    }

    public void setTongSinhVien(int tongSinhVien) {
        this.tongSinhVien = tongSinhVien;
    }

    public int getTongNam() {
        return tongNam;
    }

    public void setTongNam(int tongNam) {
        this.tongNam = tongNam;
    }

    public int getTongNu() {
        return tongNu;
    }

    public void setTongNu(int tongNu) {
        this.tongNu = tongNu;
    }
}