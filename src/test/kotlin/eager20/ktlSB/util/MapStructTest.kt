package eager20.ktlSB.util

import eager20.ktlSB.dto.Person
import eager20.ktlSB.mapper.PersonConverter
import org.junit.jupiter.api.Test
import org.mapstruct.factory.Mappers
import java.time.LocalDate

class MapStructTest {

    @Test
    fun mapStructTest(){
        val converter = Mappers.getMapper(PersonConverter::class.java) // or PersonConverterImpl()

        val person = Person("Samuel", "Jackson", "0123 334466", LocalDate.of(1948, 12, 21))

        val personDto = converter.convertToDto(person)
        println(personDto)

        val personModel = converter.convertToModel(personDto)
        println(personModel)

    }
}