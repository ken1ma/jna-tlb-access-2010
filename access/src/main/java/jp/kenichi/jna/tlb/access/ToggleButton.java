
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.COMException;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackCookie;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.IConnectionPoint;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.annotation.ComObject;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;

/**
 * <p>uuid({3B06E961-E47C-11CD-8701-00AA003F0F07})</p>
 * <p>source(DispToggleButtonEvents)</p>
 * <p>source(_ToggleButtonEvents)</p>
 * <p>interface(_ToggleButton)</p>
 * <p>interface(IConnectionPoint)</p>
 */
@ComObject(clsId = "{3B06E961-E47C-11CD-8701-00AA003F0F07}")
public interface ToggleButton extends IUnknown
    ,_ToggleButton
    ,IConnectionPoint
{

}