package onem.dsj.generator.sys.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import onem.dsj.generator.common.plat_form_result.PlatformResult;
import onem.dsj.generator.sys.dao.EntityTableInfo;
import onem.dsj.generator.sys.service.SQLService;
import org.springframework.web.bind.annotation.*;

/**
 * @author dengshaojie
 * @date 2020/1/17 18:39
 */
@Api
@RestController
@RequestMapping
public class GeneratorController {

    private final SQLService sqlService;

    public GeneratorController(SQLService sqlService) {
        this.sqlService = sqlService;
    }

    @ApiOperation(value = "测试接口")
    @GetMapping("/helloWorld")
    public PlatformResult helloWorld() {
        return PlatformResult.success("hello world!");
    }

    @ApiOperation("建表")
    @PostMapping("/create/table")
    public PlatformResult createTable(@RequestBody EntityTableInfo info) {
        sqlService.createTable(info);
        return PlatformResult.success("建表成功！");
    }

    @ApiOperation("建序列")
    @PostMapping("/create/seq/{name}")
    public PlatformResult createSeq(@PathVariable String name) {
        sqlService.createSeq(name);
        return PlatformResult.success("序列创建成功！");
    }



}
