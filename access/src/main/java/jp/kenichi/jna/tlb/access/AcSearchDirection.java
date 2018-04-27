
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({D7099FD2-1399-3122-8535-E7D7ED1D1FA1})</p>
 */
public enum AcSearchDirection implements IComEnum {
    
    /**
     * (0)
     */
    acUp(0),
    
    /**
     * (1)
     */
    acDown(1),
    
    /**
     * (2)
     */
    acSearchAll(2),
    ;

    private AcSearchDirection(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}