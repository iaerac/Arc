package io.github.wangyuheng.arc.generator.codegen.spec;

import com.squareup.javapoet.FieldSpec;
import com.squareup.javapoet.MethodSpec;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Tests for {@link FieldSpecGenGetter}.
 *
 * @author yuheng.wang
 */
public class FieldSpecGenGetterTest {

    private final FieldSpecGenGetter genGetter = new FieldSpecGenGetter();

    @Test
    public void generate_string_getter() {
        final String expected = "public java.lang.String getAbc() {\n" +
                "  return abc;\n" +
                "}\n";

        FieldSpec fieldSpec = FieldSpec.builder(String.class, "abc").build();
        MethodSpec methodSpec = genGetter.apply(fieldSpec);
        assertEquals(expected, methodSpec.toString());
    }

    @Test
    public void generate_boolean_getter() {
        final String expected = "public java.lang.Boolean isAbc() {\n" +
                "  return abc;\n" +
                "}\n";

        FieldSpec fieldSpec = FieldSpec.builder(Boolean.class, "abc").build();
        MethodSpec methodSpec = genGetter.apply(fieldSpec);
        assertEquals(expected, methodSpec.toString());
    }

}