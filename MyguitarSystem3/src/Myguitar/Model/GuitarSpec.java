package Myguitar.Model;

public class GuitarSpec {
	
	private String builder;
	private String type;
	private String backWood;
	private String topWood;

	public GuitarSpec(){
	}
	
	public GuitarSpec(String builder, String type, String backWood,String topWood){
		this.builder = builder;
		this.type = type;
		this.backWood = backWood;
		this.topWood = topWood;

	}
	
	public String getBuilder() {
		return builder;
	}
	public void setBuilder(String builder) {
		this.builder = builder;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public String getBackWood() {
		return backWood;
	}

	public void setBackWood(String backWood) {
		this.backWood = backWood;
	}

	public String getTopWood() {
		return topWood;
	}

	public void setTopWood(String topWood) {
		this.topWood = topWood;
	}


	
}
