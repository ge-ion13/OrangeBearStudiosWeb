package com.orangebearstudios.web

import com.orangebearstudios.web.controller.WebController
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.webmvc.test.autoconfigure.WebMvcTest
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.status
import kotlin.test.Test

@WebMvcTest(WebController::class)
class WebControllerTest {

    @Autowired
    lateinit var mockMvc: MockMvc

    @Test
    fun `home page loads successfully`() {
        mockMvc.perform(get("/"))
            .andExpect(status().isOk)
    }

    @Test
    fun `about us page loads successfully`() {
        mockMvc.perform(get("/about-us"))
            .andExpect(status().isOk)
    }

    @Test
    fun `thinkfast page loads successfully`() {
        mockMvc.perform(get("/games/thinkfast"))
            .andExpect(status().isOk)
    }

    @Test
    fun `ridecare page loads successfully`() {
        mockMvc.perform(get("/apps/ridecare"))
            .andExpect(status().isOk)
    }
}