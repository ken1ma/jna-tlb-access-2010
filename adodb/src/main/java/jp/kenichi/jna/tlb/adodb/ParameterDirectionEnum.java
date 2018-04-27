
package jp.kenichi.jna.tlb.adodb;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({0000052C-0000-0010-8000-00AA006D2EA4})</p>
 */
public enum ParameterDirectionEnum implements IComEnum {
    
    /**
     * (0)
     */
    adParamUnknown(0),
    
    /**
     * (1)
     */
    adParamInput(1),
    
    /**
     * (2)
     */
    adParamOutput(2),
    
    /**
     * (3)
     */
    adParamInputOutput(3),
    
    /**
     * (4)
     */
    adParamReturnValue(4),
    ;

    private ParameterDirectionEnum(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}