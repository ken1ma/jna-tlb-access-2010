
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({865926A1-4B99-36A6-9E97-9561690A903D})</p>
 */
public enum AcDisplayAsHyperlink implements IComEnum {
    
    /**
     * (0)
     */
    acDisplayAsHyperlinkIfHyperlink(0),
    
    /**
     * (1)
     */
    acDisplayAsHyperlinkAlways(1),
    
    /**
     * (2)
     */
    acDisplayAsHyperlinkOnScreenOnly(2),
    ;

    private AcDisplayAsHyperlink(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}