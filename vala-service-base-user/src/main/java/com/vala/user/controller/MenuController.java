package com.vala.user.controller;

import com.vala.base.controller.BaseController;
import com.vala.user.entity.MenuItem;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/menu")
public class MenuController extends BaseController<MenuItem> {



}
