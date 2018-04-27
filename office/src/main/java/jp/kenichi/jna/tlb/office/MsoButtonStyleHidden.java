
package jp.kenichi.jna.tlb.office;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum MsoButtonStyleHidden implements IComEnum {
    
    /**
     * (4)
     */
    msoButtonWrapText(4),
    
    /**
     * (8)
     */
    msoButtonTextBelow(8),
    ;

    private MsoButtonStyleHidden(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}