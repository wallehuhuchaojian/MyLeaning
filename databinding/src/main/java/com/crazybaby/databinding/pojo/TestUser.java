package com.crazybaby.databinding.pojo;

/**
 * Created by walle on 2016/12/15.
 */

public class TestUser {
    private String name;
    private String id;

    public TestUser(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
