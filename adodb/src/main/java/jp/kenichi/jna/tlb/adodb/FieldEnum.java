
package jp.kenichi.jna.tlb.adodb;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum FieldEnum implements IComEnum {
    
    /**
     * (-1)
     */
    adDefaultStream(-1),
    
    /**
     * (-2)
     */
    adRecordURL(-2),
    ;

    private FieldEnum(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}