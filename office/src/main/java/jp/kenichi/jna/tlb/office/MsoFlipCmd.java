
package jp.kenichi.jna.tlb.office;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum MsoFlipCmd implements IComEnum {
    
    /**
     * (0)
     */
    msoFlipHorizontal(0),
    
    /**
     * (1)
     */
    msoFlipVertical(1),
    ;

    private MsoFlipCmd(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}