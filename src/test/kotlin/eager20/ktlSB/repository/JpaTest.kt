package eager20.ktlSB.repository

import eager20.ktlSB.Items
import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.TestConstructor
import org.springframework.transaction.annotation.Transactional

@SpringBootTest
@TestConstructor(autowireMode = TestConstructor.AutowireMode.ALL)
class JpaTest (val itemRespository: ItemRespository, val itemsQDRepo: ItemQDRepo) {


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

    @Test
    fun jpaQueryDSLTest(){

        val Items = Items(1L, "TEST01", 3000, 50)
        itemRespository.save(Items)
        val itemOne = itemsQDRepo.findOne(1L)
        Assertions.assertThat(itemOne.dealno).isEqualTo(1)
        println(itemOne.toString())
    }


    @Test
    @Transactional
    fun jpaQueryDSLUpdateTest(){

        val Items = Items(1L, "TEST01", 3000, 50)
        itemRespository.save(Items)
        val updatedDealNo = itemsQDRepo.update(1L)

        val itemOne = itemsQDRepo.findOne(updatedDealNo)
        Assertions.assertThat(itemOne.product).isEqualTo("eager20")
        println("## RESULT=========> $itemOne")
    }
}