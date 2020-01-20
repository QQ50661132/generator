package onem.dsj.generator.common.base_property;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableLogic;
import lombok.Data;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * @author dengshaojie
 * @date 2020/1/14 16:51
 */
public abstract class BaseProperty {

    /**
     * 创建时间
     */
    @TableField(value = "CREATION_TIME", fill = FieldFill.INSERT)
    protected LocalDateTime creationTime;

    /**
     * 修改时间
     */
    @TableField(value = "MODIFICATION_TIME", fill = FieldFill.UPDATE)
    protected LocalDateTime modificationTime;

    /**
     * 逻辑删除 0：可用 1：不可用
     */
    @TableLogic
    @TableField(value = "IS_DELETE", fill = FieldFill.INSERT)
    protected Integer isDelete;

}
