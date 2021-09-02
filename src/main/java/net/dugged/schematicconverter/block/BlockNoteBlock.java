package net.dugged.schematicconverter.block;

public class BlockNoteBlock extends Block {
	protected static final BlockProperty instrument = new BlockProperty("instrument", new String[]{"harp", "basedrum", "snare", "hat", "bass", "flute", "bell", "guitar", "chime", "xylophone", "iron_xylophone", "cow_bell", "didgeridoo", "bit", "banjo", "pling"});
	protected static final BlockProperty note = new BlockProperty("note", new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24"});
	protected static final BlockProperty powered = new BlockProperty("powered", new String[]{"false", "true"});

	public BlockNoteBlock() {
		super("note_block");
		setOldId(25);
		setOldName("noteblock");
		blockProperties.add(instrument);
		blockProperties.add(note);
		blockProperties.add(powered);
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