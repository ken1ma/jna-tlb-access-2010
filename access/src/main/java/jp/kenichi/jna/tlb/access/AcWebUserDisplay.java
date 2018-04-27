
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({0B19DB0E-7719-435B-B4F6-38F2808FFBF6})</p>
 */
public enum AcWebUserDisplay implements IComEnum {
    
    /**
     * (0)
     */
    acWebUserID(0),
    
    /**
     * (1)
     */
    acWebUserName(1),
    
    /**
     * (2)
     */
    acWebUserLoginName(2),
    
    /**
     * (3)
     */
    acWebUserEmail(3),
    ;

    private AcWebUserDisplay(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}