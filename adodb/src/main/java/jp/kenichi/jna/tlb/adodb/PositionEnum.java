
package jp.kenichi.jna.tlb.adodb;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({00000528-0000-0010-8000-00AA006D2EA4})</p>
 */
public enum PositionEnum implements IComEnum {
    
    /**
     * (-1)
     */
    adPosUnknown(-1),
    
    /**
     * (-2)
     */
    adPosBOF(-2),
    
    /**
     * (-3)
     */
    adPosEOF(-3),
    ;

    private PositionEnum(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}