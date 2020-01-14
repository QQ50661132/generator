package onem.dsj.generator.common.base_property;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

import java.sql.Timestamp;

/**
 * @author dengshaojie
 * @date 2020/1/14 16:47
 */
@Data
public abstract class CreationTime {

    @TableField(value = "USER_USERNAME")
    private Timestamp creationTime;
}
