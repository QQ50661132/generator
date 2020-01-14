package onem.dsj.generator.demo.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;
import onem.dsj.generator.common.base_property.BaseProperty;

import java.io.Serializable;

/**
 * @author dengshaojie
 * @date 2020/1/14 15:42
 */
@Data
@TableName("RE_USER")
@KeySequence("SEQ_RE_USER")
public class UserEntity extends BaseProperty implements Serializable{

    /**
     * 主键
     */
    @TableId(value = "USER_ID",type = IdType.INPUT)
    private Long id;

    /**
     * 用户昵称 备用
     */
    @TableField(value = "USER_USERNAME")
    private String userName;
}
