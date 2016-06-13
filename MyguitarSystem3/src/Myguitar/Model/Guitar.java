package Myguitar.Model;

import Myguitar.Model.GuitarSpec;

public class Guitar extends GuitarSpec {
	
	private String serialNumber;
	private String price;
	GuitarSpec spec;
	
	public Guitar(String serialNumber, String price, GuitarSpec spec){
		this.setSerialNumber(serialNumber);
		this.price = price;
		this.spec = spec;
	}

	public Guitar() {
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public GuitarSpec getSpec() {
		return spec;
	}

	public void setSpec(GuitarSpec spec) {
		this.spec = spec;
	}
	
}
