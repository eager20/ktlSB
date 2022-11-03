package eager20.ktlSB

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table


@Entity
@Table(name="items")
class Items (
    @Id
    val dealno: Long,

    @Column(name = "product")
    val product: String,

    @Column(name = "amount")
    val amount: Int,

    @Column(name = "remain")
    val remain: Int
)
//dealno INT ,
//product VARCHAR(255) ,
//amount INT ,
//remain INT