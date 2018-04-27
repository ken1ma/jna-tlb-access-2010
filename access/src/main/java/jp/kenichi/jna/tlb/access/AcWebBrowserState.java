
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({7BBAB27F-755D-380A-9FF3-A65FB4AE09A6})</p>
 */
public enum AcWebBrowserState implements IComEnum {
    
    /**
     * (0)
     */
    acUnintialized(0),
    
    /**
     * (1)
     */
    acLoading(1),
    
    /**
     * (2)
     */
    acLoaded(2),
    
    /**
     * (3)
     */
    acInteractive(3),
    
    /**
     * (4)
     */
    acComplete(4),
    ;

    private AcWebBrowserState(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}