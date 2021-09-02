package net.dugged.schematicconverter.block;

public class BlockAzalea extends Block {
	public BlockAzalea() {
		super("azalea");
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