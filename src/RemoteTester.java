public class RemoteTester {
	public static void main(String[] args){
		RemoteControl remote = new RemoteControl();

		Light light = new Light();
		LightOff lightOff = new LightOff(light);
		LightOn lightOn = new LightOn(light);

		remote.setCommand(0, lightOn, lightOff);

		System.out.println(remote);

		remote.offButtonPushed(0);
		remote.onButtonPushed(0);
		remote.undoButtonPushed();

	}
}
