
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.COMException;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackCookie;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.IConnectionPoint;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.annotation.ComObject;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;

/**
 * <p>uuid({AA533187-6399-4E6C-B6EC-6FC999E1C855})</p>
 * <p>interface(_SmartTagActions)</p>
 */
@ComObject(clsId = "{AA533187-6399-4E6C-B6EC-6FC999E1C855}")
public interface SmartTagActions extends IUnknown
    ,_SmartTagActions
{

}