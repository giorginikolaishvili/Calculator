package com.example.demo.model;

import java.io.Serializable;

public class JsonData implements Serializable {
    private Integer param_a;
    private Integer param_b;
    private String operation;

    public void setParam_a(Integer param_a) {
        this.param_a = param_a;
    }

    public JsonData() {
    }

    public void setParam_b(Integer param_b) {
        this.param_b = param_b;

    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public Integer getParam_a() {

        return param_a;
    }

    public Integer getParam_b() {
        return param_b;
    }

    public String getOperation() {
        return operation;
    }

    public JsonData(Integer param_a, Integer param_b, String operation) {

        this.param_a = param_a;
        this.param_b = param_b;
        this.operation = operation;
    }
}
