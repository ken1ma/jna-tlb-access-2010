
package jp.kenichi.jna.tlb.adodb;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({0000057A-0000-0010-8000-00AA006D2EA4})</p>
 */
public enum StreamOpenOptionsEnum implements IComEnum {
    
    /**
     * (-1)
     */
    adOpenStreamUnspecified(-1),
    
    /**
     * (1)
     */
    adOpenStreamAsync(1),
    
    /**
     * (4)
     */
    adOpenStreamFromRecord(4),
    ;

    private StreamOpenOptionsEnum(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}