package com.orangebearstudios.web.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@Controller
class WebController {

    @GetMapping("/")
    fun home(model: Model): String {
        model.addAttribute("canonicalUrl", "https://orangebearstudios.com/")
        return "index"
    }

    @GetMapping("/about-us")
    fun aboutUs(model: Model): String {
        model.addAttribute("canonicalUrl", "https://orangebearstudios.com/about-us")
        return "about-us"
    }

    @GetMapping("/apps/ridecare")
    fun ridecare(model: Model): String {
        model.addAttribute("canonicalUrl", "https://orangebearstudios.com/apps/ridecare")
        return "ridecare"
    }

    @GetMapping("/games/thinkfast")
    fun thinkfast(model: Model): String {
        model.addAttribute("canonicalUrl", "https://orangebearstudios.com/games/thinkfast")
        return "thinkfast"
    }

    @GetMapping("/privacy/thinkfast")
    fun thinkFastPrivacy(model: Model): String {
        model.addAttribute("canonicalUrl", "https://orangebearstudios.com/privacy/thinkfast")
        return "privacy/thinkfast"
    }
}