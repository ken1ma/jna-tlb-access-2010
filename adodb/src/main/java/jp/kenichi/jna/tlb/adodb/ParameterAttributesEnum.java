
package jp.kenichi.jna.tlb.adodb;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({0000052B-0000-0010-8000-00AA006D2EA4})</p>
 */
public enum ParameterAttributesEnum implements IComEnum {
    
    /**
     * (16)
     */
    adParamSigned(16),
    
    /**
     * (64)
     */
    adParamNullable(64),
    
    /**
     * (128)
     */
    adParamLong(128),
    ;

    private ParameterAttributesEnum(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}