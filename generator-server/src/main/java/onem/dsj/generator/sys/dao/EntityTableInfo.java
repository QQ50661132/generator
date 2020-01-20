package onem.dsj.generator.sys.dao;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author dengshaojie
 * @date 2020/1/20 11:01
 */
@Data
@ApiModel("表的基础信息")
@NoArgsConstructor
public class EntityTableInfo {
    @ApiModelProperty(value = "表名")
    private String name;
    @ApiModelProperty(value = "表备注")
    private String comments;
    @ApiModelProperty(value = "属性列表")
    private List<Property> properties;
    @ApiModelProperty(value = "是否主键自增")
    private boolean isPrimaryKeyIncrement;
}
