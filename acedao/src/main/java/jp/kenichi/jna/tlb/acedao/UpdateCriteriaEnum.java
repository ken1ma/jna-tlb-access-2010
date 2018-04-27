
package jp.kenichi.jna.tlb.acedao;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({76903150-BE34-3FC0-A76F-5D6EEA439388})</p>
 */
public enum UpdateCriteriaEnum implements IComEnum {
    
    /**
     * (1)
     */
    dbCriteriaKey(1),
    
    /**
     * (2)
     */
    dbCriteriaModValues(2),
    
    /**
     * (4)
     */
    dbCriteriaAllCols(4),
    
    /**
     * (8)
     */
    dbCriteriaTimestamp(8),
    
    /**
     * (16)
     */
    dbCriteriaDeleteInsert(16),
    
    /**
     * (32)
     */
    dbCriteriaUpdate(32),
    ;

    private UpdateCriteriaEnum(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}