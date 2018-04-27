
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({D8D2E10D-AB72-3FFE-AF9D-7CC5CBF74C75})</p>
 */
public enum AcFormatConditionType implements IComEnum {
    
    /**
     * (0)
     */
    acFieldValue(0),
    
    /**
     * (1)
     */
    acExpression(1),
    
    /**
     * (2)
     */
    acFieldHasFocus(2),
    
    /**
     * (3)
     */
    acDataBar(3),
    ;

    private AcFormatConditionType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}