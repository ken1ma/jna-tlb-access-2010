
package jp.kenichi.jna.tlb.adodb;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({00000526-0000-0010-8000-00AA006D2EA4})</p>
 */
public enum EditModeEnum implements IComEnum {
    
    /**
     * (0)
     */
    adEditNone(0),
    
    /**
     * (1)
     */
    adEditInProgress(1),
    
    /**
     * (2)
     */
    adEditAdd(2),
    
    /**
     * (4)
     */
    adEditDelete(4),
    ;

    private EditModeEnum(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}