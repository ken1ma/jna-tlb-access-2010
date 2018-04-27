
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({2427AA57-85E2-3CDE-AAE0-318C506C249B})</p>
 */
public enum AcImeMode implements IComEnum {
    
    /**
     * (0)
     */
    acImeModeNoControl(0),
    
    /**
     * (1)
     */
    acImeModeOn(1),
    
    /**
     * (2)
     */
    acImeModeOff(2),
    
    /**
     * (3)
     */
    acImeModeDisable(3),
    
    /**
     * (4)
     */
    acImeModeHiragana(4),
    
    /**
     * (5)
     */
    acImeModeKatakana(5),
    
    /**
     * (6)
     */
    acImeModeKatakanaHalf(6),
    
    /**
     * (7)
     */
    acImeModeAlphaFull(7),
    
    /**
     * (8)
     */
    acImeModeAlpha(8),
    
    /**
     * (9)
     */
    acImeModeHangulFull(9),
    
    /**
     * (10)
     */
    acImeModeHangul(10),
    ;

    private AcImeMode(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}