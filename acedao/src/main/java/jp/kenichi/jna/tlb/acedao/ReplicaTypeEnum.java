
package jp.kenichi.jna.tlb.acedao;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({7AD902D0-2C9F-3A6B-A1B6-A242D1206BE9})</p>
 */
public enum ReplicaTypeEnum implements IComEnum {
    
    /**
     * (2)
     */
    dbRepMakeReadOnly(2),
    
    /**
     * (1)
     */
    dbRepMakePartial(1),
    ;

    private ReplicaTypeEnum(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}