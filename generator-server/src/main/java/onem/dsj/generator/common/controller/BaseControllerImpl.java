package onem.dsj.generator.common.controller;

import com.baomidou.mybatisplus.extension.service.IService;
import onem.dsj.generator.common.plat_form_result.PlatformResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 所有controller的基类
 *
 * @param <S>
 * @param <T>
 * @author zlhj
 */
public class BaseControllerImpl<S extends IService<T>, T> {

    @Autowired
    public S service;

    /**
     * 保存
     *
     * @param t
     * @return
     */
    @PostMapping
    public PlatformResult add(@RequestBody T t) {

        return PlatformResult.success(service.save(t));
    }

    /**
     * 批量插入
     *
     * @param list
     * @return
     */
    @PostMapping("/all")
    public PlatformResult addAll(@RequestBody List<T> list) {
        return PlatformResult.success(service.saveBatch(list));
    }

    /**
     * 根据主键删除
     *
     * @param id
     * @return
     */
    @DeleteMapping("/{id}")
    public PlatformResult delete(@PathVariable Integer id) {
        return PlatformResult.success(service.removeById(id));
    }

    /**
     * 根据主键集合批量删除
     *
     * @param ids
     * @return
     */
    @DeleteMapping
    public PlatformResult deleteAll(@RequestBody List<Integer> ids) {
        return PlatformResult.success(service.removeByIds(ids));
    }

    /**
     * 更新数据
     *
     * @param t
     * @return
     */
    @PutMapping
    public PlatformResult update(@RequestBody T t) {
        return PlatformResult.success(service.updateById(t));
    }

    /**
     * 批量更新
     *
     * @param list
     * @return
     */
    @PutMapping("/all")
    public PlatformResult updateAll(@RequestBody List<T> list) {
        return PlatformResult.success(service.updateBatchById(list));
    }

    /**
     * 根据ID获取单个对象
     *
     * @param id
     */
    @GetMapping("/{id}")
    public PlatformResult getById(@PathVariable Integer id) {

        return PlatformResult.success(service.getById(id));
    }

    /**
     * 获取所有数据
     *
     * @return
     */
    @GetMapping
    public PlatformResult getFC() {
        return PlatformResult.success(service.list());
    }

}
