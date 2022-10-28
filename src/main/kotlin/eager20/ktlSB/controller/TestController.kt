package eager20.ktlSB.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/test")
class TestController {


    @GetMapping("/call")
    fun testcall():String{
        return "eager20";
    }
}