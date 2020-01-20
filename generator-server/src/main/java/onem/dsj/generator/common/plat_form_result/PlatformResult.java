package onem.dsj.generator.common.plat_form_result;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;
import org.springframework.http.HttpStatus;

/**
 * 平台通用返回结果（未发生异常或错误的，一般指未发生系统异常，业务异常不包含在内）
 *
 * @author zlhj
 */
@Data
@Builder
@ApiModel("统一格式的返回值")
public class PlatformResult implements Result {
    /**
     * 状态码
     */
    @ApiModelProperty(name = "状态码", value = "0为正常")
    private Integer code;
    /**
     * 响应提示语
     */
    @ApiModelProperty(name = "提示信息")
    private String msg;
    /**
     * 响应数据结果
     */

    @ApiModelProperty(name = "返回数据")
    private Object data;


    private PlatformResult() {
        this.code = ResultCode.SUCCESS.code();
        this.msg = ResultCode.SUCCESS.message();
    }

    private PlatformResult(String msg) {
        this.code = ResultCode.SUCCESS.code();
        this.msg = msg;
    }

    private PlatformResult(Object data) {
        this.code = ResultCode.SUCCESS.code();
        this.msg = ResultCode.SUCCESS.message();
        this.data = data;
    }

    private PlatformResult(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    private PlatformResult(Integer code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }


    /**
     * 成功
     *
     * @return
     */
    public static PlatformResult success() {
        return new PlatformResult();
    }

    public static PlatformResult success(String msg) {

        return new PlatformResult(msg);
    }

    public static PlatformResult success(Object data) {
        return new PlatformResult(data);
    }

    public static PlatformResult success(Integer code, String msg) {
        return new PlatformResult(code, msg);
    }

    public static PlatformResult success(Integer code, String msg, Object data) {
        return new PlatformResult(code, msg, data);
    }

    /**
     * 错误
     *
     * @param msg
     * @return
     */
    public static PlatformResult failure(String msg) {
        return new PlatformResult(-1, msg);
    }

    public static PlatformResult failure(Integer code, String msg) {
        return new PlatformResult(code, msg);
    }

    public static PlatformResult failure(Integer code, String msg, Object data) {
        return new PlatformResult(code, msg, data);
    }

    public static PlatformResult failure(ResultCode resultCode) {
        return failure(resultCode.code(), resultCode.message());
    }

    public static PlatformResult failure(ResultCode systemError, HttpStatus internalServerError) {
        return failure(systemError.code(), systemError.message());
    }
}
