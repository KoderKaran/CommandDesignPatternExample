public class LightOff implements Command {
	Light light;

	public LightOff(Light newLight){
		light = newLight;
	}

	@Override
	public void execute() {
		light.off();
	}

	@Override
	public void undo() {
		light.on();
	}
}
