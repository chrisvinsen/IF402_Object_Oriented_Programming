package week11.christianto.ac.id.umn;

public class Cash extends Payment {
	
	public Cash(Item item) {
		super(item);
	}

	@Override
	public int pay() {
		if(isPaidOff) {
			return 0;
		}
		isPaidOff = true;
		return this.item.getPrice();
	}
	
	public String getClassName() {
		return "CASH";
	}

}
