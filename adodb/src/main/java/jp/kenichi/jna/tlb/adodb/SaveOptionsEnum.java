
package jp.kenichi.jna.tlb.adodb;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({0000057C-0000-0010-8000-00AA006D2EA4})</p>
 */
public enum SaveOptionsEnum implements IComEnum {
    
    /**
     * (1)
     */
    adSaveCreateNotExist(1),
    
    /**
     * (2)
     */
    adSaveCreateOverWrite(2),
    ;

    private SaveOptionsEnum(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}