package it.interventi.mapper;

import it.interventi.dto.TipoImpiantoDto;
import it.interventi.entity.TipoImpiantoEntity;
import org.mapstruct.Builder;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING,
        builder = @Builder(disableBuilder = true))
public interface TipoImpiantoMapper extends BaseMappingMapstruct<TipoImpiantoDto, TipoImpiantoEntity> {
}
