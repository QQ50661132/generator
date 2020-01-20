package onem.dsj.generator.sys.dao;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import onem.dsj.generator.sys.myenum.CascadeEnum;

/**
 * @author dengshaojie
 * @date 2020/1/20 14:59
 */
@Data
@ApiModel("外键信息")
@NoArgsConstructor
@AllArgsConstructor
public class Foreign {
    @ApiModelProperty(name = "键名")
    private String name;
    @ApiModelProperty(name = "联接的表")
    private String tableName;
    @ApiModelProperty(name = "联接的列")
    private String columnName;
    @ApiModelProperty(name = "级联删除")
    private CascadeEnum cascadeDelete;
}
