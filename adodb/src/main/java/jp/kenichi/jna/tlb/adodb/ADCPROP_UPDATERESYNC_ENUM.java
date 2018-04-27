
package jp.kenichi.jna.tlb.adodb;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({00000553-0000-0010-8000-00AA006D2EA4})</p>
 */
public enum ADCPROP_UPDATERESYNC_ENUM implements IComEnum {
    
    /**
     * (0)
     */
    adResyncNone(0),
    
    /**
     * (1)
     */
    adResyncAutoIncrement(1),
    
    /**
     * (2)
     */
    adResyncConflicts(2),
    
    /**
     * (4)
     */
    adResyncUpdates(4),
    
    /**
     * (8)
     */
    adResyncInserts(8),
    
    /**
     * (15)
     */
    adResyncAll(15),
    ;

    private ADCPROP_UPDATERESYNC_ENUM(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}