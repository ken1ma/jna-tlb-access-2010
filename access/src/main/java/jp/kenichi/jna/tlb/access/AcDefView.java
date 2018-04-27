
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({150791A6-1314-3ED3-8EA4-001180A34D22})</p>
 */
public enum AcDefView implements IComEnum {
    
    /**
     * (0)
     */
    acDefViewSingle(0),
    
    /**
     * (1)
     */
    acDefViewContinuous(1),
    
    /**
     * (2)
     */
    acDefViewDatasheet(2),
    
    /**
     * (3)
     */
    acDefViewPivotTable(3),
    
    /**
     * (4)
     */
    acDefViewPivotChart(4),
    
    /**
     * (5)
     */
    acDefViewSplitForm(5),
    ;

    private AcDefView(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}