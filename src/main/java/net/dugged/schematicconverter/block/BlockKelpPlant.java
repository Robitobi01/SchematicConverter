package net.dugged.schematicconverter.block;

public class BlockKelpPlant extends Block {
	public BlockKelpPlant() {
		super("kelp_plant");
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