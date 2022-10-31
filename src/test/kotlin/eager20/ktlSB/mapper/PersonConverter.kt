package eager20.ktlSB.mapper

import eager20.ktlSB.dto.Person
import eager20.ktlSB.dto.PersonDto
import org.mapstruct.InheritInverseConfiguration
import org.mapstruct.Mapper
import org.mapstruct.Mapping

@Mapper
interface PersonConverter {

    @Mapping(source = "phoneNumber", target = "phone")
    fun convertToDto(person: Person) : PersonDto

    @InheritInverseConfiguration
    fun convertToModel(personDto: PersonDto) : Person

}