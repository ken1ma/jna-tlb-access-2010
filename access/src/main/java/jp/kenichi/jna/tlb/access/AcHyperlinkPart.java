
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({6872FF17-F6DC-3340-9143-8264B080A035})</p>
 */
public enum AcHyperlinkPart implements IComEnum {
    
    /**
     * (0)
     */
    acDisplayedValue(0),
    
    /**
     * (1)
     */
    acDisplayText(1),
    
    /**
     * (2)
     */
    acAddress(2),
    
    /**
     * (3)
     */
    acSubAddress(3),
    
    /**
     * (4)
     */
    acScreenTip(4),
    
    /**
     * (5)
     */
    acFullAddress(5),
    ;

    private AcHyperlinkPart(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}