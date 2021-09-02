package net.dugged.schematicconverter.block;

public class BlockPointedDripstone extends Block {
	protected static final BlockProperty thickness = new BlockProperty("thickness", new String[]{"tip_merge", "tip", "frustum", "middle", "base"});
	protected static final BlockProperty vertical_direction = new BlockProperty("vertical_direction", new String[]{"up", "down"});
	protected static final BlockProperty waterlogged = new BlockProperty("waterlogged", new String[]{"false", "true"});

	public BlockPointedDripstone() {
		super("pointed_dripstone");
		blockProperties.add(thickness);
		blockProperties.add(vertical_direction);
		blockProperties.add(waterlogged);
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