package pojo;

import java.util.Date;

public class DSSVDKHP {
    private String maSinhVien;
    private String tenSinhVien;
    private String maMonHoc;
    private String tenMonHoc;
    private String giaoVien;
    private String ca;
    private Date thoiGianDKHP;

    public DSSVDKHP() {
    }

    public DSSVDKHP(String maSinhVien, String tenSinhVien, String maMonHoc, String tenMonHoc, String giaoVien, String ca, Date thoiGianDKHP) {
        this.maSinhVien = maSinhVien;
        this.tenSinhVien = tenSinhVien;
        this.maMonHoc = maMonHoc;
        this.tenMonHoc = tenMonHoc;
        this.giaoVien = giaoVien;
        this.ca = ca;
        this.thoiGianDKHP = thoiGianDKHP;
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

    public String getGiaoVien() {
        return giaoVien;
    }

    public void setGiaoVien(String giaoVien) {
        this.giaoVien = giaoVien;
    }

    public String getCa() {
        return ca;
    }

    public void setCa(String ca) {
        this.ca = ca;
    }

    public Date getThoiGianDKHP() {
        return thoiGianDKHP;
    }

    public void setThoiGianDKHP(Date thoiGianDKHP) {
        this.thoiGianDKHP = thoiGianDKHP;
    }
    
    
}