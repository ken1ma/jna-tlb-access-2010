
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({F61EF7F1-8673-36A3-9929-E0838D193FD8})</p>
 */
public enum AcFindField implements IComEnum {
    
    /**
     * (-1)
     */
    acCurrent(-1),
    
    /**
     * (0)
     */
    acAll(0),
    ;

    private AcFindField(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}