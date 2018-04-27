
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({81F88B69-91C4-3176-AA64-B94401E0B01A})</p>
 */
public enum AcWebBrowserScrollBars implements IComEnum {
    
    /**
     * (0)
     */
    acScrollAuto(0),
    
    /**
     * (1)
     */
    acScrollYes(1),
    
    /**
     * (2)
     */
    acScrollNo(2),
    ;

    private AcWebBrowserScrollBars(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}