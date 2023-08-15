package com.example.danhsachbtvn;

public class Country {
    private String CountrySide;

    public Country(String countrySide) {
        CountrySide = countrySide;
    }

    public String getCountrySide() {
        return CountrySide;
    }

    public void setCountrySide(String countrySide) {
        CountrySide = countrySide;
    }

    @Override
    public String toString() {
        return CountrySide;
    }
}
