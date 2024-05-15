package commandPattern;

public class Main {

	public static void main(String[] args) {
		
		AirConditioner ac=new AirConditioner();
		
		MyRemoteControl remotObject=new MyRemoteControl();
		
		remotObject.setCommand(new TurnACOffCommand(ac));
		remotObject.pressButton();
		
		//undo the last operation
		remotObject.undo();

	}

}
