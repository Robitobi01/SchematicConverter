package net.dugged.schematicconverter.block;

public class BlockRespawnAnchor extends Block {
	protected static final BlockProperty charges = new BlockProperty("charges", new String[]{"0", "1", "2", "3", "4"});

	public BlockRespawnAnchor() {
		super("respawn_anchor");
		blockProperties.add(charges);
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