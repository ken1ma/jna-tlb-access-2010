
package jp.kenichi.jna.tlb.office;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000C03D5-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000C03D5-0000-0000-C000-000000000046}")
public interface IConverterApplicationPreferences extends IUnknown, IRawDispatchHandle {
    /**
     * <p>id(0x1)</p>
     * <p>vtableId(3)</p>
     * @param plcid [out] {@code Integer}
     */
    @ComMethod(name = "HrGetLcid", dispId = 0x1)
    com.sun.jna.platform.win32.WinNT.HRESULT HrGetLcid(VARIANT plcid);
            
    /**
     * <p>id(0x2)</p>
     * <p>vtableId(4)</p>
     * @param phwnd [out] {@code Integer}
     */
    @ComMethod(name = "HrGetHwnd", dispId = 0x2)
    com.sun.jna.platform.win32.WinNT.HRESULT HrGetHwnd(VARIANT phwnd);
            
    /**
     * <p>id(0x3)</p>
     * <p>vtableId(5)</p>
     * @param pbstrApplication [out] {@code String}
     */
    @ComMethod(name = "HrGetApplication", dispId = 0x3)
    com.sun.jna.platform.win32.WinNT.HRESULT HrGetApplication(VARIANT pbstrApplication);
            
    /**
     * <p>id(0x4)</p>
     * <p>vtableId(6)</p>
     * @param pFormat [out] {@code Integer}
     */
    @ComMethod(name = "HrCheckFormat", dispId = 0x4)
    com.sun.jna.platform.win32.WinNT.HRESULT HrCheckFormat(VARIANT pFormat);
            
    
}