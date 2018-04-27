
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({E27A992E-A330-11D0-81DD-00C04FC2F51B})</p>
 */
@ComInterface(iid="{E27A992E-A330-11D0-81DD-00C04FC2F51B}")
public interface FormatConditions extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x7d5)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Application", dispId = 0x7d5)
    Application getApplication();
            
    /**
     * <p>id(0x827)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x827)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(9)</p>
     * @param Index [in] {@code Object}
     */
    @ComProperty(name = "Item", dispId = 0x0)
    _FormatCondition getItem(Object Index);
            
    /**
     * <p>id(0x7d1)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "Count", dispId = 0x7d1)
    Integer getCount();
            
    /**
     * <p>id(0x88f)</p>
     * <p>vtableId(11)</p>
     * @param Type [in] {@code AcFormatConditionType}
     * @param Operator [in, optional] {@code AcFormatConditionOperator}
     * @param Expression1 [in, optional] {@code Object}
     * @param Expression2 [in, optional] {@code Object}
     */
    @ComMethod(name = "Add", dispId = 0x88f)
    _FormatCondition Add(AcFormatConditionType Type,
            AcFormatConditionOperator Operator,
            Object Expression1,
            Object Expression2);
            
    /**
     * <p>id(0x80f)</p>
     * <p>vtableId(12)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x80f)
    void Delete();
            
    /**
     * <p>id(0x990)</p>
     * <p>vtableId(14)</p>
     * @param dispid [in] {@code Integer}
     */
    @ComMethod(name = "IsMemberSafe", dispId = 0x990)
    Boolean IsMemberSafe(Integer dispid);
            
    
}