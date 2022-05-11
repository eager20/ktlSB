package eager20.ktlSB.service

import org.springframework.stereotype.Component

@Component
class ServiceWork {
    fun sum(src1: Int, src2 : Int) :Int {
        return src1 + src2
    }
}