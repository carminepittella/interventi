package it.interventi.mapper;

import it.interventi.dto.AziendaDto;
import it.interventi.entity.AziendaEntity;
import org.mapstruct.Builder;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING,
        builder = @Builder(disableBuilder = true))
public interface AziendaMapper extends BaseMappingMapstruct<AziendaDto, AziendaEntity> {
}
