package edu.tyut.selaba2.management.mapper;

import edu.tyut.selaba2.management.domain.UserPermission;

import java.util.List;

/**
 * 成员权限信息管理
 *
 * @author KlenKiven
 */
public interface UserPermissionMapper {

    /**
     * 通过用户的ID检索用户的权限信息
     *
     * @param ID 用户ID（这里一般就是MemberID 和 GuestID 的合集，这两个ID一定是唯一的）
     * @return 用户权限POJO
     */
    public UserPermission selectUserPermissionByID(Long ID);

    /**
     * 通过权限查看用户的IDs
     *
     * @param permissionName 权限名
     * @return 用户ID集合
     */
    public List<Long> selectUserIDByPermission(String permissionName);

    /**
     * 检索所有用户的权限信息
     *
     * @return 所有的用户及其权限信息
     */
    public List<UserPermission> selectAllUserPermission();

    /**
     * 修改指定用户权限
     *
     * @param permission 用户权限对象
     * @return 是否成功
     */
    public Boolean updateUserPermission(UserPermission permission);

    /**
     * 通过用户ID清除用户权限
     *
     * @param userId 用户ID
     * @return 是否成功
     */
    public Boolean clearUserPermissionByID(Long userId);

    /**
     * 通过用户ID删除指定用户的权限信息
     *
     * @param userId 用户ID
     * @return 是否成功
     */
    public Boolean deleteUserPermissionByID(Long userId);

    /**
     * 通过用户ID列表删除用户权限信息
     *
     * @param userIds 用户ID列表
     * @return 成功删除用户个数
     */
    public int deleteUserPermissionByIDs(Long[] userIds);

    /**
     * 创建一个带有默认权限的用户
     *
     * @param userId 用户ID
     * @return 是否成功
     */
    public Boolean insertDefaultUserPermissionByID(Long userId);
}
