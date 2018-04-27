
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({8EEE4599-FE60-3B29-9C11-CE3A6CA535E3})</p>
 */
public enum AcColorIndex implements IComEnum {
    
    /**
     * (0)
     */
    acColorIndexBlack(0),
    
    /**
     * (1)
     */
    acColorIndexMaroon(1),
    
    /**
     * (2)
     */
    acColorIndexGreen(2),
    
    /**
     * (3)
     */
    acColorIndexOlive(3),
    
    /**
     * (4)
     */
    acColorIndexDarkBlue(4),
    
    /**
     * (5)
     */
    acColorIndexViolet(5),
    
    /**
     * (6)
     */
    acColorIndexTeal(6),
    
    /**
     * (7)
     */
    acColorIndexGray(7),
    
    /**
     * (8)
     */
    acColorIndexSilver(8),
    
    /**
     * (9)
     */
    acColorIndexRed(9),
    
    /**
     * (10)
     */
    acColorIndexBrightGreen(10),
    
    /**
     * (11)
     */
    acColorIndexYellow(11),
    
    /**
     * (12)
     */
    acColorIndexBlue(12),
    
    /**
     * (13)
     */
    acColorIndexFuschia(13),
    
    /**
     * (14)
     */
    acColorIndexAqua(14),
    
    /**
     * (15)
     */
    acColorIndexWhite(15),
    ;

    private AcColorIndex(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}