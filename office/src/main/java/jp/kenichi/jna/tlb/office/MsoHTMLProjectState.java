
package jp.kenichi.jna.tlb.office;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum MsoHTMLProjectState implements IComEnum {
    
    /**
     * (1)
     */
    msoHTMLProjectStateDocumentLocked(1),
    
    /**
     * (2)
     */
    msoHTMLProjectStateProjectLocked(2),
    
    /**
     * (3)
     */
    msoHTMLProjectStateDocumentProjectUnlocked(3),
    ;

    private MsoHTMLProjectState(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}