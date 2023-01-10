package org.valrod.shared.domain;

public class IntegerMother {
    public static Integer random() {
        return MotherCreator.random().number().randomDigit();
    }
}
