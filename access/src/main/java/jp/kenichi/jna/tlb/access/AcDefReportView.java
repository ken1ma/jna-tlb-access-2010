
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({B13329E7-DEC8-37F3-B8ED-135B015213AE})</p>
 */
public enum AcDefReportView implements IComEnum {
    
    /**
     * (0)
     */
    acDefViewPreview(0),
    
    /**
     * (1)
     */
    acDefViewReportBrowse(1),
    ;

    private AcDefReportView(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}