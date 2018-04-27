
package jp.kenichi.jna.tlb.office;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum MsoBlogImageType implements IComEnum {
    
    /**
     * (1)
     */
    msoblogImageTypeJPEG(1),
    
    /**
     * (2)
     */
    msoblogImageTypeGIF(2),
    
    /**
     * (3)
     */
    msoblogImageTypePNG(3),
    ;

    private MsoBlogImageType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}