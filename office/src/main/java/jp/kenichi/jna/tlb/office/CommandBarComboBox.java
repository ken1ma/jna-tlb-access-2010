
package jp.kenichi.jna.tlb.office;

import com.sun.jna.platform.win32.COM.COMException;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackCookie;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.IConnectionPoint;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.annotation.ComObject;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;

/**
 * <p>uuid({55F88897-7708-11D1-ACEB-006008961DA5})</p>
 * <p>source(_CommandBarComboBoxEvents)</p>
 * <p>interface(_CommandBarComboBox)</p>
 * <p>interface(IConnectionPoint)</p>
 */
@ComObject(clsId = "{55F88897-7708-11D1-ACEB-006008961DA5}")
public interface CommandBarComboBox extends IUnknown
    ,_CommandBarComboBox
    ,IConnectionPoint
{

}