package eager20.ktlSB.repository

import eager20.ktlSB.Items
import org.springframework.data.repository.CrudRepository

interface ItemRespository : CrudRepository<Items, Long>