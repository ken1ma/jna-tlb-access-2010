
package jp.kenichi.jna.tlb.adodb;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({0000057D-0000-0010-8000-00AA006D2EA4})</p>
 */
public enum RecordTypeEnum implements IComEnum {
    
    /**
     * (0)
     */
    adSimpleRecord(0),
    
    /**
     * (1)
     */
    adCollectionRecord(1),
    
    /**
     * (2)
     */
    adStructDoc(2),
    ;

    private RecordTypeEnum(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}