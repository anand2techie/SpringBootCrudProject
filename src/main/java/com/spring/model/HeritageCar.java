package com.spring.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

public class HeritageCar {
    private String id;
    private String variants;

    public HeritageCar(String id, String variants) {
        this.id = id;
        this.variants = variants;
    }
    
    public HeritageCar() {
		// TODO Auto-generated constructor stub
	}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty(required = true)
    @ApiModelProperty(notes = "The name of the user", required = true)
    public String getVariants() {
        return variants;
    }

    public void setVariants(String variants) {
        this.variants = variants;
    }
}