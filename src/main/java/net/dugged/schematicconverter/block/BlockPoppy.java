package net.dugged.schematicconverter.block;

public class BlockPoppy extends Block {
	public BlockPoppy() {
		super("poppy");
		setOldId(38);
		setOldName("red_flower");
	}

	@Override
	public Block getNewBlock() {
		switch (metadata) {
			case 1:
				return new BlockBlueOrchid();
			case 2:
				return new BlockAllium();
			case 3:
				return new BlockAzureBluet();
			case 4:
				return new BlockRedTulip();
			case 5:
				return new BlockOrangeTulip();
			case 6:
				return new BlockWhiteTulip();
			case 7:
				return new BlockPinkTulip();
			case 8:
				return new BlockOxeyeDaisy();
			default:
				return new BlockPoppy();
		}
	}

	@Override
	public Block getOldBlock() {
		return this;
	}
}