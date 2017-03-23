package problemex3_1;

public abstract class AirPlane {
	private String type;

	protected AirPlane(String type){
		this.type=type;
	}

	public String getType(){
		return type;
	}

	abstract void fly();
}
