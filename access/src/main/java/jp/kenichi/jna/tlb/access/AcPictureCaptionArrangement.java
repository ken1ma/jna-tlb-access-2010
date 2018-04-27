
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({B34EDF9C-128F-36F5-B94D-7458AFA78FBF})</p>
 */
public enum AcPictureCaptionArrangement implements IComEnum {
    
    /**
     * (0)
     */
    acNoPictureCaption(0),
    
    /**
     * (1)
     */
    acGeneral(1),
    
    /**
     * (2)
     */
    acTop(2),
    
    /**
     * (3)
     */
    acBottom(3),
    
    /**
     * (4)
     */
    acLeft(4),
    
    /**
     * (5)
     */
    acRight(5),
    ;

    private AcPictureCaptionArrangement(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}