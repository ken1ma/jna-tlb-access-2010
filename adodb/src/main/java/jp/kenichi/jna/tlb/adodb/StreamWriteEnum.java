
package jp.kenichi.jna.tlb.adodb;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({0000057B-0000-0010-8000-00AA006D2EA4})</p>
 */
public enum StreamWriteEnum implements IComEnum {
    
    /**
     * (0)
     */
    adWriteChar(0),
    
    /**
     * (1)
     */
    adWriteLine(1),
    
    /**
     * (0)
     */
    stWriteChar(0),
    
    /**
     * (1)
     */
    stWriteLine(1),
    ;

    private StreamWriteEnum(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}