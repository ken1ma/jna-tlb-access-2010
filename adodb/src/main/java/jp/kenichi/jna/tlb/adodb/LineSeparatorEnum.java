
package jp.kenichi.jna.tlb.adodb;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({00000577-0000-0010-8000-00AA006D2EA4})</p>
 */
public enum LineSeparatorEnum implements IComEnum {
    
    /**
     * (10)
     */
    adLF(10),
    
    /**
     * (13)
     */
    adCR(13),
    
    /**
     * (-1)
     */
    adCRLF(-1),
    ;

    private LineSeparatorEnum(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}