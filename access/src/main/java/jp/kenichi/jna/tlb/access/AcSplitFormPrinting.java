
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({6DBD17A8-C56F-3CF3-8F2E-DD509BBF1A53})</p>
 */
public enum AcSplitFormPrinting implements IComEnum {
    
    /**
     * (0)
     */
    acFormOnly(0),
    
    /**
     * (1)
     */
    acGridOnly(1),
    ;

    private AcSplitFormPrinting(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}