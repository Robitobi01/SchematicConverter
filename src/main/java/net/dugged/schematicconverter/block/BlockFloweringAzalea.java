package net.dugged.schematicconverter.block;

public class BlockFloweringAzalea extends Block {
	public BlockFloweringAzalea() {
		super("flowering_azalea");
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