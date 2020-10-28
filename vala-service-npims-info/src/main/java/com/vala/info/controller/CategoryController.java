package com.vala.info.controller;

import com.vala.base.controller.BaseController;
import com.vala.info.entity.CategoryBean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/category")
public class CategoryController extends BaseController<CategoryBean> {
}
