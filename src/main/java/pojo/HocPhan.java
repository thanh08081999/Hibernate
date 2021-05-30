package pojo;

public class HocPhan {
	private String maMonHoc;
	private String tenMonHoc;
	private int soTinChi;
	private String giaoVienLT;
	private String phongHoc;
	private String thu;
	private String ca;
	private int soSlot;

	public HocPhan(){}
	public HocPhan(String maMonHoc, String tenMonHoc, int soTinChi, String giaoVienLT, String phongHoc, String thu, String ca, int soSlot){
		this.maMonHoc = maMonHoc;
		this.tenMonHoc = tenMonHoc;
		this.soTinChi = soTinChi;
		this.giaoVienLT = giaoVienLT;
		this.phongHoc = phongHoc;
		this.thu = thu;
		this.ca = ca;
		this.soSlot = soSlot;
	}

    public String getMaMonHoc() {
        return maMonHoc;
    }

    public void setMaMonHoc(String maMonHoc) {
        this.maMonHoc = maMonHoc;
    }

    public String getTenMonHoc() {
        return tenMonHoc;
    }

    public void setTenMonHoc(String tenMonHoc) {
        this.tenMonHoc = tenMonHoc;
    }

    public int getSoTinChi() {
        return soTinChi;
    }

    public void setSoTinChi(int soTinChi) {
        this.soTinChi = soTinChi;
    }

    public String getGiaoVienLT() {
        return giaoVienLT;
    }

    public void setGiaoVienLT(String giaoVienLT) {
        this.giaoVienLT = giaoVienLT;
    }

    public String getPhongHoc() {
        return phongHoc;
    }

    public void setPhongHoc(String phongHoc) {
        this.phongHoc = phongHoc;
    }

    public String getThu() {
        return thu;
    }

    public void setThu(String thu) {
        this.thu = thu;
    }

    public String getCa() {
        return ca;
    }

    public void setCa(String ca) {
        this.ca = ca;
    }

    public int getSoSlot() {
        return soSlot;
    }

    public void setSoSlot(int soSlot) {
        this.soSlot = soSlot;
    }
}