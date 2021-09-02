package net.dugged.schematicconverter.block;

public class BlockWeepingVinesPlant extends Block {
	public BlockWeepingVinesPlant() {
		super("weeping_vines_plant");
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