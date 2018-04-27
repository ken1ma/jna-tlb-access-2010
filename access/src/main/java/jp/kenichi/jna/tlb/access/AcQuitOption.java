
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({1451AD50-53DD-3A15-9AD4-9ABEA3E814F8})</p>
 */
public enum AcQuitOption implements IComEnum {
    
    /**
     * (0)
     */
    acQuitPrompt(0),
    
    /**
     * (1)
     */
    acQuitSaveAll(1),
    
    /**
     * (2)
     */
    acQuitSaveNone(2),
    ;

    private AcQuitOption(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}