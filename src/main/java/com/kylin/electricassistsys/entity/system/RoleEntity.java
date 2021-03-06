package com.kylin.electricassistsys.entity.system;

import com.kylin.electricassistsys.entity.BaseEntity;
import com.kylin.electricassistsys.entity.enumparam.KeyValueType;
import com.kylin.electricassistsys.entity.enumparam.Status;
import com.kylin.electricassistsys.utility.FieldMeta;
import com.kylin.electricassistsys.utility.TagType;
import org.hibernate.validator.constraints.NotBlank;
import tk.mybatis.mapper.annotation.NameStyle;
import tk.mybatis.mapper.code.Style;

import javax.persistence.Table;
import javax.validation.constraints.Pattern;

/**
 * Created by hhq on 2017/11/12.
 * 角色实体
 */
@NameStyle(Style.normal)
@Table(name="Role")
public class RoleEntity extends BaseEntity
{
    @NotBlank(message = "必填项")
    @Pattern(regexp="^[a-zA-Z0-9_\\u4e00-\\u9fa5]{1,20}$",message="汉字、数字和字母构成20位以内字符")
    @FieldMeta(description = "角色名",index = 1, queryField = true ,required = true)
    private String name;

    @NotBlank(message ="必填项" )
    @FieldMeta(description = "状态",index = 2,editTagType = TagType.SELECT,keyValueType= KeyValueType.STATUS ,required = true)
    private String status;

    @FieldMeta(description = "备注",index = 3, editTagType =TagType.TEXTAREA)
    private String remark="";

    public String getStatus()
    {
        return status;
    }

    public void setStatus(String status)
    {
        this.status = status;
    }

    public String getRemark()
    {
        return remark;
    }

    public void setRemark(String remark)
    {
        this.remark = remark;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
}
