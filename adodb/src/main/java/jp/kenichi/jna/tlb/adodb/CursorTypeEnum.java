
package jp.kenichi.jna.tlb.adodb;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({0000051B-0000-0010-8000-00AA006D2EA4})</p>
 */
public enum CursorTypeEnum implements IComEnum {
    
    /**
     * (-1)
     */
    adOpenUnspecified(-1),
    
    /**
     * (0)
     */
    adOpenForwardOnly(0),
    
    /**
     * (1)
     */
    adOpenKeyset(1),
    
    /**
     * (2)
     */
    adOpenDynamic(2),
    
    /**
     * (3)
     */
    adOpenStatic(3),
    ;

    private CursorTypeEnum(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}