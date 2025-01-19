package it.interventi.mapper;

import it.interventi.dto.UtenteDto;
import it.interventi.entity.UtenteEntity;
import org.mapstruct.Builder;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING,
        builder = @Builder(disableBuilder = true))
public interface UtenteMapper extends BaseMappingMapstruct<UtenteDto, UtenteEntity> {
}
