
package jp.kenichi.jna.tlb.adodb;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum BookmarkEnum implements IComEnum {
    
    /**
     * (0)
     */
    adBookmarkCurrent(0),
    
    /**
     * (1)
     */
    adBookmarkFirst(1),
    
    /**
     * (2)
     */
    adBookmarkLast(2),
    ;

    private BookmarkEnum(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}