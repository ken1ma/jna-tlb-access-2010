
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({D2800863-7C0A-3535-942A-82678348CDD1})</p>
 */
public enum AcDisplayAs implements IComEnum {
    
    /**
     * (0)
     */
    acDisplayAsImageIcon(0),
    
    /**
     * (1)
     */
    acDisplayAsIcon(1),
    
    /**
     * (2)
     */
    acDisplayAsPaperclip(2),
    ;

    private AcDisplayAs(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}