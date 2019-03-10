package com.example.admin.demomyvietnam.entity;

import android.os.Parcel;
import android.os.Parcelable;

public class camnang implements Parcelable{
    private int id;
    private String ten;
    private String noidung;

    public camnang(int id, String ten, String noidung) {
        this.id = id;
        this.ten = ten;
        this.noidung = noidung;
    }

    public camnang(String ten, String noidung) {
        this.ten = ten;
        this.noidung = noidung;
    }

    protected camnang(Parcel in) {
        id = in.readInt();
        ten = in.readString();
        noidung = in.readString();
    }

    public static final Creator<camnang> CREATOR = new Creator<camnang>() {
        @Override
        public camnang createFromParcel(Parcel in) {
            return new camnang(in);
        }

        @Override
        public camnang[] newArray(int size) {
            return new camnang[size];
        }
    };

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getNoidung() {
        return noidung;
    }

    public void setNoidung(String noidung) {
        this.noidung = noidung;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(id);
        parcel.writeString(ten);
        parcel.writeString(noidung);
    }
}
