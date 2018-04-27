
package jp.kenichi.jna.tlb.adodb;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({00000576-0000-0010-8000-00AA006D2EA4})</p>
 */
public enum StreamTypeEnum implements IComEnum {
    
    /**
     * (1)
     */
    adTypeBinary(1),
    
    /**
     * (2)
     */
    adTypeText(2),
    ;

    private StreamTypeEnum(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}