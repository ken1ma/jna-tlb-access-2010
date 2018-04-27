
package jp.kenichi.jna.tlb.acedao;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({ACA374F6-9CA0-36FC-B36D-F90FF0E8683F})</p>
 */
public enum QueryDefStateEnum implements IComEnum {
    
    /**
     * (1)
     */
    dbQPrepare(1),
    
    /**
     * (2)
     */
    dbQUnprepare(2),
    ;

    private QueryDefStateEnum(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}