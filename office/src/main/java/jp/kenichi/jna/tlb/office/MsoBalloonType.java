
package jp.kenichi.jna.tlb.office;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum MsoBalloonType implements IComEnum {
    
    /**
     * (0)
     */
    msoBalloonTypeButtons(0),
    
    /**
     * (1)
     */
    msoBalloonTypeBullets(1),
    
    /**
     * (2)
     */
    msoBalloonTypeNumbers(2),
    ;

    private MsoBalloonType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}