package pojo;

import java.util.Date;

public class DSHocKi {
    private String tenHocKi;
    private String namHoc;
    private Date ngayBD;
    private Date ngayKT;

    public DSHocKi() {
    }

    public DSHocKi(String tenHocKi, String namHoc, Date ngayBD, Date ngayKT) {
        this.tenHocKi = tenHocKi;
        this.namHoc = namHoc;
        this.ngayBD = ngayBD;
        this.ngayKT = ngayKT;
    }

    public String getTenHocKi() {
        return tenHocKi;
    }

    public void setTenHocKi(String tenHocKi) {
        this.tenHocKi = tenHocKi;
    }

    public String getNamHoc() {
        return namHoc;
    }

    public void setNamHoc(String namHoc) {
        this.namHoc = namHoc;
    }

    public Date getNgayBD() {
        return ngayBD;
    }

    public void setNgayBD(Date ngayBD) {
        this.ngayBD = ngayBD;
    }

    public Date getNgayKT() {
        return ngayKT;
    }

    public void setNgayKT(Date ngayKT) {
        this.ngayKT = ngayKT;
    }
    
    
}