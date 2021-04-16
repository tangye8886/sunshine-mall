package com.sunshine.uaa.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.io.Serializable;
import java.util.Date;

/**
 * (Account)表实体类
 *
 * @author tanghongtao
 * @since 2021-03-17 23:04:35
 */
@SuppressWarnings("serial")
@TableName("t_account")
public class Account extends Model<Account> {
    //标识（账户表）
    @TableId(value = "id", type = IdType.UUID)
    private String id;
    //身份证
    @TableField("id_card")
    private String idCard;
    //账户
    @TableField("login_name")
    private String loginName;
    //密码
    @TableField("password")
    private String password;
    //昵称
    @TableField("nick_name")
    private String nickName;
    //联系电话
    @TableField("phone")
    private String phone;
    //联系地址
    @TableField("address")
    private String address;
    //性别
    @TableField("gender")
    private String gender;
    //邮箱
    @TableField("email")
    private String email;
    //所属公司ID
    @TableField("org_id")
    private String orgId;

    //所属部门
    @TableField("dept_id")
    private String deptId;

    //角色
    @TableField("role_id")
    private String roleId;

    @TableField("employ_date")
    private Date employDate;

    @TableField("jobs_id")
    private String jobsId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }


    public Date getEmployDate() {
        return employDate;
    }

    public String getJobsId() {
        return jobsId;
    }

    public void setJobsId(String jobsId) {
        this.jobsId = jobsId;
    }

    public void setEmployDate(Date employDate) {
        this.employDate = employDate;
    }

    /**
     * 获取主键值
     *
     * @return 主键值
     */
    @Override
    protected Serializable pkVal() {
        return this.id;
    }
}