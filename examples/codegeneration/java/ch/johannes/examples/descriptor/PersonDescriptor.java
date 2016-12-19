package ch.johannes.examples.descriptor;

import ch.johannes.descriptor.ClassDescriptor;
import ch.johannes.descriptor.ClassDescriptorBuilder;
import ch.johannes.descriptor.ClassnameDescriptor;
import ch.johannes.descriptor.FieldDescriptor;
import ch.johannes.descriptor.PackageDescriptor;
import ch.johannes.descriptor.TypeDescriptor;

public class PersonDescriptor {

    public static ClassDescriptor create() {
        TypeDescriptor stringFieldType = TypeDescriptor.of(PackageDescriptor.of("java.lang"), ClassnameDescriptor.of("String"));
        ClassDescriptor personDescriptor = ClassDescriptorBuilder.with(ClassnameDescriptor.of("Person"))
                .addClassField(FieldDescriptor.of("lastname", stringFieldType))
                .addClassField(FieldDescriptor.of("firstname", stringFieldType))
                .setClassPackage(PackageDescriptor.of("ch.johannes.examples.mapper.oneone"))
                .build();

        return personDescriptor;
    }
}
