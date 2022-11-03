package eager20.ktlSB.repository

import com.querydsl.jpa.impl.JPAQueryFactory
import eager20.ktlSB.Items
import eager20.ktlSB.QItems.items
import org.springframework.stereotype.Repository

@Repository
class ItemQDRepo (private val queryFactory: JPAQueryFactory) {

    fun findOne(id:Long):Items{
        return queryFactory.selectFrom(items).where(items.dealno.eq(id)).fetchOne()!!
    }
}