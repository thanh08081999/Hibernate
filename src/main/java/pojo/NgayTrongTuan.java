package pojo;

public class NgayTrongTuan {
    private String idThu;
    private String tenThu;

    public NgayTrongTuan() {
    }

    public NgayTrongTuan(String idThu, String tenThu) {
        this.idThu = idThu;
        this.tenThu = tenThu;
    }

    public String getIdThu() {
        return idThu;
    }

    public void setIdThu(String idThu) {
        this.idThu = idThu;
    }

    public String getTenThu() {
        return tenThu;
    }

    public void setTenThu(String tenThu) {
        this.tenThu = tenThu;
    }
    
    
}