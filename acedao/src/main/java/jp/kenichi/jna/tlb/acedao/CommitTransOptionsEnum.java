
package jp.kenichi.jna.tlb.acedao;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({AB46CB4A-D340-3172-B681-3204ABCA661F})</p>
 */
public enum CommitTransOptionsEnum implements IComEnum {
    
    /**
     * (1)
     */
    dbForceOSFlush(1),
    ;

    private CommitTransOptionsEnum(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}