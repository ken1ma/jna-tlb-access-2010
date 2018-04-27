
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({1DA96211-F019-3ACD-BAA8-179A364477D6})</p>
 */
public enum AcFormView implements IComEnum {
    
    /**
     * (0)
     */
    acNormal(0),
    
    /**
     * (1)
     */
    acDesign(1),
    
    /**
     * (2)
     */
    acPreview(2),
    
    /**
     * (3)
     */
    acFormDS(3),
    
    /**
     * (4)
     */
    acFormPivotTable(4),
    
    /**
     * (5)
     */
    acFormPivotChart(5),
    
    /**
     * (6)
     */
    acLayout(6),
    ;

    private AcFormView(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}