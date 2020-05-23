package com.example.parcelablemedium;

import android.os.Parcel;
import android.os.Parcelable;

public class Student implements Parcelable {

    private int rollno;
    private String name;
    private int age;

    protected Student(Parcel in) {

        age=in.readInt();
        name=in.readString();
        age=in.readInt();
    }
    public Student(int age,String name,int rollno){

      this.age=age;
      this.name=name;
      this.rollno=rollno;
    }

    public static final Creator<Student> CREATOR = new Creator<Student>() {
        @Override
        public Student createFromParcel(Parcel in) {
            return new Student(in);
        }

        @Override
        public Student[] newArray(int size) {
            return new Student[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int flags) {
     parcel.writeInt(age);
     parcel.writeString(name);
     parcel.writeInt(rollno);
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static Creator<Student> getCREATOR() {
        return CREATOR;
    }
}
