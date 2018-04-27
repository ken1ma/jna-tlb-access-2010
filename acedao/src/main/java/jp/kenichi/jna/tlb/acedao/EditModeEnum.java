
package jp.kenichi.jna.tlb.acedao;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({5EBEF31F-3496-3C51-9E36-C66DF55584D7})</p>
 */
public enum EditModeEnum implements IComEnum {
    
    /**
     * (0)
     */
    dbEditNone(0),
    
    /**
     * (1)
     */
    dbEditInProgress(1),
    
    /**
     * (2)
     */
    dbEditAdd(2),
    ;

    private EditModeEnum(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}