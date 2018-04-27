
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({8D59667F-7826-3275-BC74-017F807B8016})</p>
 */
public enum AcShowToolbar implements IComEnum {
    
    /**
     * (0)
     */
    acToolbarYes(0),
    
    /**
     * (1)
     */
    acToolbarWhereApprop(1),
    
    /**
     * (2)
     */
    acToolbarNo(2),
    ;

    private AcShowToolbar(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}