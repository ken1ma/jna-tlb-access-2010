
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({063A8DE5-E2C5-44EA-A90E-6D42207D25C8})</p>
 */
@ComInterface(iid="{063A8DE5-E2C5-44EA-A90E-6D42207D25C8}")
public interface _AutoCorrect extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x981)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "DisplayAutoCorrectOptions", dispId = 0x981)
    Boolean getDisplayAutoCorrectOptions();
            
    /**
     * <p>id(0x981)</p>
     * <p>vtableId(8)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "DisplayAutoCorrectOptions", dispId = 0x981)
    void setDisplayAutoCorrectOptions(Boolean param0);
            
    /**
     * <p>id(0x990)</p>
     * <p>vtableId(9)</p>
     * @param dispid [in] {@code Integer}
     */
    @ComMethod(name = "IsMemberSafe", dispId = 0x990)
    Boolean IsMemberSafe(Integer dispid);
            
    
}