public class NoCommand implements Command {
	@Override
	public void execute() {
		System.out.println("This button does nothing.");
	}

	@Override
	public void undo() {
		System.out.println("This button does nothing.");
	}
}
