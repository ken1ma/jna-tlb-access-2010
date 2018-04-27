
package jp.kenichi.jna.tlb.adodb;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({00000573-0000-0010-8000-00AA006D2EA4})</p>
 */
public enum MoveRecordOptionsEnum implements IComEnum {
    
    /**
     * (-1)
     */
    adMoveUnspecified(-1),
    
    /**
     * (1)
     */
    adMoveOverWrite(1),
    
    /**
     * (2)
     */
    adMoveDontUpdateLinks(2),
    
    /**
     * (4)
     */
    adMoveAllowEmulation(4),
    ;

    private MoveRecordOptionsEnum(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}