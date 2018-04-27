
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({99B394D3-1955-376C-8DDA-22B212E38AE6})</p>
 */
public enum AcImeSentenceMode implements IComEnum {
    
    /**
     * (0)
     */
    acImeSentenceModePhrasePredict(0),
    
    /**
     * (1)
     */
    acImeSentenceModePluralClause(1),
    
    /**
     * (2)
     */
    acImeSentenceModeConversation(2),
    
    /**
     * (3)
     */
    acImeSentenceModeNone(3),
    ;

    private AcImeSentenceMode(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}