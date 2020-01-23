public class RemoteControl {
	Command[] onCommands;
	Command[] offCommands;
	Command undoCommand;

	public RemoteControl() {
		onCommands = new Command[10];
		offCommands = new Command[10];
		Command noCommand = new NoCommand();
		undoCommand = noCommand;
		for (int i = 0; i < 10; i++) {
			onCommands[i] = noCommand;
			offCommands[i] = noCommand;
		}
	}

	public void setCommand(int slot, Command onCommand, Command offCommand){
		onCommands[slot] = onCommand;
		offCommands[slot] = offCommand;
	}

	public void onButtonPushed(int slot){
		onCommands[slot].execute();
		undoCommand = onCommands[slot];
	}

	public void offButtonPushed(int slot){
		offCommands[slot].execute();
		undoCommand = offCommands[slot];
	}

	public void undoButtonPushed(){
		undoCommand.undo();
	}

	public String toString() {
		String stringToReturn = "\n     Remote Control     \n";
		for(int i = 0; i < onCommands.length; i++){
			stringToReturn += "Slot " + i + " " + onCommands[i].getClass().getName() + "     " + offCommands[i].getClass().getName() + "\n";
		}
		return stringToReturn;
	}
}
