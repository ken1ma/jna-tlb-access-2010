
package jp.kenichi.jna.tlb.office;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum MsoFileFindListBy implements IComEnum {
    
    /**
     * (1)
     */
    msoListbyName(1),
    
    /**
     * (2)
     */
    msoListbyTitle(2),
    ;

    private MsoFileFindListBy(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}