
package jp.kenichi.jna.tlb.adodb;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({00000554-0000-0010-8000-00AA006D2EA4})</p>
 */
public enum ADCPROP_AUTORECALC_ENUM implements IComEnum {
    
    /**
     * (0)
     */
    adRecalcUpFront(0),
    
    /**
     * (1)
     */
    adRecalcAlways(1),
    ;

    private ADCPROP_AUTORECALC_ENUM(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}