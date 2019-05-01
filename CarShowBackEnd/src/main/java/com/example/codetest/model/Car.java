package com.example.codetest.model;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private String make;
    private String model;
    private List<String> shows;

    public Car(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

	public List<String> getShows() {
		if (null==this.shows) this.shows = new ArrayList<String>();
		return this.shows;
	}


	@Override
	public String toString() {
		return "Car [make=" + make + ", model=" + model + "]";
	}
    

    
}
