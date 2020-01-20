package onem.dsj.generator.sys.myenum;

import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.util.StringUtils;

/**
 * @author dengshaojie
 * @date 2020/1/17 18:45
 */
@NoArgsConstructor
public enum TypeEnum {
    string(1, "nvarchar2(2000)"),
    number(2, "number"),
    whether(3, "char(10)");

    @Getter
    private Integer code;

    @Getter
    private String name;

    TypeEnum(Integer code, String name) {
        this.code = code;
        this.name = name;
    }

    public TypeEnum getByName(String name) {
        if(StringUtils.isEmpty(name)) {
            return number;
        }
        for (TypeEnum t : TypeEnum.values()) {
            if(t.getName().equals(name)) {
                return t;
            }
        }
        return null;
    }

    public TypeEnum getByCode(int code) {
        if(code == 0) {
            return null;
        }
        for (TypeEnum t : TypeEnum.values()) {
            if(t.getCode()==code) {
                return t;
            }
        }
        return null;
    }

}
