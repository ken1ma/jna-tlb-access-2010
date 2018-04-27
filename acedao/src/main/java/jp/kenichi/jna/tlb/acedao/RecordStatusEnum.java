
package jp.kenichi.jna.tlb.acedao;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({9BC090B2-682F-3CEE-ADA0-09759ACDE44D})</p>
 */
public enum RecordStatusEnum implements IComEnum {
    
    /**
     * (0)
     */
    dbRecordUnmodified(0),
    
    /**
     * (1)
     */
    dbRecordModified(1),
    
    /**
     * (2)
     */
    dbRecordNew(2),
    
    /**
     * (3)
     */
    dbRecordDeleted(3),
    
    /**
     * (4)
     */
    dbRecordDBDeleted(4),
    ;

    private RecordStatusEnum(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}