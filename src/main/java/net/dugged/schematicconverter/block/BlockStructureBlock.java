package net.dugged.schematicconverter.block;

public class BlockStructureBlock extends Block {
	protected static final BlockProperty mode = new BlockProperty("mode", new String[]{"data", "save", "load", "corner"});

	public BlockStructureBlock() {
		super("structure_block");
		setOldId(255);
		setOldName("structure_block");
		mode.setMetadataIndexBit(0);
		mode.setMetadataBitCount(2);
		blockProperties.add(mode);
	}

	@Override
	public Block getNewBlock() {
		return new BlockStructureBlock().setProperty(mode.getName(), mode.getPropertyByIndex(getMetaBits(mode.getMetadataBitCount(), mode.getMetadataIndexBit())));
	}

	@Override
	public Block getOldBlock() {
		return new BlockStructureBlock().setMetadata(setMetaBits(mode.getCurrentIndex(), mode.getMetadataIndexBit()));
	}
}