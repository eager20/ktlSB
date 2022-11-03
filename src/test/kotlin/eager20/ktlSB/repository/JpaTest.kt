package eager20.ktlSB.repository

import eager20.ktlSB.Items
import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.TestConstructor

@SpringBootTest
@TestConstructor(autowireMode = TestConstructor.AutowireMode.ALL)
class JpaTest (val itemRespository: ItemRespository) {


    @Test
    fun jpaTest(){
        val count = itemRespository.count()

        Assertions.assertThat(count).isEqualTo(0)
    }


    @Test
    fun jpaInsertTest(){

        val Items = Items(1L, "TEST01", 3000, 50)
        itemRespository.save(Items)
        val count = itemRespository.count()

        Assertions.assertThat(count).isEqualTo(1)

        val checkitem = itemRespository.findById(1L)
        println(checkitem.get().product)
    }
}