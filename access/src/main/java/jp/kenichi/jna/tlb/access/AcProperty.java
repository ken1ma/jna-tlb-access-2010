
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({B4ED5791-7C3D-3153-BB79-B40038BA385D})</p>
 */
public enum AcProperty implements IComEnum {
    
    /**
     * (0)
     */
    acPropertyEnabled(0),
    
    /**
     * (1)
     */
    acPropertyVisible(1),
    
    /**
     * (2)
     */
    acPropertyLocked(2),
    
    /**
     * (3)
     */
    acPropertyLeft(3),
    
    /**
     * (4)
     */
    acPropertyTop(4),
    
    /**
     * (5)
     */
    acPropertyWidth(5),
    
    /**
     * (6)
     */
    acPropertyHeight(6),
    
    /**
     * (7)
     */
    acPropertyForeColor(7),
    
    /**
     * (8)
     */
    acPropertyBackColor(8),
    
    /**
     * (9)
     */
    acPropertyCaption(9),
    
    /**
     * (10)
     */
    acPropertyValue(10),
    ;

    private AcProperty(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}