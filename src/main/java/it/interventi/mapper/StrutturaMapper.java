package it.interventi.mapper;

import it.interventi.dto.StrutturaDto;
import it.interventi.entity.StrutturaEntity;
import org.mapstruct.Builder;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING,
        builder = @Builder(disableBuilder = true))
public interface StrutturaMapper extends BaseMappingMapstruct<StrutturaDto, StrutturaEntity> {
}
