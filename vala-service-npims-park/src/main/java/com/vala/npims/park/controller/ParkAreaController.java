package com.vala.npims.park.controller;

import com.vala.base.controller.BaseController;
import com.vala.npims.park.entity.Park;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/park")
public class ParkAreaController extends BaseController<Park> {
}
