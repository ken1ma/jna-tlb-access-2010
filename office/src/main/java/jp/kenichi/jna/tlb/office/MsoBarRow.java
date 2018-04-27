
package jp.kenichi.jna.tlb.office;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum MsoBarRow implements IComEnum {
    
    /**
     * (0)
     */
    msoBarRowFirst(0),
    
    /**
     * (-1)
     */
    msoBarRowLast(-1),
    ;

    private MsoBarRow(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}