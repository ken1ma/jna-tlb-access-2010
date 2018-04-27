
package jp.kenichi.jna.tlb.office;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum MsoScriptLocation implements IComEnum {
    
    /**
     * (1)
     */
    msoScriptLocationInHead(1),
    
    /**
     * (2)
     */
    msoScriptLocationInBody(2),
    ;

    private MsoScriptLocation(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}