
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({247C2FDE-B67E-3B49-9C82-A877623B9DE4})</p>
 */
public enum RefKind implements IComEnum {
    
    /**
     * (0)
     */
    TypeLib(0),
    
    /**
     * (1)
     */
    Project(1),
    ;

    private RefKind(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}