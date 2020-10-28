package com.vala.info.controller;

import com.vala.base.controller.BaseController;
import com.vala.info.entity.TagBean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tag")
public class TagController extends BaseController<TagBean> {
}
