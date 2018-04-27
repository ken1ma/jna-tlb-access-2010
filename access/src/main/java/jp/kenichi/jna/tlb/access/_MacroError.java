
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({22585BA1-7BD1-40AF-8095-E688176CDEB0})</p>
 */
@ComInterface(iid="{22585BA1-7BD1-40AF-8095-E688176CDEB0}")
public interface _MacroError extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x9a6)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Condition", dispId = 0x9a6)
    String getCondition();
            
    /**
     * <p>id(0x9a7)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "ActionName", dispId = 0x9a7)
    String getActionName();
            
    /**
     * <p>id(0x9a8)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "Arguments", dispId = 0x9a8)
    String getArguments();
            
    /**
     * <p>id(0x9a9)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "Description", dispId = 0x9a9)
    String getDescription();
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "Number", dispId = 0x0)
    Integer getNumber();
            
    /**
     * <p>id(0x9aa)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "MacroName", dispId = 0x9aa)
    String getMacroName();
            
    /**
     * <p>id(0x990)</p>
     * <p>vtableId(13)</p>
     * @param dispid [in] {@code Integer}
     */
    @ComMethod(name = "IsMemberSafe", dispId = 0x990)
    Boolean IsMemberSafe(Integer dispid);
            
    
}