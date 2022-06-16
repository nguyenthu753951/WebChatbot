package com.family.DTOpro;

import java.util.Date;

public class StaffDTO {
    private Long id;

    private String hoTenNV;

    private String gioiTinh;

    private String soDienThoai;

    private String chucVu;

    private Date ngaySinh;

    private String EmailNV;


    public String getEmailNV() {
        return EmailNV;
    }

    public void setEmailNV(String emailNV) {
        this.EmailNV = emailNV;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getHoTenNV() {
        return hoTenNV;
    }

    public void setHoTenNV(String hoTenNV) {
        this.hoTenNV = hoTenNV;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public StaffDTO(Long id, String hoTenNV, String gioiTinh, String soDienThoai, String chucVu, Date ngaySinh, String emailNV) {
        this.id = id;
        this.hoTenNV = hoTenNV;
        this.gioiTinh = gioiTinh;
        this.soDienThoai = soDienThoai;
        this.chucVu = chucVu;
        this.ngaySinh = ngaySinh;
        EmailNV = emailNV;
    }
    public StaffDTO(){
        super();
    }

}
