
package jp.kenichi.jna.tlb.acedao;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({384D0656-2A34-36FC-AC92-F2FB3072D0F8})</p>
 */
public enum UpdateTypeEnum implements IComEnum {
    
    /**
     * (4)
     */
    dbUpdateBatch(4),
    
    /**
     * (1)
     */
    dbUpdateRegular(1),
    
    /**
     * (2)
     */
    dbUpdateCurrentRecord(2),
    ;

    private UpdateTypeEnum(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}