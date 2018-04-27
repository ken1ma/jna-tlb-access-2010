
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({DBD22EFA-2048-3AE0-9364-1B77DFFF3387})</p>
 */
public enum AcCurrentView implements IComEnum {
    
    /**
     * (0)
     */
    acCurViewDesign(0),
    
    /**
     * (1)
     */
    acCurViewFormBrowse(1),
    
    /**
     * (2)
     */
    acCurViewDatasheet(2),
    
    /**
     * (3)
     */
    acCurViewPivotTable(3),
    
    /**
     * (4)
     */
    acCurViewPivotChart(4),
    
    /**
     * (5)
     */
    acCurViewPreview(5),
    
    /**
     * (6)
     */
    acCurViewReportBrowse(6),
    
    /**
     * (7)
     */
    acCurViewLayout(7),
    ;

    private AcCurrentView(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}