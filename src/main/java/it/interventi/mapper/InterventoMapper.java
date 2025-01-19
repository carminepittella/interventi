package it.interventi.mapper;

import it.interventi.dto.InterventoDto;
import it.interventi.entity.InterventoEntity;
import org.mapstruct.Builder;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING,
        builder = @Builder(disableBuilder = true))
public interface InterventoMapper extends BaseMappingMapstruct<InterventoDto, InterventoEntity> {
}
