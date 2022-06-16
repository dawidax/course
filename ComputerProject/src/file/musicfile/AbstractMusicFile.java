package file.musicfile;

import file.AbstractFile;
import file.FileType;

public abstract class AbstractMusicFile extends AbstractFile implements MusicFile{
    protected String bandName;
    protected String tittle;

    protected AbstractMusicFile(String name, int size, String bandName, String tittle) {
        super(name, size);
        this.bandName = bandName;
        this.tittle = tittle;

    }

    @Override
    public FileType getType() {
        return FileType.MUSIC;
    }
}
