
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({08372E8A-1B9B-35AA-87ED-41C477D0CCD2})</p>
 */
public enum AcRecord implements IComEnum {
    
    /**
     * (0)
     */
    acPrevious(0),
    
    /**
     * (1)
     */
    acNext(1),
    
    /**
     * (2)
     */
    acFirst(2),
    
    /**
     * (3)
     */
    acLast(3),
    
    /**
     * (4)
     */
    acGoTo(4),
    
    /**
     * (5)
     */
    acNewRec(5),
    ;

    private AcRecord(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}