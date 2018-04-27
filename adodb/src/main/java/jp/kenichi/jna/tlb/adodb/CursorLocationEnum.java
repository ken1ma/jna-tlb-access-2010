
package jp.kenichi.jna.tlb.adodb;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({0000052F-0000-0010-8000-00AA006D2EA4})</p>
 */
public enum CursorLocationEnum implements IComEnum {
    
    /**
     * (1)
     */
    adUseNone(1),
    
    /**
     * (2)
     */
    adUseServer(2),
    
    /**
     * (3)
     */
    adUseClient(3),
    
    /**
     * (3)
     */
    adUseClientBatch(3),
    ;

    private CursorLocationEnum(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}