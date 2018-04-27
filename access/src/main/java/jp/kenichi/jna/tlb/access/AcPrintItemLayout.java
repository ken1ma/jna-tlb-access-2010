
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({0FB9E1E6-F057-3ED0-9753-E822215C1C3C})</p>
 */
public enum AcPrintItemLayout implements IComEnum {
    
    /**
     * (1953)
     */
    acPRHorizontalColumnLayout(1953),
    
    /**
     * (1954)
     */
    acPRVerticalColumnLayout(1954),
    ;

    private AcPrintItemLayout(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}