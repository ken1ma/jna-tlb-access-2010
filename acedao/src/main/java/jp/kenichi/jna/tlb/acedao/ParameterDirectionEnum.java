
package jp.kenichi.jna.tlb.acedao;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({70E6BC1D-51E5-389E-A24E-9AC51A17EA35})</p>
 */
public enum ParameterDirectionEnum implements IComEnum {
    
    /**
     * (1)
     */
    dbParamInput(1),
    
    /**
     * (2)
     */
    dbParamOutput(2),
    
    /**
     * (3)
     */
    dbParamInputOutput(3),
    
    /**
     * (4)
     */
    dbParamReturnValue(4),
    ;

    private ParameterDirectionEnum(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}