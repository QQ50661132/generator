package onem.dsj.generator.sys.dao;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import onem.dsj.generator.sys.myenum.TypeEnum;

/**
 * @author dengshaojie
 * @date 2020/1/17 18:43
 */
@Data
@ApiModel("列信息")
@NoArgsConstructor
public class Property {
    @ApiModelProperty(name = "列名")
    private String name;
    @ApiModelProperty(name = "列类型")
    private TypeEnum type;
    @ApiModelProperty(name = "列备注")
    private String Comments;
    @ApiModelProperty(name = "是否不为空")
    private boolean isNotNull;
    @ApiModelProperty(name = "是否为主键")
    private boolean isPrimary;
    @ApiModelProperty(name = "是否自增")
    private boolean isIncrement;
    @ApiModelProperty(name = "是否外键")
    private boolean isForeign;
    @ApiModelProperty(name = "外间信息")
    private Foreign foreign;
    @ApiModelProperty(name = "默认表达式")
    private String defaultExpression;
}
