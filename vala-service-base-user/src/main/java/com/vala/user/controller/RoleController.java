package com.vala.user.controller;

import com.vala.base.controller.BaseController;
import com.vala.user.entity.RoleBasic;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/role")
public class RoleController extends BaseController<RoleBasic> {


}
