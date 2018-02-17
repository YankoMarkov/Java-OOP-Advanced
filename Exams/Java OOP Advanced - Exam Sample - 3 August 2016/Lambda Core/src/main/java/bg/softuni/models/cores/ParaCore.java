package bg.softuni.models.cores;

public class ParaCore extends BaseCore {
	
	public ParaCore(String name, Integer durability) {
		super(name, durability);
	}
	
	@Override
	public void setDurability(Integer value) {
		super.setDurability(value / 3);
	}
}
