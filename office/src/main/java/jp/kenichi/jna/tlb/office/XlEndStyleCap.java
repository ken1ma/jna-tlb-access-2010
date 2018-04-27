
package jp.kenichi.jna.tlb.office;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlEndStyleCap implements IComEnum {
    
    /**
     * (1)
     */
    xlCap(1),
    
    /**
     * (2)
     */
    xlNoCap(2),
    ;

    private XlEndStyleCap(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}