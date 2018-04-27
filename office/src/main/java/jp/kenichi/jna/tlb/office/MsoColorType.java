
package jp.kenichi.jna.tlb.office;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum MsoColorType implements IComEnum {
    
    /**
     * (-2)
     */
    msoColorTypeMixed(-2),
    
    /**
     * (1)
     */
    msoColorTypeRGB(1),
    
    /**
     * (2)
     */
    msoColorTypeScheme(2),
    
    /**
     * (3)
     */
    msoColorTypeCMYK(3),
    
    /**
     * (4)
     */
    msoColorTypeCMS(4),
    
    /**
     * (5)
     */
    msoColorTypeInk(5),
    ;

    private MsoColorType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}