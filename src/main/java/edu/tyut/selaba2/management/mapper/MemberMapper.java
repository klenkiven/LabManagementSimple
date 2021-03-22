package edu.tyut.selaba2.management.mapper;

import edu.tyut.selaba2.management.domain.Member;

import java.util.List;

/**
 * 成员管理数据层
 *
 * @author KlenKiven
 */
public interface MemberMapper {
    /**
     * 列出所有成员的信息表
     *
     * @return 成员信息列表
     */
    public List<Member> selectAllMembersList();

    /**
     * 列出正在工作的成员列表
     *
     * @return 成员信息列表
     */
    public List<Member> selectWorkingMemberList();

    /**
     * 根据部门，列出部门所在的所有成员
     *
     * @param departmentName 部门的名字
     * @return 成员信息列表
     */
    // TODO 待测试，其中的SQL并没有合适的数据样本
    public List<Member> selectDepartmentMembersList(String departmentName);

    /**
     * 根据小组，列出所在部门所有成员
     *
     * @param groupName 小组名字
     * @return 成员信息列表
     */
    public List<Member> selectGroupMembersList(String groupName);

    /**
     * 通过成员ID查询成员
     *
     * @param memberId 成员ID
     * @return 成员信息列表
     */
    public Member selectMemberByID(Long memberId);

    /**
     * 通过成员电邮查询成员
     *
     * @param memberEmail 成员电邮
     * @return 成员信息
     */
    public Member selectMemberByEmail(String memberEmail);

    /**
     * 通过成员手机号码查询成员
     *
     * @param memberPhoneNum 成员手机号码
     * @return 成员信息
     */
    public Member selectMemberByPhoneNum(Long memberPhoneNum);

    /**
     * 插入成员信息（必须的插入项）
     *
     * @param member 成员信息
     * @return 是否成功
     */
    public Boolean insertMember(Member member);

    /**
     * 更新成员信息（任何信息）
     *
     * @param member 成员信息
     * @return 是够成功
     */
    public Boolean updateMember(Member member);

    /**
     * 根据成员的ID删除某个用户
     *
     * @param memberId 用户ID
     * @return 删除行数
     */
    public Boolean deleteMemberByID(Long memberId);

    /**
     * 根据用户ID的数组，删除多个用户
     *
     * @param memberIds 多用户的ID数组
     * @return 删除的行数
     */
    public int deleteMemberByIDs(Long[] memberIds);
}
