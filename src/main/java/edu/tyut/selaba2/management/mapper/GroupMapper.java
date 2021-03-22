package edu.tyut.selaba2.management.mapper;

import edu.tyut.selaba2.management.domain.Group;

import java.util.List;

/**
 * 用户组管理
 *
 * @author KlenKiven
 */
public interface GroupMapper {

    /**
     * 检索所有组的信息
     *
     * @return 返回一个所有组的列表
     */
    public List<Group> selectAllGroupsList();

    /**
     * 检索指定组的信息
     *
     * @param groupName 指定组名
     * @return 返回指定组的信息
     */
    public Group selectGroupByName(String groupName);

    /**
     * 修改组的信息
     *
     * @param group 组信息
     * @return 是否成功
     */
    public Boolean updateGroup(Group group);

    /**
     * 插入指定的一个组
     *
     * @param group 插入组的信息
     * @return 返回成功与否
     */
    public Boolean insertGroup(Group group);

    /**
     * 删除指定名字的组
     *
     * @param groupName 组名
     * @return 是否成功
     */
    public Boolean deleteGroupByName(String groupName);
}
