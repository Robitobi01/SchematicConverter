package net.dugged.schematicconverter.block;

public class BlockPowderSnow extends Block {
	public BlockPowderSnow() {
		super("powder_snow");
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