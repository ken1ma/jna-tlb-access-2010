
package jp.kenichi.jna.tlb.adodb;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({00000543-0000-0010-8000-00AA006D2EA4})</p>
 */
public enum AffectEnum implements IComEnum {
    
    /**
     * (1)
     */
    adAffectCurrent(1),
    
    /**
     * (2)
     */
    adAffectGroup(2),
    
    /**
     * (3)
     */
    adAffectAll(3),
    
    /**
     * (4)
     */
    adAffectAllChapters(4),
    ;

    private AffectEnum(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}