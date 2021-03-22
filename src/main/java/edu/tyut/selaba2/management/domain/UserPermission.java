package edu.tyut.selaba2.management.domain;

public class UserPermission {

    // 列名常量
    public final static String ROOT_PERMISSION_COL  = "root_permission";
    public final static String DEPT_PERMISSION_COL  = "dept_absolute_permission";
    public final static String GROUP_PERMISSION_COL = "group_absolute_permission";
    public final static String SELF_PERMISSION_COL  = "self_absolute_permission";
    public final static String GUEST_PERMISSION_COL = "guest_permission";
    public final static String NEWS_EDIT_PERMISSION_COL = "news_edit_permission";

    // 权限属性
    private Long userId;
    private Boolean ROOT_PERMISSION;
    private Boolean DEPT_PERMISSION;
    private Boolean GROUP_PERMISSION;
    private Boolean SELF_PERMISSION;
    private Boolean GUEST_PERMISSION;
    private Boolean NEWS_EDIT_PERMISSION;

    public UserPermission() {
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Boolean getROOT_PERMISSION() {
        return ROOT_PERMISSION;
    }

    public void setROOT_PERMISSION(Boolean ROOT_PERMISSION) {
        this.ROOT_PERMISSION = ROOT_PERMISSION;
    }

    public Boolean getDEPT_PERMISSION() {
        return DEPT_PERMISSION;
    }

    public void setDEPT_PERMISSION(Boolean DEPT_PERMISSION) {
        this.DEPT_PERMISSION = DEPT_PERMISSION;
    }

    public Boolean getGROUP_PERMISSION() {
        return GROUP_PERMISSION;
    }

    public void setGROUP_PERMISSION(Boolean GROUP_PERMISSION) {
        this.GROUP_PERMISSION = GROUP_PERMISSION;
    }

    public Boolean getSELF_PERMISSION() {
        return SELF_PERMISSION;
    }

    public void setSELF_PERMISSION(Boolean SELF_PERMISSION) {
        this.SELF_PERMISSION = SELF_PERMISSION;
    }

    public Boolean getGUEST_PERMISSION() {
        return GUEST_PERMISSION;
    }

    public void setGUEST_PERMISSION(Boolean GUEST_PERMISSION) {
        this.GUEST_PERMISSION = GUEST_PERMISSION;
    }

    public Boolean getNEWS_EDIT_PERMISSION() {
        return NEWS_EDIT_PERMISSION;
    }

    public void setNEWS_EDIT_PERMISSION(Boolean NEWS_EDIT_PERMISSION) {
        this.NEWS_EDIT_PERMISSION = NEWS_EDIT_PERMISSION;
    }
}
