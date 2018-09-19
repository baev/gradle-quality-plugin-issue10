package io.github.baev;

import org.mapstruct.Mapper;

/**
 * @author charlie (Dmitry Baev).
 */
@Mapper
public interface SomeClassMapper {

    SomeClassDto toDto(SomeClass someClass);

}
