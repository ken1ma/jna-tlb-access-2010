
package jp.kenichi.jna.tlb.acedao;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({A9BE12A3-D3A1-3306-B4C3-73DC51CB7503})</p>
 */
public enum QueryDefTypeEnum implements IComEnum {
    
    /**
     * (0)
     */
    dbQSelect(0),
    
    /**
     * (224)
     */
    dbQProcedure(224),
    
    /**
     * (240)
     */
    dbQAction(240),
    
    /**
     * (16)
     */
    dbQCrosstab(16),
    
    /**
     * (32)
     */
    dbQDelete(32),
    
    /**
     * (48)
     */
    dbQUpdate(48),
    
    /**
     * (64)
     */
    dbQAppend(64),
    
    /**
     * (80)
     */
    dbQMakeTable(80),
    
    /**
     * (96)
     */
    dbQDDL(96),
    
    /**
     * (112)
     */
    dbQSQLPassThrough(112),
    
    /**
     * (128)
     */
    dbQSetOperation(128),
    
    /**
     * (144)
     */
    dbQSPTBulk(144),
    
    /**
     * (160)
     */
    dbQCompound(160),
    ;

    private QueryDefTypeEnum(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}