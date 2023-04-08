package com.ruoyi.web.controller.sport;

import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.system.service.IAthleteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author yantonghui
 * @date 2023/4/8 5:04 PM
 */
@Controller
@RequestMapping("/system/athlete")
public class AthleteController {
    @Autowired
    IAthleteService athleteService;

    @GetMapping("/athlete")
    public String athlete() {
        return "athlete/athlete";
    }

    @GetMapping("/list")
    public TableDataInfo list() {
        return null;
    }

}
