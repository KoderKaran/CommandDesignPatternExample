public class LightOn implements Command{
	Light light;

	public LightOn(Light newLight){
		light = newLight;
	}

	@Override
	public void execute() {
		light.on();
	}

	@Override
	public void undo() {
		light.off();
	}
}
