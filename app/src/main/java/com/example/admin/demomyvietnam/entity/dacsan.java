package com.example.admin.demomyvietnam.entity;

import android.os.Parcel;
import android.os.Parcelable;

public class dacsan implements Parcelable{
    private int id;
    private String ten;
    private String gia;
    private byte [] hinh;

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

    public String getGia() {
        return gia;
    }

    public void setGia(String gia) {
        this.gia = gia;
    }

    public byte[] getHinh() {
        return hinh;
    }

    public void setHinh(byte[] hinh) {
        this.hinh = hinh;
    }

    public static Creator<dacsan> getCREATOR() {
        return CREATOR;
    }

    public dacsan(int id, String ten, String gia, byte[] hinh) {
        this.id = id;
        this.ten = ten;
        this.gia = gia;
        this.hinh = hinh;
    }

    protected dacsan(Parcel in) {
        id = in.readInt();
        ten = in.readString();
        gia = in.readString();
        hinh = in.createByteArray();
    }

    public static final Creator<dacsan> CREATOR = new Creator<dacsan>() {
        @Override
        public dacsan createFromParcel(Parcel in) {
            return new dacsan(in);
        }

        @Override
        public dacsan[] newArray(int size) {
            return new dacsan[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(id);
        parcel.writeString(ten);
        parcel.writeString(gia);
        parcel.writeByteArray(hinh);
    }
}
