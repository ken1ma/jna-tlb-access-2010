
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({32347668-2699-3569-A630-15F2BB8D978D})</p>
 */
public enum AcPrintDuplex implements IComEnum {
    
    /**
     * (1)
     */
    acPRDPSimplex(1),
    
    /**
     * (2)
     */
    acPRDPHorizontal(2),
    
    /**
     * (3)
     */
    acPRDPVertical(3),
    ;

    private AcPrintDuplex(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}