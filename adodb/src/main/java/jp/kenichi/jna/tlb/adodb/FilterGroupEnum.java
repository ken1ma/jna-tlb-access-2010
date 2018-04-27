
package jp.kenichi.jna.tlb.adodb;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({00000546-0000-0010-8000-00AA006D2EA4})</p>
 */
public enum FilterGroupEnum implements IComEnum {
    
    /**
     * (0)
     */
    adFilterNone(0),
    
    /**
     * (1)
     */
    adFilterPendingRecords(1),
    
    /**
     * (2)
     */
    adFilterAffectedRecords(2),
    
    /**
     * (3)
     */
    adFilterFetchedRecords(3),
    
    /**
     * (4)
     */
    adFilterPredicate(4),
    
    /**
     * (5)
     */
    adFilterConflictingRecords(5),
    ;

    private FilterGroupEnum(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}