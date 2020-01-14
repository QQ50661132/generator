package onem.dsj.generator.demo.controller;

import onem.dsj.generator.common.controller.BaseControllerImpl;
import onem.dsj.generator.common.plat_form_result.PlatformResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author dengshaojie
 * @date 2020/1/14 15:53
 */
@RestController
@RequestMapping("/user")
public class UserController extends BaseControllerImpl {

    @GetMapping("/helloWorld")
    public PlatformResult helloWorld() {
        return PlatformResult.success("hello world!!!");
    }
}
