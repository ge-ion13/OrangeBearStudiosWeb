package com.orangebearstudios.web.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class WebController {

    @GetMapping("/")
    fun home(): String = "index"

    @GetMapping("/about-us")
    fun aboutUs(): String = "about-us"

    @GetMapping("/apps/ridecare")
    fun ridecare(): String = "ridecare"

    @GetMapping("/games/thinkfast")
    fun thinkfast(): String = "thinkfast"

    @GetMapping("/privacy/thinkfast")
    fun thinkFastPrivacy(): String {
        return "privacy/thinkfast"
    }

}