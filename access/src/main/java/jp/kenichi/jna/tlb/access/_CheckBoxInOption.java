
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.COMException;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackCookie;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.IConnectionPoint;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.annotation.ComObject;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;

/**
 * <p>uuid({BC9E435C-F037-11CD-8701-00AA003F0F07})</p>
 * <p>source(DispCheckBoxEvents)</p>
 * <p>source(_CheckBoxInOptionEvents)</p>
 * <p>interface(_Checkbox)</p>
 * <p>interface(IConnectionPoint)</p>
 */
@ComObject(clsId = "{BC9E435C-F037-11CD-8701-00AA003F0F07}")
public interface _CheckBoxInOption extends IUnknown
    ,_Checkbox
    ,IConnectionPoint
{

}