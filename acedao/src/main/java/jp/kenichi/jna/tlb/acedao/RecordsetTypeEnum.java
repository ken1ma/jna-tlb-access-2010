
package jp.kenichi.jna.tlb.acedao;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({B6CE0046-20C3-340F-985C-3559E85DC5E1})</p>
 */
public enum RecordsetTypeEnum implements IComEnum {
    
    /**
     * (1)
     */
    dbOpenTable(1),
    
    /**
     * (2)
     */
    dbOpenDynaset(2),
    
    /**
     * (4)
     */
    dbOpenSnapshot(4),
    
    /**
     * (8)
     */
    dbOpenForwardOnly(8),
    
    /**
     * (16)
     */
    dbOpenDynamic(16),
    ;

    private RecordsetTypeEnum(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}