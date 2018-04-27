
package jp.kenichi.jna.tlb.adodb;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({00000549-0000-0010-8000-00AA006D2EA4})</p>
 */
public enum StringFormatEnum implements IComEnum {
    
    /**
     * (2)
     */
    adClipString(2),
    ;

    private StringFormatEnum(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}