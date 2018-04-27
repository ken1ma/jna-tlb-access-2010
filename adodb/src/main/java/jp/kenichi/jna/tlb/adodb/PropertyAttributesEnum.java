
package jp.kenichi.jna.tlb.adodb;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({00000529-0000-0010-8000-00AA006D2EA4})</p>
 */
public enum PropertyAttributesEnum implements IComEnum {
    
    /**
     * (0)
     */
    adPropNotSupported(0),
    
    /**
     * (1)
     */
    adPropRequired(1),
    
    /**
     * (2)
     */
    adPropOptional(2),
    
    /**
     * (512)
     */
    adPropRead(512),
    
    /**
     * (1024)
     */
    adPropWrite(1024),
    ;

    private PropertyAttributesEnum(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}