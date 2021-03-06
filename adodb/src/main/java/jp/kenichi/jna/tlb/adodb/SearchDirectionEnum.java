
package jp.kenichi.jna.tlb.adodb;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({00000547-0000-0010-8000-00AA006D2EA4})</p>
 */
public enum SearchDirectionEnum implements IComEnum {
    
    /**
     * (1)
     */
    adSearchForward(1),
    
    /**
     * (-1)
     */
    adSearchBackward(-1),
    ;

    private SearchDirectionEnum(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}