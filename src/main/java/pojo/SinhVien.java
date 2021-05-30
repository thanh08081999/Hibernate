package pojo;

public class SinhVien {
	private String maSinhVien;
	private String tenSinhVien;
	private String tenLop;
	private String gioiTinh;

	public SinhVien(){
	}
	public SinhVien(String maSinhVien, String tenSinhVien, String tenLop, String gioiTinh){
		this.maSinhVien = maSinhVien;
		this.tenSinhVien = tenSinhVien;
		this.tenLop = tenLop;
		this.gioiTinh = gioiTinh;
	}

    public String getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public String getTenSinhVien() {
        return tenSinhVien;
    }

    public void setTenSinhVien(String tenSinhVien) {
        this.tenSinhVien = tenSinhVien;
    }

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }
        
}