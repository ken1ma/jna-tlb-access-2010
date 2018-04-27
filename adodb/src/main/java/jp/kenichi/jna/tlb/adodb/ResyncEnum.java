
package jp.kenichi.jna.tlb.adodb;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({00000544-0000-0010-8000-00AA006D2EA4})</p>
 */
public enum ResyncEnum implements IComEnum {
    
    /**
     * (1)
     */
    adResyncUnderlyingValues(1),
    
    /**
     * (2)
     */
    adResyncAllValues(2),
    ;

    private ResyncEnum(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}