package com.sunshine.mallweb.controller;



import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.sunshine.mallweb.entity.ProductCategory;
import com.sunshine.mallweb.service.ProductCategoryService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * 类目表(ProcuctCategory)表控制层
 *
 * @author tanghongtao
 * @since 2021-04-13 23:12:39
 */
@CrossOrigin
@RestController
@RequestMapping("procuctCategory")
public class ProductCategoryController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private ProductCategoryService procuctCategoryService;

    /**
     * 分页查询所有数据
     *
     * @param page 分页对象
     * @param procuctCategory 查询实体
     * @return 所有数据
     */
    @GetMapping
    public R selectAll(Page<ProductCategory> page, ProductCategory procuctCategory) {
        return success(this.procuctCategoryService.page(page, new QueryWrapper<>(procuctCategory)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return success(this.procuctCategoryService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param procuctCategory 实体对象
     * @return 新增结果
     */
    @PostMapping
    public R insert(@RequestBody ProductCategory procuctCategory) {
        return success(this.procuctCategoryService.save(procuctCategory));
    }

    /**
     * 修改数据
     *
     * @param procuctCategory 实体对象
     * @return 修改结果
     */
    @PutMapping
    public R update(@RequestBody ProductCategory procuctCategory) {
        return success(this.procuctCategoryService.updateById(procuctCategory));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R delete(@RequestParam("idList") List<Long> idList) {
        return success(this.procuctCategoryService.removeByIds(idList));
    }
}