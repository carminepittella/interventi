package it.interventi.mapper;

import it.interventi.dto.SpecialistDto;
import it.interventi.entity.SpecialistEntity;
import org.mapstruct.Builder;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING,
        builder = @Builder(disableBuilder = true))
public interface SpecialistMapper extends BaseMappingMapstruct<SpecialistDto, SpecialistEntity> {
}
