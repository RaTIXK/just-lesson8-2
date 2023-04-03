package com.procject82;

public enum Gender {
    MALE("მამრობითი"), FEMALE("მდედრობითი");

    private String humanReadableName;

    Gender(String humanReadableName) {
        this.humanReadableName = humanReadableName;
    }


}
