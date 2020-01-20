package onem.dsj.generator.sys.myenum;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @author dengshaojie
 * @date 2020/1/20 15:04
 */
@NoArgsConstructor
@AllArgsConstructor
public enum CascadeEnum {

    setNull(1, "ON DELETE SET NULL"),
    cascade(2, "ON DELETE CASCADE");

    @Getter
    private Integer code;

    @Getter
    private String name;

    public CascadeEnum getByCode(int i) {
        if(i == 0) {
            return null;
        }
        for (CascadeEnum value : CascadeEnum.values()) {
            if(value.code==i) {
                return value;
            }
        }
        return null;
    }

    public CascadeEnum getByName(String name) {
        if(name == null) {
            return null;
        }
        for (CascadeEnum c : CascadeEnum.values()) {
            if(c.getName().equals(name)) {
                return c;
            }
        }
        return null;
    }

}
