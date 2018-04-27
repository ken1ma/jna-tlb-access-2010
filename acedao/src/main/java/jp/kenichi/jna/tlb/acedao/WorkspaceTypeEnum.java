
package jp.kenichi.jna.tlb.acedao;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({04465B7D-FD0C-38DF-8BA5-6DAE7B103DC9})</p>
 */
public enum WorkspaceTypeEnum implements IComEnum {
    
    /**
     * (1)
     */
    dbUseODBC(1),
    
    /**
     * (2)
     */
    dbUseJet(2),
    ;

    private WorkspaceTypeEnum(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}