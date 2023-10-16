package com.example.class_practice;

import java.util.Date;

public class Student {
    private String sid;
    private String id;
    private Date birthday;

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getSocietyID() {
        return societyID;
    }

    public void setSocietyID(String societyID) {
        this.societyID = societyID;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getClassID() {
        return classID;
    }

    public void setClassID(String classID) {
        this.classID = classID;
    }

    public String getRoomID() {
        return roomID;
    }

    public void setRoomID(String roomID) {
        this.roomID = roomID;
    }

    private String gender;
    private String societyID;
    private String address;
    private String postcode;
    private String phone;
    private String school;
    private String classID;
    private String roomID;

    public Student(String sid, String id, Date birthday, String gender, String societyID, String address, String postcode, String phone, String school, String classID, String roomID) {
        this.sid = sid;
        this.id = id;
        this.birthday = birthday;
        this.gender = gender;
        this.societyID = societyID;
        this.address = address;
        this.postcode = postcode;
        this.phone = phone;
        this.school = school;
        this.classID = classID;
        this.roomID = roomID;
    }




}
