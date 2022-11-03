package eager20.ktlSB.repository

import com.querydsl.jpa.impl.JPAQueryFactory
import eager20.ktlSB.Items
import eager20.ktlSB.QItems.items
import org.springframework.stereotype.Repository
import javax.persistence.EntityManager

@Repository
class ItemQDRepo(
    private val queryFactory: JPAQueryFactory,
    private val em: EntityManager
) {

    fun findOne(id:Long):Items{
        return queryFactory.selectFrom(items).where(items.dealno.eq(id)).fetchOne()!!
    }

    fun update(id:Long):Long{
        val updateedId = queryFactory.update(items).set(items.product, "eager20").execute()
        em.flush()
        em.clear()
        return updateedId
    }
}