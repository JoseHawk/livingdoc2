package org.livingdoc.fixture.converter

import org.livingdoc.fixture.api.converter.ConversionException
import org.livingdoc.fixture.api.converter.TypeConverter
import java.lang.reflect.AnnotatedElement


open class CharacterConverter : TypeConverter<Char> {

    override fun convert(value: String, element: AnnotatedElement?): Char {
        if (value.length != 1) {
            throw ConversionException("not a char value: '$value'")
        }
        return value[0]
    }

}