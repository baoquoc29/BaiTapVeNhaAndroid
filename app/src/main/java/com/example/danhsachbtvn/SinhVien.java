package com.example.danhsachbtvn;

public class SinhVien {
    private String msv;
    private String name;
    private String address;
    private String country;

    public SinhVien(String msv, String name, String address, String country) {
        this.msv = msv;
        this.name = name;
        this.address = address;
        this.country = country;
    }
    public SinhVien(String msv){
        this.msv = msv;
    }

    public String getMsv() {
        return msv;
    }

    public void setMsv(String msv) {
        this.msv = msv;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return msv + " " + name + " " + address + " " + country;
    }
}
