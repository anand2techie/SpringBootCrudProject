package com.spring.model;

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

    public String getVariants() {
        return variants;
    }

    public void setVariants(String variants) {
        this.variants = variants;
    }
}