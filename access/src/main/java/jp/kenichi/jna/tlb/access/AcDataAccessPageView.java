
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({A8561903-5F3F-31BF-BED3-D2CBB460F666})</p>
 */
public enum AcDataAccessPageView implements IComEnum {
    
    /**
     * (0)
     */
    acDataAccessPageBrowse(0),
    
    /**
     * (1)
     */
    acDataAccessPageDesign(1),
    ;

    private AcDataAccessPageView(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}