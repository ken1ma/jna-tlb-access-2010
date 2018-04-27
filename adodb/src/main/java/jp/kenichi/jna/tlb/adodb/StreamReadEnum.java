
package jp.kenichi.jna.tlb.adodb;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum StreamReadEnum implements IComEnum {
    
    /**
     * (-1)
     */
    adReadAll(-1),
    
    /**
     * (-2)
     */
    adReadLine(-2),
    ;

    private StreamReadEnum(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}