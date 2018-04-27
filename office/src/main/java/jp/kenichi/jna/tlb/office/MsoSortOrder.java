
package jp.kenichi.jna.tlb.office;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum MsoSortOrder implements IComEnum {
    
    /**
     * (1)
     */
    msoSortOrderAscending(1),
    
    /**
     * (2)
     */
    msoSortOrderDescending(2),
    ;

    private MsoSortOrder(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}