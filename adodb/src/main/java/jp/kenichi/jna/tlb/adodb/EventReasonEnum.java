
package jp.kenichi.jna.tlb.adodb;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({00000531-0000-0010-8000-00AA006D2EA4})</p>
 */
public enum EventReasonEnum implements IComEnum {
    
    /**
     * (1)
     */
    adRsnAddNew(1),
    
    /**
     * (2)
     */
    adRsnDelete(2),
    
    /**
     * (3)
     */
    adRsnUpdate(3),
    
    /**
     * (4)
     */
    adRsnUndoUpdate(4),
    
    /**
     * (5)
     */
    adRsnUndoAddNew(5),
    
    /**
     * (6)
     */
    adRsnUndoDelete(6),
    
    /**
     * (7)
     */
    adRsnRequery(7),
    
    /**
     * (8)
     */
    adRsnResynch(8),
    
    /**
     * (9)
     */
    adRsnClose(9),
    
    /**
     * (10)
     */
    adRsnMove(10),
    
    /**
     * (11)
     */
    adRsnFirstChange(11),
    
    /**
     * (12)
     */
    adRsnMoveFirst(12),
    
    /**
     * (13)
     */
    adRsnMoveNext(13),
    
    /**
     * (14)
     */
    adRsnMovePrevious(14),
    
    /**
     * (15)
     */
    adRsnMoveLast(15),
    ;

    private EventReasonEnum(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}