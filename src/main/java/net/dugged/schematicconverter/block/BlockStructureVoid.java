package net.dugged.schematicconverter.block;

public class BlockStructureVoid extends Block {
	public BlockStructureVoid() {
		super("structure_void");
		setOldId(217);
		setOldName("structure_void");
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