
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.COMException;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackCookie;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.IConnectionPoint;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.annotation.ComObject;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;

/**
 * <p>uuid({3B06E95B-E47C-11CD-8701-00AA003F0F07})</p>
 * <p>source(DispComboBoxEvents)</p>
 * <p>source(_ComboBoxEvents)</p>
 * <p>interface(_Combobox)</p>
 * <p>interface(IConnectionPoint)</p>
 */
@ComObject(clsId = "{3B06E95B-E47C-11CD-8701-00AA003F0F07}")
public interface ComboBox extends IUnknown
    ,_Combobox
    ,IConnectionPoint
{

}