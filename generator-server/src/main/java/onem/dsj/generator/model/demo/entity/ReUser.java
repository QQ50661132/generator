package onem.dsj.generator.model.demo.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 用户表
 * </p>
 *
 * @author dsj
 * @since 2020-01-17
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("RE_USER")
public class ReUser implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("USER_ID")
    private BigDecimal userId;

    /**
     * 用户名
     */
    @TableField("USER_USERNAME")
    private String userUsername;

    /**
     * 用户昵称
     */
    @TableField("USER_NICKNAME")
    private String userNickname;

    /**
     * 用户密码
     */
    @TableField("USER_PASSWORD")
    private String userPassword;

    /**
     * 用户手机
     */
    @TableField("USER_PHONE")
    private String userPhone;

    /**
     * 用户邮箱
     */
    @TableField("USER_EMAIL")
    private String userEmail;

    /**
     * 用户生日
     */
    @TableField("USER_BIRTHDAY")
    private LocalDateTime userBirthday;

    /**
     * 状态
     */
    @TableField("USER_STATUS")
    private Integer userStatus;

    /**
     * 可用状态/1可用/0不可用
     */
    @TableField("USER_USABLE")
    private Integer userUsable;

    /**
     * 创建时间
     */
    @TableField("CREATION_TIME")
    private LocalDateTime creationTime;

    /**
     * 修改时间
     */
    @TableField("MODIFICATION_TIME")
    private LocalDateTime modificationTime;

    /**
     * 删除状态
     */
    @TableField("IS_DELETE")
    private Integer isDelete;


}
