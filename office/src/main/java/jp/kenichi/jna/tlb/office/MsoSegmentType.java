
package jp.kenichi.jna.tlb.office;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum MsoSegmentType implements IComEnum {
    
    /**
     * (0)
     */
    msoSegmentLine(0),
    
    /**
     * (1)
     */
    msoSegmentCurve(1),
    ;

    private MsoSegmentType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}