package net.dugged.schematicconverter.block;

public class BlockSponge extends Block {
	public BlockSponge() {
		super("sponge");
		setOldId(19);
		setOldName("sponge");
	}

	@Override
	public Block getNewBlock() {
		if (metadata == 1) {
			return new BlockWetSponge();
		} else {
			return new BlockSponge();
		}
	}

	@Override
	public Block getOldBlock() {
		return this;
	}
}