
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({92E510DE-F3DC-363A-9AFE-9437721973EE})</p>
 */
public enum AcView implements IComEnum {
    
    /**
     * (0)
     */
    acViewNormal(0),
    
    /**
     * (1)
     */
    acViewDesign(1),
    
    /**
     * (2)
     */
    acViewPreview(2),
    
    /**
     * (3)
     */
    acViewPivotTable(3),
    
    /**
     * (4)
     */
    acViewPivotChart(4),
    
    /**
     * (5)
     */
    acViewReport(5),
    
    /**
     * (6)
     */
    acViewLayout(6),
    ;

    private AcView(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}