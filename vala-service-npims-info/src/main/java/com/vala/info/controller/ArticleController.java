package com.vala.info.controller;

import com.vala.base.controller.BaseController;
import com.vala.info.entity.ArticleBean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/article")
public class ArticleController extends BaseController<ArticleBean> {
}
