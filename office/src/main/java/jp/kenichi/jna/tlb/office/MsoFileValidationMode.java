
package jp.kenichi.jna.tlb.office;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum MsoFileValidationMode implements IComEnum {
    
    /**
     * (0)
     */
    msoFileValidationDefault(0),
    
    /**
     * (1)
     */
    msoFileValidationSkip(1),
    ;

    private MsoFileValidationMode(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}