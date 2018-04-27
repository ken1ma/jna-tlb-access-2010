
package jp.kenichi.jna.tlb.adodb;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({00000574-0000-0010-8000-00AA006D2EA4})</p>
 */
public enum CopyRecordOptionsEnum implements IComEnum {
    
    /**
     * (-1)
     */
    adCopyUnspecified(-1),
    
    /**
     * (1)
     */
    adCopyOverWrite(1),
    
    /**
     * (4)
     */
    adCopyAllowEmulation(4),
    
    /**
     * (2)
     */
    adCopyNonRecursive(2),
    ;

    private CopyRecordOptionsEnum(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}