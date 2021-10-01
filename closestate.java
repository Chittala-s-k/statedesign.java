package state;


public class CloseState implements State {
	Door door;
	public CloseState( Door operator ) {
		this.door = operator;
	}
	public void doorOpen() {
		
		if(door.checkCondition()) {
			System.out.println("Door is open");
			door.setState(door.getOpenState());
		}
		else {
			System.out.println("Repair Door as its broken");
			door.setState(door.getOpenState());
		}
	}

	public void doorClose() {
		// TODO Auto-generated method stub
		System.out.println("Door is closed");
//		operator.setState(operator.getCloseState());
	}

	public void doorLock() {
		// TODO Auto-generated method stub
		System.out.println("Door is locked, Kindly Unlock");

	}

	public void doorUnlock() {
		// TODO Auto-generated method stub
		System.out.println("Door is Unlocked, Kindly Lock it");
	}


	public String toString() {
		return " Closed";
	}


}
