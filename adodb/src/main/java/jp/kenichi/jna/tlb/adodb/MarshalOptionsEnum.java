
package jp.kenichi.jna.tlb.adodb;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({00000540-0000-0010-8000-00AA006D2EA4})</p>
 */
public enum MarshalOptionsEnum implements IComEnum {
    
    /**
     * (0)
     */
    adMarshalAll(0),
    
    /**
     * (1)
     */
    adMarshalModifiedOnly(1),
    ;

    private MarshalOptionsEnum(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}