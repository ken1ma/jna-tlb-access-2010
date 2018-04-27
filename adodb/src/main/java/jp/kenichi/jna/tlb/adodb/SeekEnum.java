
package jp.kenichi.jna.tlb.adodb;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({00000552-0000-0010-8000-00AA006D2EA4})</p>
 */
public enum SeekEnum implements IComEnum {
    
    /**
     * (1)
     */
    adSeekFirstEQ(1),
    
    /**
     * (2)
     */
    adSeekLastEQ(2),
    
    /**
     * (4)
     */
    adSeekAfterEQ(4),
    
    /**
     * (8)
     */
    adSeekAfter(8),
    
    /**
     * (16)
     */
    adSeekBeforeEQ(16),
    
    /**
     * (32)
     */
    adSeekBefore(32),
    ;

    private SeekEnum(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}