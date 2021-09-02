package net.dugged.schematicconverter.block;

public class BlockWetSponge extends Block {
	public BlockWetSponge() {
		super("wet_sponge");
	}

	@Override
	public Block getNewBlock() {
		return this;
	}

	@Override
	public Block getOldBlock() {
		return new BlockSponge().setMetadata(1);
	}
}