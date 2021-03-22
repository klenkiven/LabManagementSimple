package edu.tyut.selaba2.management.domain;

public class Guest {
    private Long guestId;
    private String name;
    private Long phoneNum;
    private UserPermission permissions;

    public Guest() {
    }

    public Long getGuestId() {
        return guestId;
    }

    public void setGuestId(Long guestId) {
        this.guestId = guestId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(Long phoneNum) {
        this.phoneNum = phoneNum;
    }

    public UserPermission getPermissions() {
        return permissions;
    }

    public void setPermissions(UserPermission permissions) {
        this.permissions = permissions;
    }
}
