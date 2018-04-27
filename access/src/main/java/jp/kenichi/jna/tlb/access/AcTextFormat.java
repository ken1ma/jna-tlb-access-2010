
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({C8CA25CB-A193-34F4-9570-557E0C011AAB})</p>
 */
public enum AcTextFormat implements IComEnum {
    
    /**
     * (0)
     */
    acTextFormatPlain(0),
    
    /**
     * (1)
     */
    acTextFormatHTMLRichText(1),
    ;

    private AcTextFormat(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}