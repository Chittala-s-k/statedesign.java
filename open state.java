package state;

public class OpenState implements State {
	
	Door door;
	public OpenState(Door operator ) {
		this.door = operator;
	}
	public void doorOpen() {
		// TODO Auto-generated method stub
		System.out.println("Door is Open!");
	}


	public void doorClose() {
		// TODO Auto-generated method stub
		System.out.println("Door is Closed");
		door.setState(door.getCloseState());
	}


	public void doorLock() {
		// TODO Auto-generated method stub
		System.out.println("Door is locked");
		door.setState(door.getCloseState());
		door.checkCondition();
		

	}

	public void doorUnlock() {
		System.out.println("Door is unlocked");
		if(door.checkCondition()) {
			door.setState(door.getUnlockState());
			door.checkCondition();
			
		}
		else {
			door.setState(door.getCloseState());
		}

	}


	public String toString() {
		return " in Open state";
	}

	

}
