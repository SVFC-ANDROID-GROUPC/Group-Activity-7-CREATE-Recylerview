package com.example.groupact5_androidgetterandsetter.universitypage;

public class University {
    private String name;
    private String type;

    public University(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public University() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
