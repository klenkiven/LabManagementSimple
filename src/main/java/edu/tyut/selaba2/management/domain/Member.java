package edu.tyut.selaba2.management.domain;

import java.sql.Timestamp;
import java.util.Date;

/**
 * 关于成员信息的一个类
 */
public class Member {

    // 必须属性
    private Long    memberId;
    private String  avatar;      // 注意这里的avatar指的是UUID
    private String  labGroup;
    private String  password;
    private String  nickname;
    private String  name;
    private Byte    sex;
    private Byte    fingerId = 0;
    private String  email;
    private Long    phoneNum;
    private String  address;
    private Date    birthday;

    // 进入运行环境时产生
    private Boolean isWorking;
    private String  loginIpAddr;
    private Date lastLoginDate;

    // 以下为可选选项
    private String  email2;
    private Long    phone2;
    private String  address2;

    // 权限控制
    private UserPermission permissions;

    public Member() {
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getLabGroup() {
        return labGroup;
    }

    public void setLabGroup(String labGroup) {
        this.labGroup = labGroup;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Byte getSex() {
        return sex;
    }

    public void setSex(Byte sex) {
        this.sex = sex;
    }

    public Byte getFingerId() {
        return fingerId;
    }

    public void setFingerId(Byte fingerId) {
        this.fingerId = fingerId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(Long phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLoginIpAddr() {
        return loginIpAddr;
    }

    public void setLoginIpAddr(String loginIpAddr) {
        this.loginIpAddr = loginIpAddr;
    }

    public Date getLastLoginDate() {
        return lastLoginDate;
    }

    public void setLastLoginDate(Date lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }

    public String getEmail2() {
        return email2;
    }

    public void setEmail2(String email2) {
        this.email2 = email2;
    }

    public Long getPhone2() {
        return phone2;
    }

    public void setPhone2(Long phone2) {
        this.phone2 = phone2;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public Boolean getWorking() {
        return isWorking;
    }

    public void setWorking(Boolean working) {
        isWorking = working;
    }

    public UserPermission getPermissions() {
        return permissions;
    }

    public void setPermissions(UserPermission permissions) {
        this.permissions = permissions;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
