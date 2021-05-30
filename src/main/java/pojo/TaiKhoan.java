package pojo;

public class TaiKhoan {
	private String taiKhoan;
	private String matKhau;
	private String chucDanh;
	private String soDienThoai;
	private String email;

	public TaiKhoan(){}
	public TaiKhoan(String taiKhoan, String matKhau, String chucDanh, String soDienThoai, String email){
		this.taiKhoan = taiKhoan;
		this.matKhau = matKhau;
		this.chucDanh = chucDanh;
		this.soDienThoai = soDienThoai;
		this.email = email;
	}

    public String getTaiKhoan() {
        return taiKhoan;
    }

    public void setTaiKhoan(String taiKhoan) {
        this.taiKhoan = taiKhoan;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public String getChucDanh() {
        return chucDanh;
    }

    public void setChucDanh(String chucDanh) {
        this.chucDanh = chucDanh;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
        
}