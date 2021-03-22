package edu.tyut.selaba2.management.mapper;

import edu.tyut.selaba2.management.domain.Department;

import java.util.List;

/**
 * 实验室部门Mapper
 *
 * @author KlenKiven
 */
public interface DepartmentMapper {

    /**
     * 查询所有部门的信息
     *
     * @return 所有部门信息列表
     */
    public List<Department> selectAllDepartmentsList();

    /**
     * 通过部门名称查询部门信息
     *
     * @param departmentName 部门名称
     * @return 部门信息
     */
    public Department selectDepartmentByName(String departmentName);

    /**
     * 修改部门的信息
     *
     * @param department 部门信息
     * @return 是否成功
     */
    public Boolean updateDepartment(Department department);

    /**
     * 插入指定的部门
     *
     * @param department 部门信息
     * @return 是否成功
     */
    public Boolean insertDepartment(Department department);

    /**
     * 删除指定名字的部门
     *
     * @param deptName 部门名称
     * @return 是否成功
     */
    public Boolean deleteDepartmentByName(String deptName);
}
