
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({9CECDBD1-28A9-4CC6-9FE9-FD71A2BEDCCB})</p>
 */
public enum AcResourceType implements IComEnum {
    
    /**
     * (0)
     */
    acResourceTheme(0),
    
    /**
     * (1)
     */
    acResourceImage(1),
    ;

    private AcResourceType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}