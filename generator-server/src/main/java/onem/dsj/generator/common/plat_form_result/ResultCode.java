package onem.dsj.generator.common.plat_form_result;

import java.util.ArrayList;
import java.util.List;

/**
 * API 统一返回状态码
 *
 * @author zlhj
 */
public enum ResultCode {

    /** 成功状态码 */
    SUCCESS(0, "成功"),

    /** 异常状态码 */
    SYSTEM_ERROR(-1, "系统异常");

    private Integer code;

    private String message;

    ResultCode(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer code() {
        return this.code;
    }

    public String message() {
        return this.message;
    }

    public static String getMessage(String name) {
        for (ResultCode item : ResultCode.values()) {
            if (item.name().equals(name)) {
                return item.message;
            }
        }
        return name;
    }

    public static Integer getCode(String name) {
        for (ResultCode item : ResultCode.values()) {
            if (item.name().equals(name)) {
                return item.code;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return this.name();
    }

    /**
     * 校验重复的code值
     */
    public static void main(String[] args) {
        ResultCode[] resultCodes = ResultCode.values();
        List<Integer> codeList = new ArrayList<>();
        for (ResultCode resultCode : resultCodes) {
            if (codeList.contains(resultCode.code)) {
                System.out.println(resultCode.code);
            } else {
                codeList.add(resultCode.code());
            }
        }
    }
}