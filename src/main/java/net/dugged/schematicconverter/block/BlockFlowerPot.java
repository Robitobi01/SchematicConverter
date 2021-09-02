package net.dugged.schematicconverter.block;

public class BlockFlowerPot extends Block {
	public BlockFlowerPot() {
		super("flower_pot");
		setOldId(140);
		setOldName("flower_pot");
	}

	@Override
	public Block getNewBlock() {
		return this;
	}

	@Override
	public Block getOldBlock() {
		return this;
	}
}