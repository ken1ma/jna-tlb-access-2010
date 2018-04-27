
package jp.kenichi.jna.tlb.adodb;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({00000542-0000-0010-8000-00AA006D2EA4})</p>
 */
public enum GetRowsOptionEnum implements IComEnum {
    
    /**
     * (-1)
     */
    adGetRowsRest(-1),
    ;

    private GetRowsOptionEnum(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}