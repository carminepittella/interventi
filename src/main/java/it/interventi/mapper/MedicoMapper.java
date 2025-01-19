package it.interventi.mapper;

import it.interventi.dto.MedicoDto;
import it.interventi.entity.MedicoEntity;
import org.mapstruct.Builder;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING,
        builder = @Builder(disableBuilder = true))
public interface MedicoMapper extends BaseMappingMapstruct<MedicoDto, MedicoEntity> {
}
