package net.dugged.schematicconverter.block;

public class BlockTwistingVinesPlant extends Block {
	public BlockTwistingVinesPlant() {
		super("twisting_vines_plant");
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