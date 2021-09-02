package net.dugged.schematicconverter.block;

public class BlockSpawner extends Block {
	public BlockSpawner() {
		super("spawner");
		setOldId(52);
		setOldName("mob_spawner");
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